import java.io.BufferedReader;  
import java.io.ByteArrayInputStream;  
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.security.InvalidAlgorithmParameterException;  
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Enumeration;  
import java.util.List;  
  
import javax.xml.crypto.dsig.CanonicalizationMethod;  
import javax.xml.crypto.dsig.DigestMethod;  
import javax.xml.crypto.dsig.Reference;  
import javax.xml.crypto.dsig.SignatureMethod;  
import javax.xml.crypto.dsig.SignedInfo;  
import javax.xml.crypto.dsig.Transform;  
import javax.xml.crypto.dsig.XMLSignature;  
import javax.xml.crypto.dsig.XMLSignatureFactory;  
import javax.xml.crypto.dsig.dom.DOMSignContext;  
import javax.xml.crypto.dsig.keyinfo.KeyInfo;  
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;  
import javax.xml.crypto.dsig.keyinfo.X509Data;  
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;  
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;  
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;  
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;  
import org.xml.sax.SAXException;

import br.com.ginfes.producao._ServiceGinfesImpl;
import br.com.ginfes.producao._ServiceGinfesImplService;
import webservice.PrettyPrint;

import org.xml.sax.InputSource; 
import java.net.URL;

public class AssinarXMLsCertfificadoA1 {
	private static final String INFINUT = "infInut";  
    private static final String INFCANC = "infCanc";  
    private static final String NFE = "LoteRps";  
  
    private PrivateKey privateKey;  
    private KeyInfo keyInfo;  
  
