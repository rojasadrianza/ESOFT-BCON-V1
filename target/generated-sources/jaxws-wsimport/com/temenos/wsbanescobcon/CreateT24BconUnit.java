
package com.temenos.wsbanescobcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.temenos.buildcontrol.BUILDCONTROLType;


/**
 * <p>Clase Java para CreateT24BconUnit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateT24BconUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/WSBanescoBCON}webRequestCommon" minOccurs="0"/>
 *         &lt;element name="OfsFunction" type="{http://temenos.com/WSBanescoBCON}ofsFunction" minOccurs="0"/>
 *         &lt;element name="BUILDCONTROLType" type="{http://temenos.com/BUILDCONTROL}BUILDCONTROLType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateT24BconUnit", propOrder = {
    "webRequestCommon",
    "ofsFunction",
    "buildcontrolType"
})
public class CreateT24BconUnit {

    @XmlElement(name = "WebRequestCommon")
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "OfsFunction")
    protected OfsFunction ofsFunction;
    @XmlElement(name = "BUILDCONTROLType")
    protected BUILDCONTROLType buildcontrolType;

    /**
     * Obtiene el valor de la propiedad webRequestCommon.
     * 
     * @return
     *     possible object is
     *     {@link WebRequestCommon }
     *     
     */
    public WebRequestCommon getWebRequestCommon() {
        return webRequestCommon;
    }

    /**
     * Define el valor de la propiedad webRequestCommon.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequestCommon }
     *     
     */
    public void setWebRequestCommon(WebRequestCommon value) {
        this.webRequestCommon = value;
    }

    /**
     * Obtiene el valor de la propiedad ofsFunction.
     * 
     * @return
     *     possible object is
     *     {@link OfsFunction }
     *     
     */
    public OfsFunction getOfsFunction() {
        return ofsFunction;
    }

    /**
     * Define el valor de la propiedad ofsFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link OfsFunction }
     *     
     */
    public void setOfsFunction(OfsFunction value) {
        this.ofsFunction = value;
    }

    /**
     * Obtiene el valor de la propiedad buildcontrolType.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType }
     *     
     */
    public BUILDCONTROLType getBUILDCONTROLType() {
        return buildcontrolType;
    }

    /**
     * Define el valor de la propiedad buildcontrolType.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType }
     *     
     */
    public void setBUILDCONTROLType(BUILDCONTROLType value) {
        this.buildcontrolType = value;
    }

}
