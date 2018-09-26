
package com.temenos.wsbanescobcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.temenos.buildcontrol.BUILDCONTROLType;


/**
 * <p>Clase Java para CreateT24BconUnitResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateT24BconUnitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/WSBanescoBCON}Status" minOccurs="0"/>
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
@XmlType(name = "CreateT24BconUnitResponse", propOrder = {
    "status",
    "buildcontrolType"
})
public class CreateT24BconUnitResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "BUILDCONTROLType")
    protected BUILDCONTROLType buildcontrolType;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
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