    public static void main(String[] args) {
        try {
            String caminhoDoCertificadoDoCliente = "C:/Ginfes/certificadoNomeAmigavel.pfx";  
            String senhaDoCertificadoDoCliente = "proguaru2016";  
            AssinarXMLsCertfificadoA1 assinarXMLsCertfificadoA1 = new AssinarXMLsCertfificadoA1();  
  
            /** 
             * Assinando o XML de Lote da NF-e 
             * fileEnviNFe = Caminho do Arquivo XML (EnviNFe) gerado; 
             */  
//            info("");  
//            String fileEnviNFe = "c:/ginfes/notas_servicos_prestados.xml";
//            String xmlEnviNFe = lerXML(fileEnviNFe);
//            String xmlEnviNFeAssinado = assinarXMLsCertfificadoA1.assinaEnviNFe(
//                    xmlEnviNFe, caminhoDoCertificadoDoCliente, senhaDoCertificadoDoCliente
//            );
//            info("XML EnviNFe Assinado: " + xmlEnviNFeAssinado);
//            
//            FileUtils.writeStringToFile(new File("c:/ginfes/notas_servicos_prestados_assinado.xml"), xmlEnviNFeAssinado);
//System.exit(0);

            
//            File fCabecalho = new File("C:\\Ginfes\\Schemas\\cabecalho_v03.xml");
//            FileOutputStream fSaida = new FileOutputStream("c:\\ginfes\\protocolo.xml");
//            ServiceGinfesImplService servico = new ServiceGinfesImplService();
//            ServiceGinfesImpl port = servico.getServiceGinfesImplPort();
//            String s = PrettyPrint.print(port.recepcionarLoteRpsV3(PrettyPrint.ler(fCabecalho), xmlEnviNFeAssinado));
//            System.out.print(s);
//            fSaida.write(s.getBytes());
            
//           Valida valida = new Valida();
//           String result = Valida.validaPedCartaCorrecao("c:/ginfes/notas_servicos_prestados_assinado.xml");
//System.out.println("XML Validate: "+result);
//System.exit(0);
            
            /******************************************\ 
             * Informa��es do Certificado Digital.  
           \*******************************************/    
//           System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");    
//           Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());    
//     
//           System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");    
//     
//           System.clearProperty("javax.net.ssl.keyStore");    
//           System.clearProperty("javax.net.ssl.keyStorePassword");    
//           System.clearProperty("javax.net.ssl.trustStore");    
//     
//           System.setProperty("javax.net.ssl.keyStore", caminhoDoCertificadoDoCliente);    
//           System.setProperty("javax.net.ssl.keyStorePassword", senhaDoCertificadoDoCliente);    
//     
//           System.setProperty("javax.net.ssl.trustStoreType", "JKS");    
////           System.setProperty("javax.net.ssl.trustStore", arquivoCacertsGeradoParaCadaEstado);  
            
//           String url =  "https://producao.ginfes.com.br/ServiceGinfesImpl?wsdl";  
//           String ret = null;  
//            
//           NFSeRecepcao rec = new NFSeRecepcao();  
//           try {  
//               ret = rec.execute(xmlEnviNFeAssinado, new URL(url));  
//               System.out.println("Return: "+ret);  
//           } catch (MalformedURLException ex) {  
//               System.out.println("Exce��o: "+ex);  
//           }
           
//System.exit(0);

            String envelope = null;
            
            WebServiceRecepcionarLoteRps wsRLR = new WebServiceRecepcionarLoteRps();
            try {  
                // Configure the SSLContext with a TrustManager  
      
                boolean a3 = false;  
                boolean log = true;  
             
                String keyStore = "";  
      
                // Define o servidor Web Service  
                String endpoint = "https://producao.ginfes.com.br/ServiceGinfesImpl?wsdl";  
                // String endpoint =  
                // "https://homologacao.ginfes.com.br/ServiceGinfesImpl?wsdl";  
                // Arquivo que ser'aenviado para o Web Service  
                //String arquivoXml = "C:\\TutorialArquivos\\nfseAss.xml";  
                // String arquivoXml = "C:\\temp\\WebService\\nfe_3055.xml";  
                // Estabelece contato com o WebServices
      
                envelope = wsRLR.connectTransmitir(a3, log, caminhoDoCertificadoDoCliente,  
                        keyStore, endpoint, "c:/ginfes/notas_servicos_prestados_assinado.xml", 
                        senhaDoCertificadoDoCliente, "RecepcionarLoteRps");
                System.out.println(envelope);
            }
            // Imprime a exce��o causada pelo servidor.  
            catch (Throwable err) {
                err.printStackTrace();  
            }
            
            /** 
             * Assinando o XML de Cancelamento da NF-e 
             * fileCancNFe = Caminho do Arquivo XML (CancNFe) gerado; 
             */  
//            info("");  
//            String fileCancNFe = "C:/JavaC/NF-e/xmlCancNFe.xml";  
//            String xmlCancNFe = lerXML(fileCancNFe);  
//            String xmlCancNFeAssinado = assinarXMLsCertfificadoA1.assinaCancNFe(  
//                    xmlCancNFe, caminhoDoCertificadoDoCliente, senhaDoCertificadoDoCliente);  
//            info("XML CancNFe Assinado: " + xmlCancNFeAssinado);  
  
            /** 
             * Assinando o XML de Inutilizacao da NF-e 
             * fileInutNFe = Caminho do Arquivo XML (InutNFe) gerado; 
             */  
//            info("");  
//            String fileInutNFe = "C:/JavaC/NF-e/xmlInutNFe.xml";  
//            String xmlInutNFe = lerXML(fileInutNFe);  
//            String xmlInutNFeAssinado = assinarXMLsCertfificadoA1.assinaInutNFe(  
//                    xmlInutNFe, caminhoDoCertificadoDoCliente, senhaDoCertificadoDoCliente);  
//            info("XML InutNFe Assinado: " + xmlInutNFeAssinado);  
        } catch (Exception e) {
            error("| " + e.toString());
        }
    }
  
    /** 
     * Assinatura do XML de Envio de Lote da NF-e utilizando Certificado 
     * Digital A1. 
     * @param xml 
     * @param certificado 
     * @param senha 
     * @return 
     * @throws Exception 
     */  
    public String assinaEnviNFe(String xml, String certificado, String senha)  
            throws Exception {
        Document document = documentFactory(xml);  
        XMLSignatureFactory signatureFactory = XMLSignatureFactory.getInstance("DOM");  
        ArrayList<Transform> transformList = signatureFactory(signatureFactory);  

        loadCertificates(certificado, senha, signatureFactory);
  
        int length = document.getDocumentElement().getElementsByTagName(NFE).getLength();
        for (int i = 0; i < length; i++) {  
            assinarNFe(signatureFactory, transformList, privateKey, keyInfo, document, i);  
        }  
  
        return outputXML(document);  
    }
  
