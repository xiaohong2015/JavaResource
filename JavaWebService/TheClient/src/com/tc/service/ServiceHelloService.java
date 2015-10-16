
package com.tc.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceHelloService", targetNamespace = "http://service.ts.com/", wsdlLocation = "http://localhost:8081/TestWebService/ServiceHello?wsdl")
public class ServiceHelloService
    extends Service
{

    private final static URL SERVICEHELLOSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEHELLOSERVICE_EXCEPTION;
    private final static QName SERVICEHELLOSERVICE_QNAME = new QName("http://service.ts.com/", "ServiceHelloService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/TestWebService/ServiceHello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEHELLOSERVICE_WSDL_LOCATION = url;
        SERVICEHELLOSERVICE_EXCEPTION = e;
    }

    public ServiceHelloService() {
        super(__getWsdlLocation(), SERVICEHELLOSERVICE_QNAME);
    }

    public ServiceHelloService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEHELLOSERVICE_QNAME, features);
    }

    public ServiceHelloService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEHELLOSERVICE_QNAME);
    }

    public ServiceHelloService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEHELLOSERVICE_QNAME, features);
    }

    public ServiceHelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceHelloService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceHello
     */
    @WebEndpoint(name = "ServiceHelloPort")
    public ServiceHello getServiceHelloPort() {
        return super.getPort(new QName("http://service.ts.com/", "ServiceHelloPort"), ServiceHello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceHello
     */
    @WebEndpoint(name = "ServiceHelloPort")
    public ServiceHello getServiceHelloPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ts.com/", "ServiceHelloPort"), ServiceHello.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEHELLOSERVICE_EXCEPTION!= null) {
            throw SERVICEHELLOSERVICE_EXCEPTION;
        }
        return SERVICEHELLOSERVICE_WSDL_LOCATION;
    }

}
