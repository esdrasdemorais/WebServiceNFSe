import java.io.BufferedReader;  
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;  
import java.io.FileReader;  
import java.io.IOException;  
import java.net.URL;  
import java.security.KeyStore;  
import java.security.PrivateKey;  
import java.security.Provider;  
import java.security.Security;  
import java.security.cert.X509Certificate;  
import java.util.ArrayList;  
import java.util.Enumeration;  
  
import javax.xml.stream.XMLInputFactory;  
import javax.xml.stream.XMLStreamReader;  
import javax.xml.stream.XMLStreamWriter;  
  
import org.apache.axis.Message;  
import org.apache.axis.client.Call;  
import org.apache.axis.client.Service;  
import org.apache.axis.message.SOAPEnvelope;  
//import org.apache.commons.httpclient.protocol.Protocol;  

import br.com.ginfes.producao.ServiceGinfesImplServiceCallbackHandler;
import br.com.ginfes.producao.ServiceGinfesImplServiceStub;
import br.com.ginfes.producao._ServiceGinfesImplBindingStub;  
//import br.inf.portalfiscal.www.nfe.wsdl.WebService.SocketFactoryDinamico;  
import br.com.ginfes.producao._ServiceGinfesImplService;
import webservice.PrettyPrint;


public class WebServiceRecepcionarLoteRps {