    /** 
     * Assintaruda do XML de Cancelamento da NF-e utilizando Certificado 
     * Digital A1. 
     * @param xml 
     * @param certificado 
     * @param senha 
     * @return 
     * @throws Exception 
     */  
    public String assinaCancNFe(String xml, String certificado, String senha) throws Exception {  
        return assinaCancelametoInutilizacao(xml, certificado, senha, INFCANC);  
    }  
  
    /** 
     * Assinatura do XML de Inutilizacao de sequenciais da NF-e utilizando 
     * Certificado Digital A1. 
     * @param xml 
     * @param certificado 
     * @param senha 
     * @return 
     * @throws Exception 
     */  
    public String assinaInutNFe(String xml, String certificado, String senha) throws Exception {  
        return assinaCancelametoInutilizacao(xml, certificado, senha, INFINUT);  
    }  
  
    private void assinarNFe(XMLSignatureFactory fac,  
            ArrayList<Transform> transformList, PrivateKey privateKey,  
            KeyInfo ki, Document document, int indexNFe) throws Exception {  
  
        NodeList elements = document.getElementsByTagName("InfRps");  
        org.w3c.dom.Element el = (org.w3c.dom.Element) elements.item(indexNFe);  
        String id = el.getAttribute("Id");  
  
        el.setIdAttribute("Id", true);
        
        Reference ref = fac.newReference("#" + id,  
                fac.newDigestMethod(DigestMethod.SHA1, null), transformList,  
                null, null);  
  
        SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(  
                CanonicalizationMethod.INCLUSIVE,  
                (C14NMethodParameterSpec) null), 
        		fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),  
                Collections.singletonList(ref));  
  
        XMLSignature signature = fac.newXMLSignature(si, ki);  
  
        Node nopai = document.getDocumentElement().getElementsByTagName(NFE).item(indexNFe);
        DOMSignContext dsc = new DOMSignContext(privateKey, nopai);  
        signature.sign(dsc);
    }  
  
    private String assinaCancelametoInutilizacao(String xml,  
            String certificado, String senha, String tagCancInut)  
            throws Exception {  
        Document document = documentFactory(xml);  
  
        XMLSignatureFactory signatureFactory = XMLSignatureFactory  
                .getInstance("DOM");  
        ArrayList<Transform> transformList = signatureFactory(signatureFactory);  
        loadCertificates(certificado, senha, signatureFactory);  
  
        NodeList elements = document.getElementsByTagName(tagCancInut);  
        org.w3c.dom.Element el = (org.w3c.dom.Element) elements.item(0);  
        String id = el.getAttribute("Id");  
  
        Reference ref = signatureFactory.newReference("#" + id,  
                signatureFactory.newDigestMethod(DigestMethod.SHA1, null),  
                transformList, null, null);  
  
        SignedInfo si = signatureFactory.newSignedInfo(signatureFactory  
                .newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE,  
                        (C14NMethodParameterSpec) null), signatureFactory  
                .newSignatureMethod(SignatureMethod.RSA_SHA1, null),  
                Collections.singletonList(ref));  
  
        XMLSignature signature = signatureFactory.newXMLSignature(si, keyInfo);  
  
        DOMSignContext dsc = new DOMSignContext(privateKey, document.getFirstChild());  
        signature.sign(dsc);  
  
        return outputXML(document);  
    }  
  
    private ArrayList<Transform> signatureFactory(  
            XMLSignatureFactory signatureFactory)  
            throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {  
        ArrayList<Transform> transformList = new ArrayList<Transform>();  
        TransformParameterSpec tps = null;  
        Transform envelopedTransform = signatureFactory.newTransform(  
                Transform.ENVELOPED, tps);  
        Transform c14NTransform = signatureFactory.newTransform(  
                "http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);  
  
        transformList.add(envelopedTransform);  
        transformList.add(c14NTransform);  
        return transformList;  
    }  
  
    private Document documentFactory(String xml) throws SAXException,  
            IOException, ParserConfigurationException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        factory.setNamespaceAware(true);  
        Document document = factory.newDocumentBuilder().parse(new ByteArrayInputStream(xml.getBytes()));
        return document;
    }
  
    /*private void loadCertificates(String certificado, String senha,  
            XMLSignatureFactory signatureFactory)   
            throws FileNotFoundException, KeyStoreException, IOException,   
            NoSuchAlgorithmException, CertificateException,   
            UnrecoverableEntryException, NoSuchProviderException {
            	
    	KeyStore ks = KeyStore.getInstance("Windows-MY", "SunMSCAPI"); //MODIFICADO  
          
        ks.load(null, null); //MODIFICADO  
      
        KeyStore.PrivateKeyEntry pkEntry = null;  
        Enumeration<String> aliasesEnum = ks.aliases();  
        while (aliasesEnum.hasMoreElements())   
        {  
            String alias = certificado; // Aqui � informado o Alias (Nome amig�vel do certificado digital)  
            
            if (ks.isKeyEntry(alias))   
            {  
                pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(senha.toCharArray()));  
                privateKey = pkEntry.getPrivateKey();  
                break;  
            }  
        }
        X509Certificate cert = (X509Certificate) pkEntry.getCertificate();  
        //info("SubjectDN: " + cert.getSubjectDN().toString());  
        KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();  
        List<X509Certificate> x509Content = new ArrayList<X509Certificate>();  
          
        x509Content.add(cert);  
        X509Data x509Data = keyInfoFactory.newX509Data(x509Content);  
        keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));  
    }*/
    
    private void loadCertificates(String certificado, String senha,  
            XMLSignatureFactory signatureFactory) throws Exception {  
  
        InputStream entrada = new FileInputStream(certificado);

        KeyStore ks = KeyStore.getInstance("PKCS12");  
        try {  
            ks.load(entrada, senha.toCharArray());
        } catch (IOException e) {
            throw new Exception("Senha do Certificado Digital incorreta ou Certificado inv�lido.");
        }  
  
        KeyStore.PrivateKeyEntry pkEntry = null;  
        Enumeration<String> aliasesEnum = ks.aliases();  
        while (aliasesEnum.hasMoreElements()) {  
            String alias = (String) aliasesEnum.nextElement();  
            if (ks.isKeyEntry(alias)) {  
                pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(senha.toCharArray()));  
                privateKey = pkEntry.getPrivateKey();  
                break;  
            }  
        }  
  
        X509Certificate cert = (X509Certificate) pkEntry.getCertificate();  
        info("SubjectDN: " + cert.getSubjectDN().toString());  
  
        KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();  
        List<X509Certificate> x509Content = new ArrayList<X509Certificate>();  
  
        x509Content.add(cert);  
        X509Data x509Data = keyInfoFactory.newX509Data(x509Content);  
        keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));  
    }
  
    private String outputXML(Document doc) throws TransformerException {  
        ByteArrayOutputStream os = new ByteArrayOutputStream();  
        TransformerFactory tf = TransformerFactory.newInstance();  
        Transformer trans = tf.newTransformer();  
        trans.transform(new DOMSource(doc), new StreamResult(os));  
        String xml = os.toString();  
        if ((xml != null) && (!"".equals(xml))) {  
            xml = xml.replaceAll("\\r\\n", "");  
            xml = xml.replaceAll(" standalone=\"no\"", "");  
        }  
        return xml;  
    }  
  
    private static String lerXML(String fileXML) throws IOException {  
        String linha = "";  
        StringBuilder xml = new StringBuilder();  
  
        BufferedReader in = new BufferedReader(new InputStreamReader(  
                new FileInputStream(fileXML)));  
        while ((linha = in.readLine()) != null) {  
            xml.append(linha);  
        }  
        in.close();  
  
        return xml.toString();  
    }  
  
    /** 
     * Log ERROR. 
     *  
     * @param error 
     */  
    private static void error(String error) {  
        System.out.println("| ERROR: " + error);  
    }  
  
    /** 
     * Log INFO. 
     *  
     * @param info 
     */  
    private static void info(String info) {  
        System.out.println("| INFO: " + info);  
    }  
}
