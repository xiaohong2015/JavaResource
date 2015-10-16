
package com.tc.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tc.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetVlaue_QNAME = new QName("http://service.ts.com/", "getVlaue");
    private final static QName _GetVlaueResponse_QNAME = new QName("http://service.ts.com/", "getVlaueResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tc.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVlaueResponse }
     * 
     */
    public GetVlaueResponse createGetVlaueResponse() {
        return new GetVlaueResponse();
    }

    /**
     * Create an instance of {@link GetVlaue }
     * 
     */
    public GetVlaue createGetVlaue() {
        return new GetVlaue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVlaue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ts.com/", name = "getVlaue")
    public JAXBElement<GetVlaue> createGetVlaue(GetVlaue value) {
        return new JAXBElement<GetVlaue>(_GetVlaue_QNAME, GetVlaue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVlaueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ts.com/", name = "getVlaueResponse")
    public JAXBElement<GetVlaueResponse> createGetVlaueResponse(GetVlaueResponse value) {
        return new JAXBElement<GetVlaueResponse>(_GetVlaueResponse_QNAME, GetVlaueResponse.class, null, value);
    }

}
