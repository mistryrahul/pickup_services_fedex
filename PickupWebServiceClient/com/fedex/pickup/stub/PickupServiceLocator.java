/**
 * PickupServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupServiceLocator extends org.apache.axis.client.Service implements com.fedex.pickup.stub.PickupService {

    public PickupServiceLocator() {
    }


    public PickupServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PickupServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PickupServicePort
    private java.lang.String PickupServicePort_address = "https://wsbeta.fedex.com:443/web-services/pickup";

    public java.lang.String getPickupServicePortAddress() {
        return PickupServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PickupServicePortWSDDServiceName = "PickupServicePort";

    public java.lang.String getPickupServicePortWSDDServiceName() {
        return PickupServicePortWSDDServiceName;
    }

    public void setPickupServicePortWSDDServiceName(java.lang.String name) {
        PickupServicePortWSDDServiceName = name;
    }

    public com.fedex.pickup.stub.PickupPortType getPickupServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PickupServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPickupServicePort(endpoint);
    }

    public com.fedex.pickup.stub.PickupPortType getPickupServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fedex.pickup.stub.PickupServiceSoapBindingStub _stub = new com.fedex.pickup.stub.PickupServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPickupServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPickupServicePortEndpointAddress(java.lang.String address) {
        PickupServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fedex.pickup.stub.PickupPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fedex.pickup.stub.PickupServiceSoapBindingStub _stub = new com.fedex.pickup.stub.PickupServiceSoapBindingStub(new java.net.URL(PickupServicePort_address), this);
                _stub.setPortName(getPickupServicePortWSDDServiceName());
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
        if ("PickupServicePort".equals(inputPortName)) {
            return getPickupServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PickupServicePort".equals(portName)) {
            setPickupServicePortEndpointAddress(address);
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
