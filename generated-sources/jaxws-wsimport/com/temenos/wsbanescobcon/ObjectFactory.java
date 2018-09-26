
package com.temenos.wsbanescobcon;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.temenos.wsbanescobcon package. 
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

    private final static QName _CreateT24BconUnitResponse_QNAME = new QName("http://temenos.com/WSBanescoBCON", "CreateT24BconUnitResponse");
    private final static QName _ViewtheResultsofaBCONunitResponse_QNAME = new QName("http://temenos.com/WSBanescoBCON", "ViewtheResultsofaBCONunitResponse");
    private final static QName _CreateBconPhysicUnitResponse_QNAME = new QName("http://temenos.com/WSBanescoBCON", "CreateBconPhysicUnitResponse");
    private final static QName _CreateBconPhysicUnit_QNAME = new QName("http://temenos.com/WSBanescoBCON", "CreateBconPhysicUnit");
    private final static QName _CreateT24BconUnit_QNAME = new QName("http://temenos.com/WSBanescoBCON", "CreateT24BconUnit");
    private final static QName _CreateT24BconUnitValidateResponse_QNAME = new QName("http://temenos.com/WSBanescoBCON", "CreateT24BconUnit_ValidateResponse");
    private final static QName _CreateT24BconUnitValidate_QNAME = new QName("http://temenos.com/WSBanescoBCON", "CreateT24BconUnit_Validate");
    private final static QName _ViewtheResultsofaBCONunit_QNAME = new QName("http://temenos.com/WSBanescoBCON", "ViewtheResultsofaBCONunit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.temenos.wsbanescobcon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateT24BconUnitValidate }
     * 
     */
    public CreateT24BconUnitValidate createCreateT24BconUnitValidate() {
        return new CreateT24BconUnitValidate();
    }

    /**
     * Create an instance of {@link ViewtheResultsofaBCONunit }
     * 
     */
    public ViewtheResultsofaBCONunit createViewtheResultsofaBCONunit() {
        return new ViewtheResultsofaBCONunit();
    }

    /**
     * Create an instance of {@link CreateT24BconUnitValidateResponse }
     * 
     */
    public CreateT24BconUnitValidateResponse createCreateT24BconUnitValidateResponse() {
        return new CreateT24BconUnitValidateResponse();
    }

    /**
     * Create an instance of {@link CreateT24BconUnit }
     * 
     */
    public CreateT24BconUnit createCreateT24BconUnit() {
        return new CreateT24BconUnit();
    }

    /**
     * Create an instance of {@link CreateBconPhysicUnitResponse }
     * 
     */
    public CreateBconPhysicUnitResponse createCreateBconPhysicUnitResponse() {
        return new CreateBconPhysicUnitResponse();
    }

    /**
     * Create an instance of {@link CreateBconPhysicUnit }
     * 
     */
    public CreateBconPhysicUnit createCreateBconPhysicUnit() {
        return new CreateBconPhysicUnit();
    }

    /**
     * Create an instance of {@link CreateT24BconUnitResponse }
     * 
     */
    public CreateT24BconUnitResponse createCreateT24BconUnitResponse() {
        return new CreateT24BconUnitResponse();
    }

    /**
     * Create an instance of {@link ViewtheResultsofaBCONunitResponse }
     * 
     */
    public ViewtheResultsofaBCONunitResponse createViewtheResultsofaBCONunitResponse() {
        return new ViewtheResultsofaBCONunitResponse();
    }

    /**
     * Create an instance of {@link OfsFunction }
     * 
     */
    public OfsFunction createOfsFunction() {
        return new OfsFunction();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link EnquiryInputCollection }
     * 
     */
    public EnquiryInputCollection createEnquiryInputCollection() {
        return new EnquiryInputCollection();
    }

    /**
     * Create an instance of {@link EnquiryInput }
     * 
     */
    public EnquiryInput createEnquiryInput() {
        return new EnquiryInput();
    }

    /**
     * Create an instance of {@link TransactionId }
     * 
     */
    public TransactionId createTransactionId() {
        return new TransactionId();
    }

    /**
     * Create an instance of {@link WebRequestCommon }
     * 
     */
    public WebRequestCommon createWebRequestCommon() {
        return new WebRequestCommon();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateT24BconUnitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSBanescoBCON", name = "CreateT24BconUnitResponse")
    public JAXBElement<CreateT24BconUnitResponse> createCreateT24BconUnitResponse(CreateT24BconUnitResponse value) {
        return new JAXBElement<CreateT24BconUnitResponse>(_CreateT24BconUnitResponse_QNAME, CreateT24BconUnitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewtheResultsofaBCONunitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSBanescoBCON", name = "ViewtheResultsofaBCONunitResponse")
    public JAXBElement<ViewtheResultsofaBCONunitResponse> createViewtheResultsofaBCONunitResponse(ViewtheResultsofaBCONunitResponse value) {
        return new JAXBElement<ViewtheResultsofaBCONunitResponse>(_ViewtheResultsofaBCONunitResponse_QNAME, ViewtheResultsofaBCONunitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBconPhysicUnitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSBanescoBCON", name = "CreateBconPhysicUnitResponse")
    public JAXBElement<CreateBconPhysicUnitResponse> createCreateBconPhysicUnitResponse(CreateBconPhysicUnitResponse value) {
        return new JAXBElement<CreateBconPhysicUnitResponse>(_CreateBconPhysicUnitResponse_QNAME, CreateBconPhysicUnitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBconPhysicUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSBanescoBCON", name = "CreateBconPhysicUnit")
    public JAXBElement<CreateBconPhysicUnit> createCreateBconPhysicUnit(CreateBconPhysicUnit value) {
        return new JAXBElement<CreateBconPhysicUnit>(_CreateBconPhysicUnit_QNAME, CreateBconPhysicUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateT24BconUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSBanescoBCON", name = "CreateT24BconUnit")
    public JAXBElement<CreateT24BconUnit> createCreateT24BconUnit(CreateT24BconUnit value) {
        return new JAXBElement<CreateT24BconUnit>(_CreateT24BconUnit_QNAME, CreateT24BconUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateT24BconUnitValidateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSBanescoBCON", name = "CreateT24BconUnit_ValidateResponse")
    public JAXBElement<CreateT24BconUnitValidateResponse> createCreateT24BconUnitValidateResponse(CreateT24BconUnitValidateResponse value) {
        return new JAXBElement<CreateT24BconUnitValidateResponse>(_CreateT24BconUnitValidateResponse_QNAME, CreateT24BconUnitValidateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateT24BconUnitValidate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSBanescoBCON", name = "CreateT24BconUnit_Validate")
    public JAXBElement<CreateT24BconUnitValidate> createCreateT24BconUnitValidate(CreateT24BconUnitValidate value) {
        return new JAXBElement<CreateT24BconUnitValidate>(_CreateT24BconUnitValidate_QNAME, CreateT24BconUnitValidate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewtheResultsofaBCONunit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/WSBanescoBCON", name = "ViewtheResultsofaBCONunit")
    public JAXBElement<ViewtheResultsofaBCONunit> createViewtheResultsofaBCONunit(ViewtheResultsofaBCONunit value) {
        return new JAXBElement<ViewtheResultsofaBCONunit>(_ViewtheResultsofaBCONunit_QNAME, ViewtheResultsofaBCONunit.class, null, value);
    }

}
