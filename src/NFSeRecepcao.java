import java.io.BufferedReader;  
import java.io.InputStreamReader;  
import java.io.OutputStream;  
import java.net.HttpURLConnection;  
import java.net.URL;  
  
/**  
* Envio do XML da NFS-e. 
*    
* @author Copyright (c) 2013 Maciel Gonçalves  
*   
* Este programa é software livre, você pode redistribuí-lo e ou modificá-lo  
* sob os termos da Licença Pública Geral GNU como publicada pela Free  
* Software Foundation, tanto a versão 2 da Licença, ou (a seu critério)  
* qualquer versão posterior.  
*   
* http://www.gnu.org/licenses/gpl.txt  
*   
*/  
public class NFSeRecepcao {  
    private static final String WS_NAME = "#RecepcionarLoteRpsService";  
      
    public String execute(String xml, URL url) {  
        StringBuilder pacoteSoap = null;   
        String line = null;  
  
        try {  
            HttpURLConnection con = (HttpURLConnection) url.openConnection();  
  
            con.setRequestProperty("Content-type", "text/xml; charset=ISO-8859-1");  
            con.setRequestProperty("SOAPAction", url.toString() + WS_NAME);  
  
            con.setRequestMethod("POST");  
            con.setDoOutput(true);  
            con.setDoInput(true);  
  
            xml = removeHeaderXML(xml);  
            pacoteSoap = new StringBuilder();  
            pacoteSoap.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  
            pacoteSoap.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" ");   
            pacoteSoap.append("xmlns:xd=\"http://www.w3.org/2000/09/xmldsig#\">");  
            pacoteSoap.append("<soapenv:Header/>");  
            pacoteSoap.append("<soapenv:Body>");  
            pacoteSoap.append(xml);  
            pacoteSoap.append("</soapenv:Body>");  
            pacoteSoap.append("</soapenv:Envelope>");  
            
            OutputStream reqStream = con.getOutputStream();  
            reqStream.write(pacoteSoap.toString().getBytes());  
  
            StringBuilder xmlRetorno = new StringBuilder();  


            BufferedReader retornoWs = new BufferedReader(new InputStreamReader(con.getInputStream()));  
            while ((line = retornoWs.readLine()) != null) {  
                xmlRetorno.append(line);  
            }  
            retornoWs.close();  
            con.disconnect();  
  
            return removeEnvelopSoap(xmlRetorno.toString());  
        } catch (Exception e) {  
            error("| " + e.getMessage());  
        }  
        return "";  
    }  
  
    public static String removeHeaderXML(String xml) {  
        if ((xml != null) && (!"".equals(xml))) {  
            xml = xml.replaceAll("utf", "UTF");  
            xml = xml.replaceAll(" standalone=\"no\"", "");  
            xml = xml.replaceAll("<\\?xml version=\"1.0\" encoding=\"UTF-8\"\\?>", "");  
        }  
        return xml;  
    }  
      
    public static String removeEnvelopSoap(String xml) {  
        if ((xml != null) && (!"".equals(xml))) {  
            xml = xml.replaceAll("<env:Envelope xmlns:env='http://schemas.xmlsoap.org/soap/envelope/'>", "");  
            xml = xml.replaceAll("<env:Header></env:Header><env:Body>", "");  
            xml = xml.replaceAll("</env:Body></env:Envelope>", "");  
            xml = xml.replaceAll("ns1:", "");  
            xml = xml.replaceAll("ns2:", "");  
            xml = xml.replaceAll("ns3:", "");  
            xml = xml.replaceAll("ns4:", "");  
        }  
        return xml;  
    }  
  
    private static void error(String error) {  
        System.out.println("ERROR: " + error);  
    }  
  
}  