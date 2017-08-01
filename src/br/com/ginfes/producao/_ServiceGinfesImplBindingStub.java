package br.com.ginfes.producao;

/** 
* ServiceGinfesImplBindingStub.java 
* 
* This file was auto-generated from WSDL 
* by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter. 
*/  
    
public class _ServiceGinfesImplBindingStub extends org.apache.axis.client.Stub implements br.com.ginfes.producao._ServiceGinfesImpl {  
    private java.util.Vector cachedSerClasses = new java.util.Vector();  
    private java.util.Vector cachedSerQNames = new java.util.Vector();  
    private java.util.Vector cachedSerFactories = new java.util.Vector();  
    private java.util.Vector cachedDeserFactories = new java.util.Vector();  
  
    static org.apache.axis.description.OperationDesc [] _operations;  
  
    static {  
        _operations = new org.apache.axis.description.OperationDesc[12];  
        _initOperationDesc1();  
        _initOperationDesc2();  
    }  
  
    private static void _initOperationDesc1(){  
        org.apache.axis.description.OperationDesc oper;  
        org.apache.axis.description.ParameterDesc param;  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("CancelarNfse");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[0] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("CancelarNfseV3");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[1] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("ConsultarLoteRps");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[2] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("ConsultarLoteRpsV3");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[3] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("ConsultarNfse");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[4] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("ConsultarNfsePorRps");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[5] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("ConsultarNfsePorRpsV3");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[6] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("ConsultarNfseV3");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[7] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("ConsultarSituacaoLoteRps");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[8] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("ConsultarSituacaoLoteRpsV3");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[9] = oper;  
  
    }  
  
    private static void _initOperationDesc2(){  
        org.apache.axis.description.OperationDesc oper;  
        org.apache.axis.description.ParameterDesc param;  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("RecepcionarLoteRps");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[10] = oper;  
  
        oper = new org.apache.axis.description.OperationDesc();  
        oper.setName("RecepcionarLoteRpsV3");  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);  
        oper.addParameter(param);  
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));  
        oper.setReturnClass(java.lang.String.class);  
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));  
        oper.setStyle(org.apache.axis.constants.Style.RPC);  
        oper.setUse(org.apache.axis.constants.Use.LITERAL);  
        _operations[11] = oper;  
  
    }  
  
    public _ServiceGinfesImplBindingStub() throws org.apache.axis.AxisFault {  
         this(null);  
    }  
  
    public _ServiceGinfesImplBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {  
         this(service);  
         super.cachedEndpoint = endpointURL;  
    }  
  
    public _ServiceGinfesImplBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {  
        if (service == null) {  
            super.service = new org.apache.axis.client.Service();  
        } else {  
            super.service = service;  
        }  
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");  
    }  
  
    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {  
        try {  
            org.apache.axis.client.Call _call = super._createCall();  
            if (super.maintainSessionSet) {  
                _call.setMaintainSession(super.maintainSession);  
            }  
            if (super.cachedUsername != null) {  
                _call.setUsername(super.cachedUsername);  
            }  
            if (super.cachedPassword != null) {  
                _call.setPassword(super.cachedPassword);  
            }  
            if (super.cachedEndpoint != null) {  
                _call.setTargetEndpointAddress(super.cachedEndpoint);  
            }  
            if (super.cachedTimeout != null) {  
                _call.setTimeout(super.cachedTimeout);  
            }  
            if (super.cachedPortName != null) {  
                _call.setPortName(super.cachedPortName);  
            }  
            java.util.Enumeration keys = super.cachedProperties.keys();  
            while (keys.hasMoreElements()) {  
                java.lang.String key = (java.lang.String) keys.nextElement();  
                _call.setProperty(key, super.cachedProperties.get(key));  
            }  
            return _call;  
        }  
        catch (java.lang.Throwable _t) {  
            //throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);  
        }  
        return _call;
    }  
  
    public java.lang.String cancelarNfse(java.lang.String arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[0]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "CancelarNfse"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String cancelarNfseV3(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[1]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "CancelarNfseV3"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String consultarLoteRps(java.lang.String arg0) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[2]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "ConsultarLoteRps"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String consultarLoteRpsV3(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[3]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "ConsultarLoteRpsV3"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String consultarNfse(java.lang.String arg0) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[4]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "ConsultarNfse"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String consultarNfsePorRps(java.lang.String arg0) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[5]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "ConsultarNfsePorRps"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String consultarNfsePorRpsV3(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[6]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "ConsultarNfsePorRpsV3"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String consultarNfseV3(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[7]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "ConsultarNfseV3"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String consultarSituacaoLoteRps(java.lang.String arg0) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[8]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "ConsultarSituacaoLoteRps"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String consultarSituacaoLoteRpsV3(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[9]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "ConsultarSituacaoLoteRpsV3"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String recepcionarLoteRps(java.lang.String arg0) throws java.rmi.RemoteException {  
        if (super.cachedEndpoint == null) {  
            throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[10]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "RecepcionarLoteRps"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
            throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  throw axisFaultException;  
}  
    }  
  
    public java.lang.String recepcionarLoteRpsV3(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException {
    	java.lang.Object _resp = "";
        if (super.cachedEndpoint == null) {  
            //throw new org.apache.axis.NoEndPointException();  
        }  
        org.apache.axis.client.Call _call = createCall();  
        _call.setOperation(_operations[11]);  
        _call.setUseSOAPAction(true);  
        _call.setSOAPActionURI("");  
        _call.setEncodingStyle(null);  
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);  
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);  
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);  
        _call.setOperationName(new javax.xml.namespace.QName("http://producao.ginfes.com.br", "RecepcionarLoteRpsV3"));  
  
        setRequestHeaders(_call);  
        setAttachments(_call);  
try {        _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});  
  
        if (_resp instanceof java.rmi.RemoteException) {  
           // throw (java.rmi.RemoteException)_resp;  
        }  
        else {  
            extractAttachments(_call);  
            try {  
                return (java.lang.String) _resp;  
            } catch (java.lang.Exception _exception) {  
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);  
            }  
        }  
  } catch (org.apache.axis.AxisFault axisFaultException) {  
  //throw axisFaultException;  
}
	return (java.lang.String) _resp;  
}  
  
}