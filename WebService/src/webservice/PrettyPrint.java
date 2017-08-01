// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 22/03/2016 08:34:18
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   PrettyPrint.java

package webservice;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class PrettyPrint
{

    public PrettyPrint()
    {
    }

    public static String print(String input, int indent)
    {
        try
        {
            javax.xml.transform.Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", Integer.valueOf(indent));
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty("indent", "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public static String print(String input)
    {
        return print(input, 2);
    }

    public static XMLGregorianCalendar formataData(Date data)
    {
        try
        {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(data);
            String DATE_FORMAT = "yyyy-MM-dd'T'hh:MM:ss";
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
            DatatypeFactory dtf = DatatypeFactory.newInstance();
            XMLGregorianCalendar xgc = dtf.newXMLGregorianCalendar();
            xgc.setYear(gc.get(1));
            xgc.setDay(gc.get(5));
            xgc.setMonth(gc.get(2) + 1);
            xgc.setHour(gc.get(11));
            xgc.setMinute(gc.get(12));
            xgc.setSecond(gc.get(13));
            xgc.setTimezone(0x80000000);
            return xgc;
        }
        catch(DatatypeConfigurationException ex)
        {
            Logger.getLogger(PrettyPrint.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String ler(File arquivo)
    {
        StringBuilder sb = new StringBuilder();
        try
        {
            FileReader reader = new FileReader(arquivo);
            int c;
            do
            {
                c = reader.read();
                if(c != -1)
                    sb.append((char)c);
            } while(c != -1);
            reader.close();
        }
        catch(IOException e) { }
        return sb.toString();
    }
    
    public static String getName()
    {
    	return "PrettyPrint"; 
    }
}