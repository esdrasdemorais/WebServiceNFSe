// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 22/03/2016 08:34:18
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   WebService_recepcionar_lote_rps.java

package webservice;

import br.com.ginfes.producao.ServiceGinfesImpl;
import br.com.ginfes.producao.ServiceGinfesImplService;
import java.io.*;
import java.net.MalformedURLException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.swing.JOptionPane;

// Referenced classes of package webservice:
//            XMLSignaturePKCS11Token, PrettyPrint

public class WebService_recepcionar_lote_rps
{

    public WebService_recepcionar_lote_rps()
    {
    }

    public static void main(String args[])
        throws MalformedURLException, IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException, Exception
    {
        String PIN_NUMBER = JOptionPane.showInputDialog("Informe o PIN:");
        XMLSignaturePKCS11Token.conecta(PIN_NUMBER);
        ServiceGinfesImplService servico = new ServiceGinfesImplService();
        ServiceGinfesImpl port = servico.getServiceGinfesImplPort();
        XMLSignaturePKCS11Token.sign(PIN_NUMBER, "c:\\ginfes\\notas_servicos_prestados.xml", "c:\\ginfes\\notas_servicos_prestados_assinado.xml", "EnviarLoteRpsEnvio");
        File fCabecalho = new File("C:\\Ginfes\\Schemas\\cabecalho_v03.xml");
        File fDados = new File("c:\\ginfes\\notas_servicos_prestados_assinado.xml");
        FileOutputStream fSaida = new FileOutputStream("c:\\ginfes\\protocolo.xml");
        String s = PrettyPrint.print(port.recepcionarLoteRpsV3(PrettyPrint.ler(fCabecalho), PrettyPrint.ler(fDados)));
        System.out.print(s);
        fSaida.write(s.getBytes());
    }
}