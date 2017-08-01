// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 22/03/2016 08:34:17
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ServiceGinfesImpl.java

package br.com.ginfes.producao;

import javax.jws.soap.SOAPBinding;

public interface _ServiceGinfesImpl
{

    public abstract String cancelarNfse(String s) throws java.rmi.RemoteException;

    public abstract String cancelarNfseV3(String s, String s1) throws java.rmi.RemoteException;

    public abstract String consultarLoteRps(String s) throws java.rmi.RemoteException;

    public abstract String consultarLoteRpsV3(String s, String s1) throws java.rmi.RemoteException;

    public abstract String consultarNfse(String s) throws java.rmi.RemoteException;

    public abstract String consultarNfsePorRps(String s) throws java.rmi.RemoteException;

    public abstract String consultarNfsePorRpsV3(String s, String s1) throws java.rmi.RemoteException;

    public abstract String consultarNfseV3(String s, String s1) throws java.rmi.RemoteException;

    public abstract String consultarSituacaoLoteRps(String s) throws java.rmi.RemoteException;

    public abstract String consultarSituacaoLoteRpsV3(String s, String s1) throws java.rmi.RemoteException;

    public abstract String recepcionarLoteRps(String s) throws java.rmi.RemoteException;

    public abstract String recepcionarLoteRpsV3(String s, String s1) throws java.rmi.RemoteException;
}