    /** 
     * Conecta o servidor e envia a requisição para ser processada. 
     *  
     * @param a3 
     *            Indica o tipo de certificado utilizado, se for true, o 
     *            certificado é do tipo A3 caso contrário o certificado é do 
     *            tipo A1 
     * @param log 
     *            Indica se será logado o pocesso de conexão com o Web Services 
     * @param pathCertificado 
     *            Certificado PFX do cliente 
     * @param keyStore 
     *            KeyStore com a cadeia de certificados do java. 
     * @param endpoint 
     *            Endereço do Web Service 
     * @param arquivoXml 
     *            Arquivo que será enviado para o WebServices 
     * @throws Throwable 
     *             Lança um erro caso ocorra uma exceção. 
     */  
    public String connectTransmitir(boolean a3, boolean log,  
            String pathCertificado, String keyStore, String endpoint,  
            String arquivoXml, String senhaCertificado, String method)  
            throws Throwable {  
        URL url = new URL(  
                "https://producao.ginfes.com.br/ServiceGinfesImpl?wsdl");  
        // Habilita os logs do java para analise da carga da cadeia de  
        // certificados.  
        if (log) {  
            System.setProperty(  
                    "com.sun.xml.ws.transport.https.client.HttpTransportPipe.dump",  
                    "true");  
            System.setProperty(  
                    "com.sun.xml.ws.transport.https.HttpAdapter.dump", "true");  
            System.setProperty("javax.net.debug", "ssl");  
        }  
  
        // Verifica se é um certificado A3  
        if (a3) {  
            /*System.out.println("A3:::::::::::::::::::::::::::::::::::::::::::"); 
            Provider p = new sun.security.pkcs11.SunPKCS11("C:\\sigi_temp\\"+"ConfiguracaoCertificadoA3.cfg");   
            Security.addProvider(p);   
            char[] pin = "1234".toCharArray();   
            KeyStore ks = KeyStore.getInstance("pkcs11");   
            ks.load(null, pin);   
 
 
            String alias = "";   
            Enumeration<String> aliasesEnum = ks.aliases();   
            while (aliasesEnum.hasMoreElements()) {   
                alias = (String) aliasesEnum.nextElement();   
                if (ks.isKeyEntry(alias)) break;   
            }   
            X509Certificate certificate = (X509Certificate) ks.getCertificate(alias);   
            PrivateKey privateKey = (PrivateKey) ks.getKey(alias, "1234".toCharArray());   
            SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey);   
            socketFactoryDinamico.setFileCacerts("C:\\sigi_temp\\"+ "keystore.jks");   
 
            Protocol protocol = new Protocol("https", socketFactoryDinamico, 443);     
            Protocol.registerProtocol("https", protocol);  */  
            Provider p = new sun.security.pkcs11.SunPKCS11("C:\\sigi_temp\\"+"ConfiguracaoCertificadoA3.cfg");    
            Security.addProvider(p);    
            KeyStore ks = KeyStore.getInstance("pkcs11");    
            char[] pin = "1234".toCharArray();   
            ks.load(null, pin);    
  
            System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");    
            System.setProperty("javax.net.ssl.keyStoreType", ks.getType());    
            System.setProperty("javax.net.ssl.keyStorePassword", "1234");    
        }  
        // Caso contrário é um certificado A1  
        else {
  
            System.setProperty("java.protocol.handler.pkgs",  
                    "com.sun.net.ssl.internal.www.protocol");  
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
  
            System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");  
  
            System.clearProperty("javax.net.ssl.keyStore");  
            System.clearProperty("javax.net.ssl.keyStorePassword");  
            System.clearProperty("javax.net.ssl.trustStore");  
  
            System.setProperty("javax.net.ssl.keyStore", pathCertificado);  
            System.setProperty("javax.net.ssl.keyStorePassword",  
                    senhaCertificado);  
  
        }  
          
            FileInputStream is = new FileInputStream(arquivoXml);  
            byte[] bytes = new byte[is.available()];  
            is.read(bytes);  
            String xml = new String(bytes); 
            		
            /*String cabecalho = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";  
            cabecalho += "<ns2:cabecalho versao=\"3\" xmlns:ns2=\"http://www.ginfes.com.br/cabecalho_v03.xsd\">";  
            cabecalho += "<versaoDados>3</versaoDados>";  
            cabecalho += "</ns2:cabecalho>";*/  
            File fCabecalho = new File("C:\\Ginfes\\Schemas\\cabecalho_v03.xml");
            
            String retorno = null;  
            String resultado = null;  
            boolean erro = false;  
            URL endpointURL = new URL("https://producao.ginfes.com.br/ServiceGinfesImpl?wsdl");  
//            _ServiceGinfesImplBindingStub stub = new _ServiceGinfesImplBindingStub(endpointURL, null);
            System.out.println(xml);
System.exit(0);
            //resultado  = stub.recepcionarLoteRpsV3(PrettyPrint.ler(fCabecalho), xml);
            ServiceGinfesImplServiceStub.RecepcionarLoteRpsV3 dadosMsg = new ServiceGinfesImplServiceStub.RecepcionarLoteRpsV3();
            dadosMsg.setArg0(PrettyPrint.ler(fCabecalho));
            dadosMsg.setArg1(xml);
            ServiceGinfesImplServiceStub stub = new ServiceGinfesImplServiceStub();
            ServiceGinfesImplServiceStub.RecepcionarLoteRpsV3Response result = stub.recepcionarLoteRpsV3(dadosMsg);
            
            System.out.println(result);
             try{ String xmlOriginal =  resultado;
               
             // Aqui você vai guardar os codigos dos retornos  
             ArrayList<Integer> cStats = new ArrayList<Integer>();  
             ArrayList<String> xMotivos = new ArrayList<String>();  
               
             // Auxiliar  
             String xmlAux = xmlOriginal;   
              
             // Enquanto possuir alguma tag de status  
             while(xmlAux.indexOf("</ns2:Codigo>")!=-1){  
  
                 // Obtem o index inicial do codigo  
                 int inicioNum = xmlAux.indexOf("<ns2:Codigo>")+"<ns2:Codigo>".length();  
  
                 // Index final do codigo  
                 int finalNum = xmlAux.indexOf("</ns2:Codigo>");  
  
                 // Salva o codigo em String  
                 String sStatus = xmlAux.substring(inicioNum,finalNum);  
  
                 // Converte para int e adiciona ao array  
                 cStats.add(Integer.parseInt(sStatus.replace("E", "")));  
  
                 // Retira a parte que já foi lida da var auxiliar  
                 xmlAux = xmlAux.substring(xmlAux.indexOf("</ns2:Codigo>")+"</ns2:Codigo>".length());  
  
         }  
               
              
             // Reseta a auxiliar  
             xmlAux = xmlOriginal;   
              
             // Enquanto possuir alguma tag de motivo  
             // Enquanto possuir alguma tag de motivo  
             while(xmlAux.indexOf("</ns2:Mensagem>")!=-1){  
  
                     // Obtem o index inicial do codigo  
                     int inicioNum = xmlAux.indexOf("<ns2:Mensagem>")+"<ns2:Mensagem>".length();  
  
                     // Index final do codigo  
                     int finalNum = xmlAux.indexOf("</ns2:Mensagem>");  
  
                     // Salva o codigo em String  
                     String sMotivo = xmlAux.substring(inicioNum,finalNum);  
  
                     // Converte para int e adiciona ao array  
                     xMotivos.add(sMotivo);  
  
                     // Retira a parte que já foi lida da var auxiliar  
                     xmlAux = xmlAux.substring(xmlAux.indexOf("</ns2:Mensagem>")+"</ns2:Mensagem>".length());  
             }  
  
  
             for (int j=0;j<cStats.size();j++){  
             System.out.println("Stats.: " + cStats.get(j) + " - Motivo.: " + xMotivos.get(j) ) ;  
              
            retorno =  "\nCódigo do Status: " + cStats.get(j) + " | Motivo.: " + xMotivos.get(j);  
             }  
             }  
             catch(Exception err){  
                 err.printStackTrace();  
             }  
  
             System.out.println("aki " + retorno);  
            return retorno;  
    } 
	
}
