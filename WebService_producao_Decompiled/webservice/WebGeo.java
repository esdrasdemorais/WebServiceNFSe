// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 28/03/2016 11:55:36
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   WebGeo.java

package webservice;

import java.io.*;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class WebGeo
{

    public WebGeo()
    {
    }

    public static void teste(String args[])
        throws Exception
    {
        String local = "http://webgeo.guarulhos.sp.gov.br/WebService/Geo.php";
        Call call = (Call)(new Service()).createCall();
        call.setTargetEndpointAddress(local);
        call.setOperationName("consultarDadosGeo");
        FileInputStream stream = new FileInputStream("c:\\polivalente\\requisicao_cep.txt");
        InputStreamReader iStream = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(iStream);
        String cep = null;
        String ret = null;
        FileOutputStream fSaida = new FileOutputStream("c:\\polivalente\\cep.txt");
        while((cep = reader.readLine()) != null) 
        {
            Object param[] = {
                cep
            };
            fSaida.write(((String)call.invoke(param)).getBytes());
        }
    }
}