import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;

import com.sun.org.apache.xml.internal.security.keys.content.X509Data;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.Enumeration;  

public class Certificate {

    private PrivateKey privateKey;
    private KeyInfo keyInfo;  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        XMLSignatureFactory signatureFactory = XMLSignatureFactory.getInstance("DOM");  
        Certificate c = new Certificate();
        try {
        	c.loadCertificates("C:/Ginfes/certificado.pfx", "proguaru2016", signatureFactory);
        } catch(Exception e) {
        	System.out.println(e.getMessage());
        }
	}

    public void loadCertificates(String certificado, String senha,  
            XMLSignatureFactory signatureFactory)   
            throws FileNotFoundException, KeyStoreException, IOException,   
            NoSuchAlgorithmException, CertificateException,   
            UnrecoverableEntryException, NoSuchProviderException   
    {  
    KeyStore ks = KeyStore.getInstance("Windows-MY", "SunMSCAPI"); //MODIFICADO  
          
        ks.load(null, null); //MODIFICADO  
      
    KeyStore.PrivateKeyEntry pkEntry = null;  
    Enumeration<String> aliasesEnum = ks.aliases();  
    while (aliasesEnum.hasMoreElements())   
        {  
            String alias = certificado; // Aqui é informado o Alias (Nome amigável do certificado digital)  
            
            if (ks.isKeyEntry(alias))   
            {  
                pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias,  
                new KeyStore.PasswordProtection(senha.toCharArray()));  
                privateKey = pkEntry.getPrivateKey();  
        break;  
            }  
    }  
    X509Certificate cert = (X509Certificate) pkEntry.getCertificate();  
    //info("SubjectDN: " + cert.getSubjectDN().toString());  
    KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();  
    
    java.util.List<X509Certificate> x509Content = new ArrayList<X509Certificate>();
          
    x509Content.add(cert);  
    javax.xml.crypto.dsig.keyinfo.X509Data x509Data = keyInfoFactory.newX509Data(x509Content);  
    keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));  
    }  
}
