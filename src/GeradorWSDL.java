import java.security.Security;

import org.apache.axis.wsdl.WSDL2Java;

public class GeradorWSDL {  
      
    /*Classe que se comunica com a nfe e gera as classes a partir do wsdl*/  
        
    public static void main(String[] args) {                       
        //homologa��o  
        String producao = "https://producao.ginfes.com.br/ServiceGinfesImpl?wsdl";    
  
        GeradorWSDL gerador = new GeradorWSDL();    
        gerador.setProperties(); //tem informa��es de certificado e caminho.       
        gerador.geraWSDL(producao, "producao");    
    }    
    
    public void geraWSDL(String wsdl, String pack) {    
          /*mesma coisa que o wsimport faz*/  
        WSDL2Java.main(new String[] { wsdl, "-o", "src", "-p",    
                "br.com.ginfes." + pack });    
        System.out.println("*** Gera��o conclu�da ***");    
    }
  
    public void setProperties() {    
        /*Obtem informa��es do certificado � foi criado uma classe s� para autentica��o*/  
        System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");  
        System.setProperty("java.protocol.handler.pkgs",  
        "com.sun.net.ssl.internal.www.protocol");  
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
              
        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");    
        System.setProperty("javax.net.ssl.keyStore", "C:\\Ginfes\\certificadoNomeAmigavel.pfx");    
        System.setProperty("javax.net.ssl.keyStorePassword", "proguaru2016");    
    
        /*System.setProperty("javax.net.ssl.trustStoreType", "JKS");    
        System.setProperty("javax.net.ssl.trustStore", "C:\\novotemp\\KeyStore.jks");    
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");*/  
    }   
}  