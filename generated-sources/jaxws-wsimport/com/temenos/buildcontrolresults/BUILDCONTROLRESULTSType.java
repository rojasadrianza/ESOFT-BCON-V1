
package com.temenos.buildcontrolresults;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BUILDCONTROLRESULTSType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BUILDCONTROLRESULTSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gBUILDCONTROLRESULTSDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBUILDCONTROLRESULTSDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HDRLIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProcessInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BUILDCONTROLRESULTSType", propOrder = {
    "gbuildcontrolresultsDetailType"
})
public class BUILDCONTROLRESULTSType {

    @XmlElement(name = "gBUILDCONTROLRESULTSDetailType")
    protected BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType gbuildcontrolresultsDetailType;

    /**
     * Obtiene el valor de la propiedad gbuildcontrolresultsDetailType.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType }
     *     
     */
    public BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType getGBUILDCONTROLRESULTSDetailType() {
        return gbuildcontrolresultsDetailType;
    }

    /**
     * Define el valor de la propiedad gbuildcontrolresultsDetailType.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType }
     *     
     */
    public void setGBUILDCONTROLRESULTSDetailType(BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType value) {
        this.gbuildcontrolresultsDetailType = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="mBUILDCONTROLRESULTSDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HDRLIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProcessInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mbuildcontrolresultsDetailType"
    })
    public static class GBUILDCONTROLRESULTSDetailType {

        @XmlElement(name = "mBUILDCONTROLRESULTSDetailType")
        protected List<BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType> mbuildcontrolresultsDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbuildcontrolresultsDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbuildcontrolresultsDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBUILDCONTROLRESULTSDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType }
         * 
         * 
         */
        public List<BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType> getMBUILDCONTROLRESULTSDetailType() {
            if (mbuildcontrolresultsDetailType == null) {
                mbuildcontrolresultsDetailType = new ArrayList<BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType>();
            }
            return this.mbuildcontrolresultsDetailType;
        }

        /**
         * Obtiene el valor de la propiedad g.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Define el valor de la propiedad g.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HDRLIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProcessInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "packageName",
            "hdrlit",
            "id",
            "activity",
            "processInfo"
        })
        public static class MBUILDCONTROLRESULTSDetailType {

            @XmlElementRef(name = "PackageName", namespace = "http://temenos.com/BUILDCONTROLRESULTS", type = JAXBElement.class, required = false)
            protected JAXBElement<String> packageName;
            @XmlElementRef(name = "HDRLIT", namespace = "http://temenos.com/BUILDCONTROLRESULTS", type = JAXBElement.class, required = false)
            protected JAXBElement<String> hdrlit;
            @XmlElementRef(name = "ID", namespace = "http://temenos.com/BUILDCONTROLRESULTS", type = JAXBElement.class, required = false)
            protected JAXBElement<String> id;
            @XmlElementRef(name = "ACTIVITY", namespace = "http://temenos.com/BUILDCONTROLRESULTS", type = JAXBElement.class, required = false)
            protected JAXBElement<String> activity;
            @XmlElementRef(name = "ProcessInfo", namespace = "http://temenos.com/BUILDCONTROLRESULTS", type = JAXBElement.class, required = false)
            protected JAXBElement<String> processInfo;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad packageName.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getPackageName() {
                return packageName;
            }

            /**
             * Define el valor de la propiedad packageName.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setPackageName(JAXBElement<String> value) {
                this.packageName = value;
            }

            /**
             * Obtiene el valor de la propiedad hdrlit.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getHDRLIT() {
                return hdrlit;
            }

            /**
             * Define el valor de la propiedad hdrlit.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setHDRLIT(JAXBElement<String> value) {
                this.hdrlit = value;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getID() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setID(JAXBElement<String> value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad activity.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getACTIVITY() {
                return activity;
            }

            /**
             * Define el valor de la propiedad activity.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setACTIVITY(JAXBElement<String> value) {
                this.activity = value;
            }

            /**
             * Obtiene el valor de la propiedad processInfo.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getProcessInfo() {
                return processInfo;
            }

            /**
             * Define el valor de la propiedad processInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setProcessInfo(JAXBElement<String> value) {
                this.processInfo = value;
            }

            /**
             * Obtiene el valor de la propiedad m.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getM() {
                return m;
            }

            /**
             * Define el valor de la propiedad m.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setM(BigInteger value) {
                this.m = value;
            }

        }

    }

}
