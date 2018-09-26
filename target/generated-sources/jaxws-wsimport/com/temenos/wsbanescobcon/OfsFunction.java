
package com.temenos.wsbanescobcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ofsFunction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ofsFunction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extProcessID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gtsControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noOfAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofsFunction", propOrder = {
    "activityName",
    "assignReason",
    "dueDate",
    "extProcess",
    "extProcessID",
    "gtsControl",
    "messageId",
    "noOfAuth",
    "owner",
    "replace",
    "startDate",
    "user"
})
public class OfsFunction {

    protected String activityName;
    protected String assignReason;
    protected String dueDate;
    protected String extProcess;
    protected String extProcessID;
    protected String gtsControl;
    protected String messageId;
    protected String noOfAuth;
    protected String owner;
    protected String replace;
    protected String startDate;
    protected String user;

    /**
     * Obtiene el valor de la propiedad activityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Define el valor de la propiedad activityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * Obtiene el valor de la propiedad assignReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignReason() {
        return assignReason;
    }

    /**
     * Define el valor de la propiedad assignReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignReason(String value) {
        this.assignReason = value;
    }

    /**
     * Obtiene el valor de la propiedad dueDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Define el valor de la propiedad dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad extProcess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtProcess() {
        return extProcess;
    }

    /**
     * Define el valor de la propiedad extProcess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtProcess(String value) {
        this.extProcess = value;
    }

    /**
     * Obtiene el valor de la propiedad extProcessID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtProcessID() {
        return extProcessID;
    }

    /**
     * Define el valor de la propiedad extProcessID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtProcessID(String value) {
        this.extProcessID = value;
    }

    /**
     * Obtiene el valor de la propiedad gtsControl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtsControl() {
        return gtsControl;
    }

    /**
     * Define el valor de la propiedad gtsControl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtsControl(String value) {
        this.gtsControl = value;
    }

    /**
     * Obtiene el valor de la propiedad messageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Define el valor de la propiedad messageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Obtiene el valor de la propiedad noOfAuth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfAuth() {
        return noOfAuth;
    }

    /**
     * Define el valor de la propiedad noOfAuth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfAuth(String value) {
        this.noOfAuth = value;
    }

    /**
     * Obtiene el valor de la propiedad owner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Define el valor de la propiedad owner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Obtiene el valor de la propiedad replace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplace() {
        return replace;
    }

    /**
     * Define el valor de la propiedad replace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplace(String value) {
        this.replace = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
