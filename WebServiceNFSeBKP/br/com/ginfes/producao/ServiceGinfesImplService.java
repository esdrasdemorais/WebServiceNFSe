// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 22/03/2016 08:34:17
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ServiceGinfesImplService.java

package br.com.ginfes.producao;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.*;

// Referenced classes of package br.com.ginfes.producao:
//            ServiceGinfesImpl

public class ServiceGinfesImplService extends Service
{

    public ServiceGinfesImplService()
    {
        super(__getWsdlLocation(), SERVICEGINFESIMPLSERVICE_QNAME);
    }

    public transient ServiceGinfesImplService(WebServiceFeature features[])
    {
        super(__getWsdlLocation(), SERVICEGINFESIMPLSERVICE_QNAME, features);
    }

    public ServiceGinfesImplService(URL wsdlLocation)
    {
        super(wsdlLocation, SERVICEGINFESIMPLSERVICE_QNAME);
    }

    public transient ServiceGinfesImplService(URL wsdlLocation, WebServiceFeature features[])
    {
        super(wsdlLocation, SERVICEGINFESIMPLSERVICE_QNAME, features);
    }

    public ServiceGinfesImplService(URL wsdlLocation, QName serviceName)
    {
        super(wsdlLocation, serviceName);
    }

    public transient ServiceGinfesImplService(URL wsdlLocation, QName serviceName, WebServiceFeature features[])
    {
        super(wsdlLocation, serviceName, features);
    }

    public ServiceGinfesImpl getServiceGinfesImplPort()
    {
        return (ServiceGinfesImpl)super.getPort(new QName("http://producao.ginfes.com.br", "ServiceGinfesImplPort"), br/com/ginfes/producao/ServiceGinfesImpl);
    }

    public transient ServiceGinfesImpl getServiceGinfesImplPort(WebServiceFeature features[])
    {
        return (ServiceGinfesImpl)super.getPort(new QName("http://producao.ginfes.com.br", "ServiceGinfesImplPort"), br/com/ginfes/producao/ServiceGinfesImpl, features);
    }

    private static URL __getWsdlLocation()
    {
        if(SERVICEGINFESIMPLSERVICE_EXCEPTION != null)
            throw SERVICEGINFESIMPLSERVICE_EXCEPTION;
        else
            return SERVICEGINFESIMPLSERVICE_WSDL_LOCATION;
    }

    private static final URL SERVICEGINFESIMPLSERVICE_WSDL_LOCATION;
    private static final WebServiceException SERVICEGINFESIMPLSERVICE_EXCEPTION;
    private static final QName SERVICEGINFESIMPLSERVICE_QNAME = new QName("http://producao.ginfes.com.br", "ServiceGinfesImplService");

    static 
    {
        URL url = null;
        WebServiceException e = null;
        try
        {
            url = new URL("file:/C:/Ginfes/ServiceGinfesImpl.wsdl");
        }
        catch(MalformedURLException ex)
        {
            e = new WebServiceException(ex);
        }
        SERVICEGINFESIMPLSERVICE_WSDL_LOCATION = url;
        SERVICEGINFESIMPLSERVICE_EXCEPTION = e;
    }
}