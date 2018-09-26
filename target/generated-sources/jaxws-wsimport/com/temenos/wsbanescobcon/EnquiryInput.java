
package com.temenos.wsbanescobcon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enquiryInput complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="enquiryInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enquiryInputCollection" type="{http://temenos.com/WSBanescoBCON}enquiryInputCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enquiryInput", propOrder = {
    "enquiryInputCollection"
})
public class EnquiryInput {

    @XmlElement(nillable = true)
    protected List<EnquiryInputCollection> enquiryInputCollection;

    /**
     * Gets the value of the enquiryInputCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enquiryInputCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnquiryInputCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnquiryInputCollection }
     * 
     * 
     */
    public List<EnquiryInputCollection> getEnquiryInputCollection() {
        if (enquiryInputCollection == null) {
            enquiryInputCollection = new ArrayList<EnquiryInputCollection>();
        }
        return this.enquiryInputCollection;
    }

}
