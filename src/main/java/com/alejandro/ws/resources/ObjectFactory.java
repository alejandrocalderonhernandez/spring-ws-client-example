//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.13 at 08:44:29 AM CDT 
//


package com.alejandro.ws.resources;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.alejandro.ws.resources package. 
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

    private final static QName _ProductRequest_QNAME = new QName("http://www.example.org/Product", "productRequest");
    private final static QName _ProductResponse_QNAME = new QName("http://www.example.org/Product", "productResponse");
    private final static QName _ProductFault_QNAME = new QName("http://www.example.org/Product", "productFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.alejandro.ws.resources
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductRequest }
     * 
     */
    public ProductRequest createProductRequest() {
        return new ProductRequest();
    }

    /**
     * Create an instance of {@link ProductResponse }
     * 
     */
    public ProductResponse createProductResponse() {
        return new ProductResponse();
    }

    /**
     * Create an instance of {@link ProductFault }
     * 
     */
    public ProductFault createProductFault() {
        return new ProductFault();
    }

    /**
     * Create an instance of {@link ProductDetails }
     * 
     */
    public ProductDetails createProductDetails() {
        return new ProductDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.org/Product", name = "productRequest")
    public JAXBElement<ProductRequest> createProductRequest(ProductRequest value) {
        return new JAXBElement<ProductRequest>(_ProductRequest_QNAME, ProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.org/Product", name = "productResponse")
    public JAXBElement<ProductResponse> createProductResponse(ProductResponse value) {
        return new JAXBElement<ProductResponse>(_ProductResponse_QNAME, ProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.org/Product", name = "productFault")
    public JAXBElement<ProductFault> createProductFault(ProductFault value) {
        return new JAXBElement<ProductFault>(_ProductFault_QNAME, ProductFault.class, null, value);
    }

}
