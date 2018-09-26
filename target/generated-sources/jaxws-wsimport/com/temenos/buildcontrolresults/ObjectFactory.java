
package com.temenos.buildcontrolresults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.temenos.buildcontrolresults package. 
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

    private final static QName _BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeACTIVITY_QNAME = new QName("http://temenos.com/BUILDCONTROLRESULTS", "ACTIVITY");
    private final static QName _BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeID_QNAME = new QName("http://temenos.com/BUILDCONTROLRESULTS", "ID");
    private final static QName _BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeProcessInfo_QNAME = new QName("http://temenos.com/BUILDCONTROLRESULTS", "ProcessInfo");
    private final static QName _BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypePackageName_QNAME = new QName("http://temenos.com/BUILDCONTROLRESULTS", "PackageName");
    private final static QName _BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeHDRLIT_QNAME = new QName("http://temenos.com/BUILDCONTROLRESULTS", "HDRLIT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.temenos.buildcontrolresults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BUILDCONTROLRESULTSType }
     * 
     */
    public BUILDCONTROLRESULTSType createBUILDCONTROLRESULTSType() {
        return new BUILDCONTROLRESULTSType();
    }

    /**
     * Create an instance of {@link BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType }
     * 
     */
    public BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType createBUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailType() {
        return new BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType();
    }

    /**
     * Create an instance of {@link BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType }
     * 
     */
    public BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType createBUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailType() {
        return new BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/BUILDCONTROLRESULTS", name = "ACTIVITY", scope = BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class)
    public JAXBElement<String> createBUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeACTIVITY(String value) {
        return new JAXBElement<String>(_BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeACTIVITY_QNAME, String.class, BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/BUILDCONTROLRESULTS", name = "ID", scope = BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class)
    public JAXBElement<String> createBUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeID(String value) {
        return new JAXBElement<String>(_BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeID_QNAME, String.class, BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/BUILDCONTROLRESULTS", name = "ProcessInfo", scope = BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class)
    public JAXBElement<String> createBUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeProcessInfo(String value) {
        return new JAXBElement<String>(_BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeProcessInfo_QNAME, String.class, BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/BUILDCONTROLRESULTS", name = "PackageName", scope = BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class)
    public JAXBElement<String> createBUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypePackageName(String value) {
        return new JAXBElement<String>(_BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypePackageName_QNAME, String.class, BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://temenos.com/BUILDCONTROLRESULTS", name = "HDRLIT", scope = BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class)
    public JAXBElement<String> createBUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeHDRLIT(String value) {
        return new JAXBElement<String>(_BUILDCONTROLRESULTSTypeGBUILDCONTROLRESULTSDetailTypeMBUILDCONTROLRESULTSDetailTypeHDRLIT_QNAME, String.class, BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType.class, value);
    }

}
