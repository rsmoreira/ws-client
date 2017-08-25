/**
 * SimpleCalcImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rsmoreira.math;

public class SimpleCalcImplServiceLocator extends org.apache.axis.client.Service implements com.rsmoreira.math.SimpleCalcImplService {

    public SimpleCalcImplServiceLocator() {
    }


    public SimpleCalcImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SimpleCalcImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SimpleCalcImplPort
    private java.lang.String SimpleCalcImplPort_address = "http://localhost:8080/RSMoreiraJaxWSServer/simplecalc";

    public java.lang.String getSimpleCalcImplPortAddress() {
        return SimpleCalcImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SimpleCalcImplPortWSDDServiceName = "SimpleCalcImplPort";

    public java.lang.String getSimpleCalcImplPortWSDDServiceName() {
        return SimpleCalcImplPortWSDDServiceName;
    }

    public void setSimpleCalcImplPortWSDDServiceName(java.lang.String name) {
        SimpleCalcImplPortWSDDServiceName = name;
    }

    public com.rsmoreira.math.SimpleCalc getSimpleCalcImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SimpleCalcImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSimpleCalcImplPort(endpoint);
    }

    public com.rsmoreira.math.SimpleCalc getSimpleCalcImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.rsmoreira.math.SimpleCalcImplPortBindingStub _stub = new com.rsmoreira.math.SimpleCalcImplPortBindingStub(portAddress, this);
            _stub.setPortName(getSimpleCalcImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSimpleCalcImplPortEndpointAddress(java.lang.String address) {
        SimpleCalcImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.rsmoreira.math.SimpleCalc.class.isAssignableFrom(serviceEndpointInterface)) {
                com.rsmoreira.math.SimpleCalcImplPortBindingStub _stub = new com.rsmoreira.math.SimpleCalcImplPortBindingStub(new java.net.URL(SimpleCalcImplPort_address), this);
                _stub.setPortName(getSimpleCalcImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SimpleCalcImplPort".equals(inputPortName)) {
            return getSimpleCalcImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://math.rsmoreira.com/", "SimpleCalcImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://math.rsmoreira.com/", "SimpleCalcImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SimpleCalcImplPort".equals(portName)) {
            setSimpleCalcImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
