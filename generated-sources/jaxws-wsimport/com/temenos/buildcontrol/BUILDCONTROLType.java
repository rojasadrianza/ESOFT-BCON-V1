
package com.temenos.buildcontrol;

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
 * <p>Clase Java para BUILDCONTROLType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BUILDCONTROLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gLLDESC" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mLLDESC" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sgLLDESC" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="MNEMONIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCONPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAVEPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELEASEPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPROGRAMBP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mPROGRAMBP" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PROGRAMBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgSELECTCMD" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SELECTCMD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MVRESERVED9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELEASEBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gJBCDEVLIB" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JBCDEVLIB" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gJBCDEVBIN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JBCDEVBIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OBJNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gDEPENDENCY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DEPENDENCY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gOURREFERENCE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mOURREFERENCE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OURREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="THEIRREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ISSUEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OFSSOURCEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gDLDEFINE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mDLDEFINE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DLDEFINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FROMCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TOCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gLOCREFTABLE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mLOCREFTABLE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LOCREFTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgLOCALTABLE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LOCALTABLE" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="gSSAPPLNAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mSSAPPLNAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SSAPPLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRFIELDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgUSRFIELDNO" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="USRFIELDNO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="sgUSRVALPROG" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="USRVALPROG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="USRCONVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRDISPLAYFMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRALTINDEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRIDXFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRINDEXNULLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRSINGLEMULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRLANGFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRCNVTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="USRRELFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SSRESVD39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SSRESVD40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SSRESVD41" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SSRESVD42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gBUILDNEWDICT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BUILDNEWDICT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gWSFILENAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mWSFILENAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="WSFILENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WSRECORDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="GENINSTALLDOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED47" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED48" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gUPDTABLENAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mUPDTABLENAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UPDTABLENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UPDCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgUPDRECORD" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="UPDRECORD" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="UPDRECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="UPDFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="SVRESVD53" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="SVRESVD54" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="SVRESVD55" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="UPDVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MVRESVD57" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MVRESVD58" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MVRESVD59" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="RESERVED60" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED61" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED62" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED63" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED65" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED66" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED67" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED68" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gFILEVOCID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mFILEVOCID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FILEVOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FILESTOCREATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gSHELLCMD" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SHELLCMD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gRELEASEORDER" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RELEASEORDER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AUTHSPLINSTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREATELIB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREATEBIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREATERELBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DLSAVEPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DLRESTOREPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROGRAMOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLRPROCESSLOG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gACTIVITY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mACTIVITY" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgPROCESSINFO" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PROCESSINFO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="gPROCESSERR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PROCESSERR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gSAVEDDATE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mSAVEDDATE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SAVEDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SAVEDVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SAVEDUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gRELEASEDATE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mRELEASEDATE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RELEASEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELEASEVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELEASEUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gRELSTAGE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RELSTAGE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VIEWREPORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMOVESOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPREINSTALL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mPREINSTALL" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sgPREINSTALL" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PREINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="gPOSTINSTALL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mPOSTINSTALL" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sgPOSTINSTALL" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="POSTINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="DOCIDNEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gADDNLSYSREQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ADDNLSYSREQ" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RESERVED97" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED98" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED99" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED100" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED101" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCONFUNCTIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELOTHERCOMPRECS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gINPUTTER" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gDATETIME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AUTHORISER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDITORCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDITDATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BUILDCONTROLType", propOrder = {
    "glldesc",
    "mnemonic",
    "action",
    "bconproduct",
    "savepath",
    "releasepath",
    "gprogrambp",
    "gjbcdevlib",
    "gjbcdevbin",
    "objname",
    "gdependency",
    "gourreference",
    "ofssourceid",
    "gdldefine",
    "glocreftable",
    "gssapplname",
    "gbuildnewdict",
    "gwsfilename",
    "geninstalldoc",
    "reserved47",
    "reserved48",
    "gupdtablename",
    "reserved60",
    "reserved61",
    "reserved62",
    "reserved63",
    "reserved64",
    "reserved65",
    "reserved66",
    "reserved67",
    "reserved68",
    "gfilevocid",
    "gshellcmd",
    "greleaseorder",
    "authsplinstr",
    "createlib",
    "createbin",
    "createrelbp",
    "dlsavepath",
    "dlrestorepath",
    "programos",
    "clrprocesslog",
    "gactivity",
    "gprocesserr",
    "gsaveddate",
    "greleasedate",
    "grelstage",
    "viewreport",
    "removesource",
    "gpreinstall",
    "gpostinstall",
    "docidnew",
    "gaddnlsysreq",
    "reserved97",
    "reserved98",
    "reserved99",
    "reserved100",
    "reserved101",
    "bconfunctionality",
    "delothercomprecs",
    "recordstatus",
    "currno",
    "ginputter",
    "gdatetime",
    "authoriser",
    "cocode",
    "deptcode",
    "auditorcode",
    "auditdatetime"
})
public class BUILDCONTROLType {

    @XmlElement(name = "gLLDESC")
    protected BUILDCONTROLType.GLLDESC glldesc;
    @XmlElementRef(name = "MNEMONIC", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mnemonic;
    @XmlElementRef(name = "ACTION", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "BCONPRODUCT", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bconproduct;
    @XmlElementRef(name = "SAVEPATH", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> savepath;
    @XmlElementRef(name = "RELEASEPATH", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> releasepath;
    @XmlElement(name = "gPROGRAMBP")
    protected BUILDCONTROLType.GPROGRAMBP gprogrambp;
    @XmlElement(name = "gJBCDEVLIB")
    protected BUILDCONTROLType.GJBCDEVLIB gjbcdevlib;
    @XmlElement(name = "gJBCDEVBIN")
    protected BUILDCONTROLType.GJBCDEVBIN gjbcdevbin;
    @XmlElementRef(name = "OBJNAME", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objname;
    @XmlElement(name = "gDEPENDENCY")
    protected BUILDCONTROLType.GDEPENDENCY gdependency;
    @XmlElement(name = "gOURREFERENCE")
    protected BUILDCONTROLType.GOURREFERENCE gourreference;
    @XmlElementRef(name = "OFSSOURCEID", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ofssourceid;
    @XmlElement(name = "gDLDEFINE")
    protected BUILDCONTROLType.GDLDEFINE gdldefine;
    @XmlElement(name = "gLOCREFTABLE")
    protected BUILDCONTROLType.GLOCREFTABLE glocreftable;
    @XmlElement(name = "gSSAPPLNAME")
    protected BUILDCONTROLType.GSSAPPLNAME gssapplname;
    @XmlElement(name = "gBUILDNEWDICT")
    protected BUILDCONTROLType.GBUILDNEWDICT gbuildnewdict;
    @XmlElement(name = "gWSFILENAME")
    protected BUILDCONTROLType.GWSFILENAME gwsfilename;
    @XmlElementRef(name = "GENINSTALLDOC", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geninstalldoc;
    @XmlElementRef(name = "RESERVED47", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved47;
    @XmlElementRef(name = "RESERVED48", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved48;
    @XmlElement(name = "gUPDTABLENAME")
    protected BUILDCONTROLType.GUPDTABLENAME gupdtablename;
    @XmlElementRef(name = "RESERVED60", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved60;
    @XmlElementRef(name = "RESERVED61", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved61;
    @XmlElementRef(name = "RESERVED62", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved62;
    @XmlElementRef(name = "RESERVED63", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved63;
    @XmlElementRef(name = "RESERVED64", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved64;
    @XmlElementRef(name = "RESERVED65", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved65;
    @XmlElementRef(name = "RESERVED66", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved66;
    @XmlElementRef(name = "RESERVED67", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved67;
    @XmlElementRef(name = "RESERVED68", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved68;
    @XmlElement(name = "gFILEVOCID")
    protected BUILDCONTROLType.GFILEVOCID gfilevocid;
    @XmlElement(name = "gSHELLCMD")
    protected BUILDCONTROLType.GSHELLCMD gshellcmd;
    @XmlElement(name = "gRELEASEORDER")
    protected BUILDCONTROLType.GRELEASEORDER greleaseorder;
    @XmlElementRef(name = "AUTHSPLINSTR", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authsplinstr;
    @XmlElementRef(name = "CREATELIB", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createlib;
    @XmlElementRef(name = "CREATEBIN", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createbin;
    @XmlElementRef(name = "CREATERELBP", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createrelbp;
    @XmlElementRef(name = "DLSAVEPATH", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dlsavepath;
    @XmlElementRef(name = "DLRESTOREPATH", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dlrestorepath;
    @XmlElementRef(name = "PROGRAMOS", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> programos;
    @XmlElementRef(name = "CLRPROCESSLOG", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clrprocesslog;
    @XmlElement(name = "gACTIVITY")
    protected BUILDCONTROLType.GACTIVITY gactivity;
    @XmlElement(name = "gPROCESSERR")
    protected BUILDCONTROLType.GPROCESSERR gprocesserr;
    @XmlElement(name = "gSAVEDDATE")
    protected BUILDCONTROLType.GSAVEDDATE gsaveddate;
    @XmlElement(name = "gRELEASEDATE")
    protected BUILDCONTROLType.GRELEASEDATE greleasedate;
    @XmlElement(name = "gRELSTAGE")
    protected BUILDCONTROLType.GRELSTAGE grelstage;
    @XmlElementRef(name = "VIEWREPORT", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> viewreport;
    @XmlElementRef(name = "REMOVESOURCE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> removesource;
    @XmlElement(name = "gPREINSTALL")
    protected BUILDCONTROLType.GPREINSTALL gpreinstall;
    @XmlElement(name = "gPOSTINSTALL")
    protected BUILDCONTROLType.GPOSTINSTALL gpostinstall;
    @XmlElementRef(name = "DOCIDNEW", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docidnew;
    @XmlElement(name = "gADDNLSYSREQ")
    protected BUILDCONTROLType.GADDNLSYSREQ gaddnlsysreq;
    @XmlElementRef(name = "RESERVED97", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved97;
    @XmlElementRef(name = "RESERVED98", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved98;
    @XmlElementRef(name = "RESERVED99", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved99;
    @XmlElementRef(name = "RESERVED100", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved100;
    @XmlElementRef(name = "RESERVED101", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reserved101;
    @XmlElementRef(name = "BCONFUNCTIONALITY", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bconfunctionality;
    @XmlElementRef(name = "DELOTHERCOMPRECS", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> delothercomprecs;
    @XmlElementRef(name = "RECORDSTATUS", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordstatus;
    @XmlElementRef(name = "CURRNO", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currno;
    @XmlElement(name = "gINPUTTER")
    protected BUILDCONTROLType.GINPUTTER ginputter;
    @XmlElement(name = "gDATETIME")
    protected BUILDCONTROLType.GDATETIME gdatetime;
    @XmlElementRef(name = "AUTHORISER", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authoriser;
    @XmlElementRef(name = "COCODE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cocode;
    @XmlElementRef(name = "DEPTCODE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deptcode;
    @XmlElementRef(name = "AUDITORCODE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auditorcode;
    @XmlElementRef(name = "AUDITDATETIME", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auditdatetime;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Obtiene el valor de la propiedad glldesc.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GLLDESC }
     *     
     */
    public BUILDCONTROLType.GLLDESC getGLLDESC() {
        return glldesc;
    }

    /**
     * Define el valor de la propiedad glldesc.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GLLDESC }
     *     
     */
    public void setGLLDESC(BUILDCONTROLType.GLLDESC value) {
        this.glldesc = value;
    }

    /**
     * Obtiene el valor de la propiedad mnemonic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNEMONIC() {
        return mnemonic;
    }

    /**
     * Define el valor de la propiedad mnemonic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNEMONIC(JAXBElement<String> value) {
        this.mnemonic = value;
    }

    /**
     * Obtiene el valor de la propiedad action.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACTION() {
        return action;
    }

    /**
     * Define el valor de la propiedad action.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACTION(JAXBElement<String> value) {
        this.action = value;
    }

    /**
     * Obtiene el valor de la propiedad bconproduct.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBCONPRODUCT() {
        return bconproduct;
    }

    /**
     * Define el valor de la propiedad bconproduct.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBCONPRODUCT(JAXBElement<String> value) {
        this.bconproduct = value;
    }

    /**
     * Obtiene el valor de la propiedad savepath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSAVEPATH() {
        return savepath;
    }

    /**
     * Define el valor de la propiedad savepath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSAVEPATH(JAXBElement<String> value) {
        this.savepath = value;
    }

    /**
     * Obtiene el valor de la propiedad releasepath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRELEASEPATH() {
        return releasepath;
    }

    /**
     * Define el valor de la propiedad releasepath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRELEASEPATH(JAXBElement<String> value) {
        this.releasepath = value;
    }

    /**
     * Obtiene el valor de la propiedad gprogrambp.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GPROGRAMBP }
     *     
     */
    public BUILDCONTROLType.GPROGRAMBP getGPROGRAMBP() {
        return gprogrambp;
    }

    /**
     * Define el valor de la propiedad gprogrambp.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GPROGRAMBP }
     *     
     */
    public void setGPROGRAMBP(BUILDCONTROLType.GPROGRAMBP value) {
        this.gprogrambp = value;
    }

    /**
     * Obtiene el valor de la propiedad gjbcdevlib.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GJBCDEVLIB }
     *     
     */
    public BUILDCONTROLType.GJBCDEVLIB getGJBCDEVLIB() {
        return gjbcdevlib;
    }

    /**
     * Define el valor de la propiedad gjbcdevlib.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GJBCDEVLIB }
     *     
     */
    public void setGJBCDEVLIB(BUILDCONTROLType.GJBCDEVLIB value) {
        this.gjbcdevlib = value;
    }

    /**
     * Obtiene el valor de la propiedad gjbcdevbin.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GJBCDEVBIN }
     *     
     */
    public BUILDCONTROLType.GJBCDEVBIN getGJBCDEVBIN() {
        return gjbcdevbin;
    }

    /**
     * Define el valor de la propiedad gjbcdevbin.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GJBCDEVBIN }
     *     
     */
    public void setGJBCDEVBIN(BUILDCONTROLType.GJBCDEVBIN value) {
        this.gjbcdevbin = value;
    }

    /**
     * Obtiene el valor de la propiedad objname.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOBJNAME() {
        return objname;
    }

    /**
     * Define el valor de la propiedad objname.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOBJNAME(JAXBElement<String> value) {
        this.objname = value;
    }

    /**
     * Obtiene el valor de la propiedad gdependency.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GDEPENDENCY }
     *     
     */
    public BUILDCONTROLType.GDEPENDENCY getGDEPENDENCY() {
        return gdependency;
    }

    /**
     * Define el valor de la propiedad gdependency.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GDEPENDENCY }
     *     
     */
    public void setGDEPENDENCY(BUILDCONTROLType.GDEPENDENCY value) {
        this.gdependency = value;
    }

    /**
     * Obtiene el valor de la propiedad gourreference.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GOURREFERENCE }
     *     
     */
    public BUILDCONTROLType.GOURREFERENCE getGOURREFERENCE() {
        return gourreference;
    }

    /**
     * Define el valor de la propiedad gourreference.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GOURREFERENCE }
     *     
     */
    public void setGOURREFERENCE(BUILDCONTROLType.GOURREFERENCE value) {
        this.gourreference = value;
    }

    /**
     * Obtiene el valor de la propiedad ofssourceid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFSSOURCEID() {
        return ofssourceid;
    }

    /**
     * Define el valor de la propiedad ofssourceid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFSSOURCEID(JAXBElement<String> value) {
        this.ofssourceid = value;
    }

    /**
     * Obtiene el valor de la propiedad gdldefine.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GDLDEFINE }
     *     
     */
    public BUILDCONTROLType.GDLDEFINE getGDLDEFINE() {
        return gdldefine;
    }

    /**
     * Define el valor de la propiedad gdldefine.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GDLDEFINE }
     *     
     */
    public void setGDLDEFINE(BUILDCONTROLType.GDLDEFINE value) {
        this.gdldefine = value;
    }

    /**
     * Obtiene el valor de la propiedad glocreftable.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GLOCREFTABLE }
     *     
     */
    public BUILDCONTROLType.GLOCREFTABLE getGLOCREFTABLE() {
        return glocreftable;
    }

    /**
     * Define el valor de la propiedad glocreftable.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GLOCREFTABLE }
     *     
     */
    public void setGLOCREFTABLE(BUILDCONTROLType.GLOCREFTABLE value) {
        this.glocreftable = value;
    }

    /**
     * Obtiene el valor de la propiedad gssapplname.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GSSAPPLNAME }
     *     
     */
    public BUILDCONTROLType.GSSAPPLNAME getGSSAPPLNAME() {
        return gssapplname;
    }

    /**
     * Define el valor de la propiedad gssapplname.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GSSAPPLNAME }
     *     
     */
    public void setGSSAPPLNAME(BUILDCONTROLType.GSSAPPLNAME value) {
        this.gssapplname = value;
    }

    /**
     * Obtiene el valor de la propiedad gbuildnewdict.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GBUILDNEWDICT }
     *     
     */
    public BUILDCONTROLType.GBUILDNEWDICT getGBUILDNEWDICT() {
        return gbuildnewdict;
    }

    /**
     * Define el valor de la propiedad gbuildnewdict.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GBUILDNEWDICT }
     *     
     */
    public void setGBUILDNEWDICT(BUILDCONTROLType.GBUILDNEWDICT value) {
        this.gbuildnewdict = value;
    }

    /**
     * Obtiene el valor de la propiedad gwsfilename.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GWSFILENAME }
     *     
     */
    public BUILDCONTROLType.GWSFILENAME getGWSFILENAME() {
        return gwsfilename;
    }

    /**
     * Define el valor de la propiedad gwsfilename.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GWSFILENAME }
     *     
     */
    public void setGWSFILENAME(BUILDCONTROLType.GWSFILENAME value) {
        this.gwsfilename = value;
    }

    /**
     * Obtiene el valor de la propiedad geninstalldoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGENINSTALLDOC() {
        return geninstalldoc;
    }

    /**
     * Define el valor de la propiedad geninstalldoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGENINSTALLDOC(JAXBElement<String> value) {
        this.geninstalldoc = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved47.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED47() {
        return reserved47;
    }

    /**
     * Define el valor de la propiedad reserved47.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED47(JAXBElement<String> value) {
        this.reserved47 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved48.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED48() {
        return reserved48;
    }

    /**
     * Define el valor de la propiedad reserved48.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED48(JAXBElement<String> value) {
        this.reserved48 = value;
    }

    /**
     * Obtiene el valor de la propiedad gupdtablename.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GUPDTABLENAME }
     *     
     */
    public BUILDCONTROLType.GUPDTABLENAME getGUPDTABLENAME() {
        return gupdtablename;
    }

    /**
     * Define el valor de la propiedad gupdtablename.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GUPDTABLENAME }
     *     
     */
    public void setGUPDTABLENAME(BUILDCONTROLType.GUPDTABLENAME value) {
        this.gupdtablename = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved60.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED60() {
        return reserved60;
    }

    /**
     * Define el valor de la propiedad reserved60.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED60(JAXBElement<String> value) {
        this.reserved60 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved61.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED61() {
        return reserved61;
    }

    /**
     * Define el valor de la propiedad reserved61.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED61(JAXBElement<String> value) {
        this.reserved61 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved62.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED62() {
        return reserved62;
    }

    /**
     * Define el valor de la propiedad reserved62.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED62(JAXBElement<String> value) {
        this.reserved62 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved63.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED63() {
        return reserved63;
    }

    /**
     * Define el valor de la propiedad reserved63.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED63(JAXBElement<String> value) {
        this.reserved63 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved64.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED64() {
        return reserved64;
    }

    /**
     * Define el valor de la propiedad reserved64.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED64(JAXBElement<String> value) {
        this.reserved64 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved65.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED65() {
        return reserved65;
    }

    /**
     * Define el valor de la propiedad reserved65.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED65(JAXBElement<String> value) {
        this.reserved65 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved66.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED66() {
        return reserved66;
    }

    /**
     * Define el valor de la propiedad reserved66.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED66(JAXBElement<String> value) {
        this.reserved66 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved67.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED67() {
        return reserved67;
    }

    /**
     * Define el valor de la propiedad reserved67.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED67(JAXBElement<String> value) {
        this.reserved67 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved68.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED68() {
        return reserved68;
    }

    /**
     * Define el valor de la propiedad reserved68.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED68(JAXBElement<String> value) {
        this.reserved68 = value;
    }

    /**
     * Obtiene el valor de la propiedad gfilevocid.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GFILEVOCID }
     *     
     */
    public BUILDCONTROLType.GFILEVOCID getGFILEVOCID() {
        return gfilevocid;
    }

    /**
     * Define el valor de la propiedad gfilevocid.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GFILEVOCID }
     *     
     */
    public void setGFILEVOCID(BUILDCONTROLType.GFILEVOCID value) {
        this.gfilevocid = value;
    }

    /**
     * Obtiene el valor de la propiedad gshellcmd.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GSHELLCMD }
     *     
     */
    public BUILDCONTROLType.GSHELLCMD getGSHELLCMD() {
        return gshellcmd;
    }

    /**
     * Define el valor de la propiedad gshellcmd.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GSHELLCMD }
     *     
     */
    public void setGSHELLCMD(BUILDCONTROLType.GSHELLCMD value) {
        this.gshellcmd = value;
    }

    /**
     * Obtiene el valor de la propiedad greleaseorder.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GRELEASEORDER }
     *     
     */
    public BUILDCONTROLType.GRELEASEORDER getGRELEASEORDER() {
        return greleaseorder;
    }

    /**
     * Define el valor de la propiedad greleaseorder.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GRELEASEORDER }
     *     
     */
    public void setGRELEASEORDER(BUILDCONTROLType.GRELEASEORDER value) {
        this.greleaseorder = value;
    }

    /**
     * Obtiene el valor de la propiedad authsplinstr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAUTHSPLINSTR() {
        return authsplinstr;
    }

    /**
     * Define el valor de la propiedad authsplinstr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAUTHSPLINSTR(JAXBElement<String> value) {
        this.authsplinstr = value;
    }

    /**
     * Obtiene el valor de la propiedad createlib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCREATELIB() {
        return createlib;
    }

    /**
     * Define el valor de la propiedad createlib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCREATELIB(JAXBElement<String> value) {
        this.createlib = value;
    }

    /**
     * Obtiene el valor de la propiedad createbin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCREATEBIN() {
        return createbin;
    }

    /**
     * Define el valor de la propiedad createbin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCREATEBIN(JAXBElement<String> value) {
        this.createbin = value;
    }

    /**
     * Obtiene el valor de la propiedad createrelbp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCREATERELBP() {
        return createrelbp;
    }

    /**
     * Define el valor de la propiedad createrelbp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCREATERELBP(JAXBElement<String> value) {
        this.createrelbp = value;
    }

    /**
     * Obtiene el valor de la propiedad dlsavepath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDLSAVEPATH() {
        return dlsavepath;
    }

    /**
     * Define el valor de la propiedad dlsavepath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDLSAVEPATH(JAXBElement<String> value) {
        this.dlsavepath = value;
    }

    /**
     * Obtiene el valor de la propiedad dlrestorepath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDLRESTOREPATH() {
        return dlrestorepath;
    }

    /**
     * Define el valor de la propiedad dlrestorepath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDLRESTOREPATH(JAXBElement<String> value) {
        this.dlrestorepath = value;
    }

    /**
     * Obtiene el valor de la propiedad programos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPROGRAMOS() {
        return programos;
    }

    /**
     * Define el valor de la propiedad programos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPROGRAMOS(JAXBElement<String> value) {
        this.programos = value;
    }

    /**
     * Obtiene el valor de la propiedad clrprocesslog.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLRPROCESSLOG() {
        return clrprocesslog;
    }

    /**
     * Define el valor de la propiedad clrprocesslog.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLRPROCESSLOG(JAXBElement<String> value) {
        this.clrprocesslog = value;
    }

    /**
     * Obtiene el valor de la propiedad gactivity.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GACTIVITY }
     *     
     */
    public BUILDCONTROLType.GACTIVITY getGACTIVITY() {
        return gactivity;
    }

    /**
     * Define el valor de la propiedad gactivity.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GACTIVITY }
     *     
     */
    public void setGACTIVITY(BUILDCONTROLType.GACTIVITY value) {
        this.gactivity = value;
    }

    /**
     * Obtiene el valor de la propiedad gprocesserr.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GPROCESSERR }
     *     
     */
    public BUILDCONTROLType.GPROCESSERR getGPROCESSERR() {
        return gprocesserr;
    }

    /**
     * Define el valor de la propiedad gprocesserr.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GPROCESSERR }
     *     
     */
    public void setGPROCESSERR(BUILDCONTROLType.GPROCESSERR value) {
        this.gprocesserr = value;
    }

    /**
     * Obtiene el valor de la propiedad gsaveddate.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GSAVEDDATE }
     *     
     */
    public BUILDCONTROLType.GSAVEDDATE getGSAVEDDATE() {
        return gsaveddate;
    }

    /**
     * Define el valor de la propiedad gsaveddate.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GSAVEDDATE }
     *     
     */
    public void setGSAVEDDATE(BUILDCONTROLType.GSAVEDDATE value) {
        this.gsaveddate = value;
    }

    /**
     * Obtiene el valor de la propiedad greleasedate.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GRELEASEDATE }
     *     
     */
    public BUILDCONTROLType.GRELEASEDATE getGRELEASEDATE() {
        return greleasedate;
    }

    /**
     * Define el valor de la propiedad greleasedate.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GRELEASEDATE }
     *     
     */
    public void setGRELEASEDATE(BUILDCONTROLType.GRELEASEDATE value) {
        this.greleasedate = value;
    }

    /**
     * Obtiene el valor de la propiedad grelstage.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GRELSTAGE }
     *     
     */
    public BUILDCONTROLType.GRELSTAGE getGRELSTAGE() {
        return grelstage;
    }

    /**
     * Define el valor de la propiedad grelstage.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GRELSTAGE }
     *     
     */
    public void setGRELSTAGE(BUILDCONTROLType.GRELSTAGE value) {
        this.grelstage = value;
    }

    /**
     * Obtiene el valor de la propiedad viewreport.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVIEWREPORT() {
        return viewreport;
    }

    /**
     * Define el valor de la propiedad viewreport.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVIEWREPORT(JAXBElement<String> value) {
        this.viewreport = value;
    }

    /**
     * Obtiene el valor de la propiedad removesource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREMOVESOURCE() {
        return removesource;
    }

    /**
     * Define el valor de la propiedad removesource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREMOVESOURCE(JAXBElement<String> value) {
        this.removesource = value;
    }

    /**
     * Obtiene el valor de la propiedad gpreinstall.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GPREINSTALL }
     *     
     */
    public BUILDCONTROLType.GPREINSTALL getGPREINSTALL() {
        return gpreinstall;
    }

    /**
     * Define el valor de la propiedad gpreinstall.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GPREINSTALL }
     *     
     */
    public void setGPREINSTALL(BUILDCONTROLType.GPREINSTALL value) {
        this.gpreinstall = value;
    }

    /**
     * Obtiene el valor de la propiedad gpostinstall.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GPOSTINSTALL }
     *     
     */
    public BUILDCONTROLType.GPOSTINSTALL getGPOSTINSTALL() {
        return gpostinstall;
    }

    /**
     * Define el valor de la propiedad gpostinstall.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GPOSTINSTALL }
     *     
     */
    public void setGPOSTINSTALL(BUILDCONTROLType.GPOSTINSTALL value) {
        this.gpostinstall = value;
    }

    /**
     * Obtiene el valor de la propiedad docidnew.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOCIDNEW() {
        return docidnew;
    }

    /**
     * Define el valor de la propiedad docidnew.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOCIDNEW(JAXBElement<String> value) {
        this.docidnew = value;
    }

    /**
     * Obtiene el valor de la propiedad gaddnlsysreq.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GADDNLSYSREQ }
     *     
     */
    public BUILDCONTROLType.GADDNLSYSREQ getGADDNLSYSREQ() {
        return gaddnlsysreq;
    }

    /**
     * Define el valor de la propiedad gaddnlsysreq.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GADDNLSYSREQ }
     *     
     */
    public void setGADDNLSYSREQ(BUILDCONTROLType.GADDNLSYSREQ value) {
        this.gaddnlsysreq = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved97.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED97() {
        return reserved97;
    }

    /**
     * Define el valor de la propiedad reserved97.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED97(JAXBElement<String> value) {
        this.reserved97 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved98.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED98() {
        return reserved98;
    }

    /**
     * Define el valor de la propiedad reserved98.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED98(JAXBElement<String> value) {
        this.reserved98 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved99.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED99() {
        return reserved99;
    }

    /**
     * Define el valor de la propiedad reserved99.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED99(JAXBElement<String> value) {
        this.reserved99 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved100.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED100() {
        return reserved100;
    }

    /**
     * Define el valor de la propiedad reserved100.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED100(JAXBElement<String> value) {
        this.reserved100 = value;
    }

    /**
     * Obtiene el valor de la propiedad reserved101.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESERVED101() {
        return reserved101;
    }

    /**
     * Define el valor de la propiedad reserved101.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESERVED101(JAXBElement<String> value) {
        this.reserved101 = value;
    }

    /**
     * Obtiene el valor de la propiedad bconfunctionality.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBCONFUNCTIONALITY() {
        return bconfunctionality;
    }

    /**
     * Define el valor de la propiedad bconfunctionality.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBCONFUNCTIONALITY(JAXBElement<String> value) {
        this.bconfunctionality = value;
    }

    /**
     * Obtiene el valor de la propiedad delothercomprecs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELOTHERCOMPRECS() {
        return delothercomprecs;
    }

    /**
     * Define el valor de la propiedad delothercomprecs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELOTHERCOMPRECS(JAXBElement<String> value) {
        this.delothercomprecs = value;
    }

    /**
     * Obtiene el valor de la propiedad recordstatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRECORDSTATUS() {
        return recordstatus;
    }

    /**
     * Define el valor de la propiedad recordstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRECORDSTATUS(JAXBElement<String> value) {
        this.recordstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad currno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCURRNO() {
        return currno;
    }

    /**
     * Define el valor de la propiedad currno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCURRNO(JAXBElement<String> value) {
        this.currno = value;
    }

    /**
     * Obtiene el valor de la propiedad ginputter.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GINPUTTER }
     *     
     */
    public BUILDCONTROLType.GINPUTTER getGINPUTTER() {
        return ginputter;
    }

    /**
     * Define el valor de la propiedad ginputter.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GINPUTTER }
     *     
     */
    public void setGINPUTTER(BUILDCONTROLType.GINPUTTER value) {
        this.ginputter = value;
    }

    /**
     * Obtiene el valor de la propiedad gdatetime.
     * 
     * @return
     *     possible object is
     *     {@link BUILDCONTROLType.GDATETIME }
     *     
     */
    public BUILDCONTROLType.GDATETIME getGDATETIME() {
        return gdatetime;
    }

    /**
     * Define el valor de la propiedad gdatetime.
     * 
     * @param value
     *     allowed object is
     *     {@link BUILDCONTROLType.GDATETIME }
     *     
     */
    public void setGDATETIME(BUILDCONTROLType.GDATETIME value) {
        this.gdatetime = value;
    }

    /**
     * Obtiene el valor de la propiedad authoriser.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAUTHORISER() {
        return authoriser;
    }

    /**
     * Define el valor de la propiedad authoriser.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAUTHORISER(JAXBElement<String> value) {
        this.authoriser = value;
    }

    /**
     * Obtiene el valor de la propiedad cocode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOCODE() {
        return cocode;
    }

    /**
     * Define el valor de la propiedad cocode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOCODE(JAXBElement<String> value) {
        this.cocode = value;
    }

    /**
     * Obtiene el valor de la propiedad deptcode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEPTCODE() {
        return deptcode;
    }

    /**
     * Define el valor de la propiedad deptcode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEPTCODE(JAXBElement<String> value) {
        this.deptcode = value;
    }

    /**
     * Obtiene el valor de la propiedad auditorcode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAUDITORCODE() {
        return auditorcode;
    }

    /**
     * Define el valor de la propiedad auditorcode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAUDITORCODE(JAXBElement<String> value) {
        this.auditorcode = value;
    }

    /**
     * Obtiene el valor de la propiedad auditdatetime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAUDITDATETIME() {
        return auditdatetime;
    }

    /**
     * Define el valor de la propiedad auditdatetime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAUDITDATETIME(JAXBElement<String> value) {
        this.auditdatetime = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     *         &lt;element name="mACTIVITY" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgPROCESSINFO" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PROCESSINFO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mactivity"
    })
    public static class GACTIVITY {

        @XmlElement(name = "mACTIVITY")
        protected List<BUILDCONTROLType.GACTIVITY.MACTIVITY> mactivity;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mactivity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mactivity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMACTIVITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GACTIVITY.MACTIVITY }
         * 
         * 
         */
        public List<BUILDCONTROLType.GACTIVITY.MACTIVITY> getMACTIVITY() {
            if (mactivity == null) {
                mactivity = new ArrayList<BUILDCONTROLType.GACTIVITY.MACTIVITY>();
            }
            return this.mactivity;
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
         *         &lt;element name="ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgPROCESSINFO" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PROCESSINFO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "activity",
            "sgPROCESSINFO"
        })
        public static class MACTIVITY {

            @XmlElementRef(name = "ACTIVITY", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> activity;
            protected BUILDCONTROLType.GACTIVITY.MACTIVITY.SgPROCESSINFO sgPROCESSINFO;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

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
             * Obtiene el valor de la propiedad sgPROCESSINFO.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GACTIVITY.MACTIVITY.SgPROCESSINFO }
             *     
             */
            public BUILDCONTROLType.GACTIVITY.MACTIVITY.SgPROCESSINFO getSgPROCESSINFO() {
                return sgPROCESSINFO;
            }

            /**
             * Define el valor de la propiedad sgPROCESSINFO.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GACTIVITY.MACTIVITY.SgPROCESSINFO }
             *     
             */
            public void setSgPROCESSINFO(BUILDCONTROLType.GACTIVITY.MACTIVITY.SgPROCESSINFO value) {
                this.sgPROCESSINFO = value;
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
             *         &lt;element name="PROCESSINFO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "processinfo"
            })
            public static class SgPROCESSINFO {

                @XmlElement(name = "PROCESSINFO", nillable = true)
                protected List<String> processinfo;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the processinfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the processinfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPROCESSINFO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPROCESSINFO() {
                    if (processinfo == null) {
                        processinfo = new ArrayList<String>();
                    }
                    return this.processinfo;
                }

                /**
                 * Obtiene el valor de la propiedad sg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Define el valor de la propiedad sg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

            }

        }

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
     *         &lt;element name="ADDNLSYSREQ" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "addnlsysreq"
    })
    public static class GADDNLSYSREQ {

        @XmlElement(name = "ADDNLSYSREQ", nillable = true)
        protected List<String> addnlsysreq;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the addnlsysreq property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addnlsysreq property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADDNLSYSREQ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getADDNLSYSREQ() {
            if (addnlsysreq == null) {
                addnlsysreq = new ArrayList<String>();
            }
            return this.addnlsysreq;
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
     *         &lt;element name="BUILDNEWDICT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "buildnewdict"
    })
    public static class GBUILDNEWDICT {

        @XmlElement(name = "BUILDNEWDICT", nillable = true)
        protected List<String> buildnewdict;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the buildnewdict property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the buildnewdict property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBUILDNEWDICT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBUILDNEWDICT() {
            if (buildnewdict == null) {
                buildnewdict = new ArrayList<String>();
            }
            return this.buildnewdict;
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
     *         &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "datetime"
    })
    public static class GDATETIME {

        @XmlElement(name = "DATETIME", nillable = true)
        protected List<String> datetime;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the datetime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datetime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATETIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDATETIME() {
            if (datetime == null) {
                datetime = new ArrayList<String>();
            }
            return this.datetime;
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
     *         &lt;element name="DEPENDENCY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "dependency"
    })
    public static class GDEPENDENCY {

        @XmlElement(name = "DEPENDENCY", nillable = true)
        protected List<String> dependency;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the dependency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dependency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDEPENDENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDEPENDENCY() {
            if (dependency == null) {
                dependency = new ArrayList<String>();
            }
            return this.dependency;
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
     *         &lt;element name="mDLDEFINE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DLDEFINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FROMCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TOCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mdldefine"
    })
    public static class GDLDEFINE {

        @XmlElement(name = "mDLDEFINE")
        protected List<BUILDCONTROLType.GDLDEFINE.MDLDEFINE> mdldefine;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mdldefine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mdldefine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMDLDEFINE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GDLDEFINE.MDLDEFINE }
         * 
         * 
         */
        public List<BUILDCONTROLType.GDLDEFINE.MDLDEFINE> getMDLDEFINE() {
            if (mdldefine == null) {
                mdldefine = new ArrayList<BUILDCONTROLType.GDLDEFINE.MDLDEFINE>();
            }
            return this.mdldefine;
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
         *         &lt;element name="DLDEFINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FROMCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TOCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dldefine",
            "fromcompany",
            "tocompany"
        })
        public static class MDLDEFINE {

            @XmlElementRef(name = "DLDEFINE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> dldefine;
            @XmlElementRef(name = "FROMCOMPANY", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fromcompany;
            @XmlElementRef(name = "TOCOMPANY", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> tocompany;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad dldefine.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getDLDEFINE() {
                return dldefine;
            }

            /**
             * Define el valor de la propiedad dldefine.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setDLDEFINE(JAXBElement<String> value) {
                this.dldefine = value;
            }

            /**
             * Obtiene el valor de la propiedad fromcompany.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getFROMCOMPANY() {
                return fromcompany;
            }

            /**
             * Define el valor de la propiedad fromcompany.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setFROMCOMPANY(JAXBElement<String> value) {
                this.fromcompany = value;
            }

            /**
             * Obtiene el valor de la propiedad tocompany.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTOCOMPANY() {
                return tocompany;
            }

            /**
             * Define el valor de la propiedad tocompany.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTOCOMPANY(JAXBElement<String> value) {
                this.tocompany = value;
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
     *         &lt;element name="mFILEVOCID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FILEVOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FILESTOCREATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mfilevocid"
    })
    public static class GFILEVOCID {

        @XmlElement(name = "mFILEVOCID")
        protected List<BUILDCONTROLType.GFILEVOCID.MFILEVOCID> mfilevocid;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mfilevocid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mfilevocid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMFILEVOCID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GFILEVOCID.MFILEVOCID }
         * 
         * 
         */
        public List<BUILDCONTROLType.GFILEVOCID.MFILEVOCID> getMFILEVOCID() {
            if (mfilevocid == null) {
                mfilevocid = new ArrayList<BUILDCONTROLType.GFILEVOCID.MFILEVOCID>();
            }
            return this.mfilevocid;
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
         *         &lt;element name="FILEVOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FILESTOCREATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "filevocid",
            "filestocreate"
        })
        public static class MFILEVOCID {

            @XmlElementRef(name = "FILEVOCID", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> filevocid;
            @XmlElementRef(name = "FILESTOCREATE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> filestocreate;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad filevocid.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getFILEVOCID() {
                return filevocid;
            }

            /**
             * Define el valor de la propiedad filevocid.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setFILEVOCID(JAXBElement<String> value) {
                this.filevocid = value;
            }

            /**
             * Obtiene el valor de la propiedad filestocreate.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getFILESTOCREATE() {
                return filestocreate;
            }

            /**
             * Define el valor de la propiedad filestocreate.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setFILESTOCREATE(JAXBElement<String> value) {
                this.filestocreate = value;
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
     *         &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inputter"
    })
    public static class GINPUTTER {

        @XmlElement(name = "INPUTTER", nillable = true)
        protected List<String> inputter;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inputter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inputter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINPUTTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINPUTTER() {
            if (inputter == null) {
                inputter = new ArrayList<String>();
            }
            return this.inputter;
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
     *         &lt;element name="JBCDEVBIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "jbcdevbin"
    })
    public static class GJBCDEVBIN {

        @XmlElement(name = "JBCDEVBIN", nillable = true)
        protected List<String> jbcdevbin;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the jbcdevbin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jbcdevbin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJBCDEVBIN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getJBCDEVBIN() {
            if (jbcdevbin == null) {
                jbcdevbin = new ArrayList<String>();
            }
            return this.jbcdevbin;
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
     *         &lt;element name="JBCDEVLIB" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "jbcdevlib"
    })
    public static class GJBCDEVLIB {

        @XmlElement(name = "JBCDEVLIB", nillable = true)
        protected List<String> jbcdevlib;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the jbcdevlib property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jbcdevlib property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJBCDEVLIB().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getJBCDEVLIB() {
            if (jbcdevlib == null) {
                jbcdevlib = new ArrayList<String>();
            }
            return this.jbcdevlib;
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
     *         &lt;element name="mLLDESC" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sgLLDESC" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mlldesc"
    })
    public static class GLLDESC {

        @XmlElement(name = "mLLDESC")
        protected List<BUILDCONTROLType.GLLDESC.MLLDESC> mlldesc;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mlldesc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mlldesc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMLLDESC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GLLDESC.MLLDESC }
         * 
         * 
         */
        public List<BUILDCONTROLType.GLLDESC.MLLDESC> getMLLDESC() {
            if (mlldesc == null) {
                mlldesc = new ArrayList<BUILDCONTROLType.GLLDESC.MLLDESC>();
            }
            return this.mlldesc;
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
         *         &lt;element name="sgLLDESC" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "sgLLDESC"
        })
        public static class MLLDESC {

            protected BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC sgLLDESC;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad sgLLDESC.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC }
             *     
             */
            public BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC getSgLLDESC() {
                return sgLLDESC;
            }

            /**
             * Define el valor de la propiedad sgLLDESC.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC }
             *     
             */
            public void setSgLLDESC(BUILDCONTROLType.GLLDESC.MLLDESC.SgLLDESC value) {
                this.sgLLDESC = value;
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
             *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "desc"
            })
            public static class SgLLDESC {

                @XmlElement(name = "DESC", nillable = true)
                protected List<String> desc;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the desc property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the desc property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDESC().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getDESC() {
                    if (desc == null) {
                        desc = new ArrayList<String>();
                    }
                    return this.desc;
                }

                /**
                 * Obtiene el valor de la propiedad sg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Define el valor de la propiedad sg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

            }

        }

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
     *         &lt;element name="mLOCREFTABLE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LOCREFTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgLOCALTABLE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LOCALTABLE" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mlocreftable"
    })
    public static class GLOCREFTABLE {

        @XmlElement(name = "mLOCREFTABLE")
        protected List<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE> mlocreftable;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mlocreftable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mlocreftable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMLOCREFTABLE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE }
         * 
         * 
         */
        public List<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE> getMLOCREFTABLE() {
            if (mlocreftable == null) {
                mlocreftable = new ArrayList<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE>();
            }
            return this.mlocreftable;
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
         *         &lt;element name="LOCREFTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgLOCALTABLE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LOCALTABLE" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "locreftable",
            "sgLOCALTABLE"
        })
        public static class MLOCREFTABLE {

            @XmlElementRef(name = "LOCREFTABLE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> locreftable;
            protected BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE sgLOCALTABLE;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad locreftable.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getLOCREFTABLE() {
                return locreftable;
            }

            /**
             * Define el valor de la propiedad locreftable.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setLOCREFTABLE(JAXBElement<String> value) {
                this.locreftable = value;
            }

            /**
             * Obtiene el valor de la propiedad sgLOCALTABLE.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE }
             *     
             */
            public BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE getSgLOCALTABLE() {
                return sgLOCALTABLE;
            }

            /**
             * Define el valor de la propiedad sgLOCALTABLE.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE }
             *     
             */
            public void setSgLOCALTABLE(BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE value) {
                this.sgLOCALTABLE = value;
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
             *         &lt;element name="LOCALTABLE" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "localtable"
            })
            public static class SgLOCALTABLE {

                @XmlElement(name = "LOCALTABLE")
                protected List<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE.LOCALTABLE> localtable;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the localtable property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the localtable property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLOCALTABLE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE.LOCALTABLE }
                 * 
                 * 
                 */
                public List<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE.LOCALTABLE> getLOCALTABLE() {
                    if (localtable == null) {
                        localtable = new ArrayList<BUILDCONTROLType.GLOCREFTABLE.MLOCREFTABLE.SgLOCALTABLE.LOCALTABLE>();
                    }
                    return this.localtable;
                }

                /**
                 * Obtiene el valor de la propiedad sg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Define el valor de la propiedad sg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="LOCALTABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TABLEASSOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "localtable",
                    "tableassoc"
                })
                public static class LOCALTABLE {

                    @XmlElementRef(name = "LOCALTABLE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> localtable;
                    @XmlElementRef(name = "TABLEASSOC", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> tableassoc;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Obtiene el valor de la propiedad localtable.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getLOCALTABLE() {
                        return localtable;
                    }

                    /**
                     * Define el valor de la propiedad localtable.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setLOCALTABLE(JAXBElement<String> value) {
                        this.localtable = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad tableassoc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getTABLEASSOC() {
                        return tableassoc;
                    }

                    /**
                     * Define el valor de la propiedad tableassoc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setTABLEASSOC(JAXBElement<String> value) {
                        this.tableassoc = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad s.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Define el valor de la propiedad s.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

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
     *         &lt;element name="mOURREFERENCE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OURREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="THEIRREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ISSUEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mourreference"
    })
    public static class GOURREFERENCE {

        @XmlElement(name = "mOURREFERENCE")
        protected List<BUILDCONTROLType.GOURREFERENCE.MOURREFERENCE> mourreference;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mourreference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mourreference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMOURREFERENCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GOURREFERENCE.MOURREFERENCE }
         * 
         * 
         */
        public List<BUILDCONTROLType.GOURREFERENCE.MOURREFERENCE> getMOURREFERENCE() {
            if (mourreference == null) {
                mourreference = new ArrayList<BUILDCONTROLType.GOURREFERENCE.MOURREFERENCE>();
            }
            return this.mourreference;
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
         *         &lt;element name="OURREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="THEIRREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ISSUEDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ourreference",
            "theirreference",
            "issuedesc"
        })
        public static class MOURREFERENCE {

            @XmlElementRef(name = "OURREFERENCE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> ourreference;
            @XmlElementRef(name = "THEIRREFERENCE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> theirreference;
            @XmlElementRef(name = "ISSUEDESC", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> issuedesc;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad ourreference.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getOURREFERENCE() {
                return ourreference;
            }

            /**
             * Define el valor de la propiedad ourreference.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setOURREFERENCE(JAXBElement<String> value) {
                this.ourreference = value;
            }

            /**
             * Obtiene el valor de la propiedad theirreference.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTHEIRREFERENCE() {
                return theirreference;
            }

            /**
             * Define el valor de la propiedad theirreference.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTHEIRREFERENCE(JAXBElement<String> value) {
                this.theirreference = value;
            }

            /**
             * Obtiene el valor de la propiedad issuedesc.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getISSUEDESC() {
                return issuedesc;
            }

            /**
             * Define el valor de la propiedad issuedesc.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setISSUEDESC(JAXBElement<String> value) {
                this.issuedesc = value;
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
     *         &lt;element name="mPOSTINSTALL" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sgPOSTINSTALL" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="POSTINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mpostinstall"
    })
    public static class GPOSTINSTALL {

        @XmlElement(name = "mPOSTINSTALL")
        protected List<BUILDCONTROLType.GPOSTINSTALL.MPOSTINSTALL> mpostinstall;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mpostinstall property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mpostinstall property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPOSTINSTALL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GPOSTINSTALL.MPOSTINSTALL }
         * 
         * 
         */
        public List<BUILDCONTROLType.GPOSTINSTALL.MPOSTINSTALL> getMPOSTINSTALL() {
            if (mpostinstall == null) {
                mpostinstall = new ArrayList<BUILDCONTROLType.GPOSTINSTALL.MPOSTINSTALL>();
            }
            return this.mpostinstall;
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
         *         &lt;element name="sgPOSTINSTALL" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="POSTINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "sgPOSTINSTALL"
        })
        public static class MPOSTINSTALL {

            protected BUILDCONTROLType.GPOSTINSTALL.MPOSTINSTALL.SgPOSTINSTALL sgPOSTINSTALL;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad sgPOSTINSTALL.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GPOSTINSTALL.MPOSTINSTALL.SgPOSTINSTALL }
             *     
             */
            public BUILDCONTROLType.GPOSTINSTALL.MPOSTINSTALL.SgPOSTINSTALL getSgPOSTINSTALL() {
                return sgPOSTINSTALL;
            }

            /**
             * Define el valor de la propiedad sgPOSTINSTALL.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GPOSTINSTALL.MPOSTINSTALL.SgPOSTINSTALL }
             *     
             */
            public void setSgPOSTINSTALL(BUILDCONTROLType.GPOSTINSTALL.MPOSTINSTALL.SgPOSTINSTALL value) {
                this.sgPOSTINSTALL = value;
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
             *         &lt;element name="POSTINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "postinstall"
            })
            public static class SgPOSTINSTALL {

                @XmlElement(name = "POSTINSTALL", nillable = true)
                protected List<String> postinstall;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the postinstall property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the postinstall property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPOSTINSTALL().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPOSTINSTALL() {
                    if (postinstall == null) {
                        postinstall = new ArrayList<String>();
                    }
                    return this.postinstall;
                }

                /**
                 * Obtiene el valor de la propiedad sg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Define el valor de la propiedad sg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

            }

        }

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
     *         &lt;element name="mPREINSTALL" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sgPREINSTALL" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PREINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mpreinstall"
    })
    public static class GPREINSTALL {

        @XmlElement(name = "mPREINSTALL")
        protected List<BUILDCONTROLType.GPREINSTALL.MPREINSTALL> mpreinstall;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mpreinstall property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mpreinstall property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPREINSTALL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GPREINSTALL.MPREINSTALL }
         * 
         * 
         */
        public List<BUILDCONTROLType.GPREINSTALL.MPREINSTALL> getMPREINSTALL() {
            if (mpreinstall == null) {
                mpreinstall = new ArrayList<BUILDCONTROLType.GPREINSTALL.MPREINSTALL>();
            }
            return this.mpreinstall;
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
         *         &lt;element name="sgPREINSTALL" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PREINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "sgPREINSTALL"
        })
        public static class MPREINSTALL {

            protected BUILDCONTROLType.GPREINSTALL.MPREINSTALL.SgPREINSTALL sgPREINSTALL;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad sgPREINSTALL.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GPREINSTALL.MPREINSTALL.SgPREINSTALL }
             *     
             */
            public BUILDCONTROLType.GPREINSTALL.MPREINSTALL.SgPREINSTALL getSgPREINSTALL() {
                return sgPREINSTALL;
            }

            /**
             * Define el valor de la propiedad sgPREINSTALL.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GPREINSTALL.MPREINSTALL.SgPREINSTALL }
             *     
             */
            public void setSgPREINSTALL(BUILDCONTROLType.GPREINSTALL.MPREINSTALL.SgPREINSTALL value) {
                this.sgPREINSTALL = value;
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
             *         &lt;element name="PREINSTALL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "preinstall"
            })
            public static class SgPREINSTALL {

                @XmlElement(name = "PREINSTALL", nillable = true)
                protected List<String> preinstall;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the preinstall property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the preinstall property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPREINSTALL().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPREINSTALL() {
                    if (preinstall == null) {
                        preinstall = new ArrayList<String>();
                    }
                    return this.preinstall;
                }

                /**
                 * Obtiene el valor de la propiedad sg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Define el valor de la propiedad sg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

            }

        }

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
     *         &lt;element name="PROCESSERR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "processerr"
    })
    public static class GPROCESSERR {

        @XmlElement(name = "PROCESSERR", nillable = true)
        protected List<String> processerr;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the processerr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the processerr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPROCESSERR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPROCESSERR() {
            if (processerr == null) {
                processerr = new ArrayList<String>();
            }
            return this.processerr;
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
     *         &lt;element name="mPROGRAMBP" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PROGRAMBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgSELECTCMD" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SELECTCMD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MVRESERVED9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELEASEBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mprogrambp"
    })
    public static class GPROGRAMBP {

        @XmlElement(name = "mPROGRAMBP")
        protected List<BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP> mprogrambp;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mprogrambp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mprogrambp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPROGRAMBP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP }
         * 
         * 
         */
        public List<BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP> getMPROGRAMBP() {
            if (mprogrambp == null) {
                mprogrambp = new ArrayList<BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP>();
            }
            return this.mprogrambp;
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
         *         &lt;element name="PROGRAMBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgSELECTCMD" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SELECTCMD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MVRESERVED9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELEASEBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "programbp",
            "sgSELECTCMD",
            "mvreserved9",
            "releasebp"
        })
        public static class MPROGRAMBP {

            @XmlElementRef(name = "PROGRAMBP", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> programbp;
            protected BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD sgSELECTCMD;
            @XmlElementRef(name = "MVRESERVED9", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> mvreserved9;
            @XmlElementRef(name = "RELEASEBP", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> releasebp;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad programbp.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getPROGRAMBP() {
                return programbp;
            }

            /**
             * Define el valor de la propiedad programbp.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setPROGRAMBP(JAXBElement<String> value) {
                this.programbp = value;
            }

            /**
             * Obtiene el valor de la propiedad sgSELECTCMD.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD }
             *     
             */
            public BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD getSgSELECTCMD() {
                return sgSELECTCMD;
            }

            /**
             * Define el valor de la propiedad sgSELECTCMD.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD }
             *     
             */
            public void setSgSELECTCMD(BUILDCONTROLType.GPROGRAMBP.MPROGRAMBP.SgSELECTCMD value) {
                this.sgSELECTCMD = value;
            }

            /**
             * Obtiene el valor de la propiedad mvreserved9.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getMVRESERVED9() {
                return mvreserved9;
            }

            /**
             * Define el valor de la propiedad mvreserved9.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setMVRESERVED9(JAXBElement<String> value) {
                this.mvreserved9 = value;
            }

            /**
             * Obtiene el valor de la propiedad releasebp.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getRELEASEBP() {
                return releasebp;
            }

            /**
             * Define el valor de la propiedad releasebp.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setRELEASEBP(JAXBElement<String> value) {
                this.releasebp = value;
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
             *         &lt;element name="SELECTCMD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "selectcmd"
            })
            public static class SgSELECTCMD {

                @XmlElement(name = "SELECTCMD", nillable = true)
                protected List<String> selectcmd;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the selectcmd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the selectcmd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSELECTCMD().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getSELECTCMD() {
                    if (selectcmd == null) {
                        selectcmd = new ArrayList<String>();
                    }
                    return this.selectcmd;
                }

                /**
                 * Obtiene el valor de la propiedad sg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Define el valor de la propiedad sg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

            }

        }

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
     *         &lt;element name="mRELEASEDATE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RELEASEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELEASEVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELEASEUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mreleasedate"
    })
    public static class GRELEASEDATE {

        @XmlElement(name = "mRELEASEDATE")
        protected List<BUILDCONTROLType.GRELEASEDATE.MRELEASEDATE> mreleasedate;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mreleasedate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mreleasedate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMRELEASEDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GRELEASEDATE.MRELEASEDATE }
         * 
         * 
         */
        public List<BUILDCONTROLType.GRELEASEDATE.MRELEASEDATE> getMRELEASEDATE() {
            if (mreleasedate == null) {
                mreleasedate = new ArrayList<BUILDCONTROLType.GRELEASEDATE.MRELEASEDATE>();
            }
            return this.mreleasedate;
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
         *         &lt;element name="RELEASEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELEASEVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELEASEUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "releasedate",
            "releaseversion",
            "releaseuser"
        })
        public static class MRELEASEDATE {

            @XmlElementRef(name = "RELEASEDATE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> releasedate;
            @XmlElementRef(name = "RELEASEVERSION", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> releaseversion;
            @XmlElementRef(name = "RELEASEUSER", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> releaseuser;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad releasedate.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getRELEASEDATE() {
                return releasedate;
            }

            /**
             * Define el valor de la propiedad releasedate.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setRELEASEDATE(JAXBElement<String> value) {
                this.releasedate = value;
            }

            /**
             * Obtiene el valor de la propiedad releaseversion.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getRELEASEVERSION() {
                return releaseversion;
            }

            /**
             * Define el valor de la propiedad releaseversion.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setRELEASEVERSION(JAXBElement<String> value) {
                this.releaseversion = value;
            }

            /**
             * Obtiene el valor de la propiedad releaseuser.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getRELEASEUSER() {
                return releaseuser;
            }

            /**
             * Define el valor de la propiedad releaseuser.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setRELEASEUSER(JAXBElement<String> value) {
                this.releaseuser = value;
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
     *         &lt;element name="RELEASEORDER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "releaseorder"
    })
    public static class GRELEASEORDER {

        @XmlElement(name = "RELEASEORDER", nillable = true)
        protected List<String> releaseorder;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the releaseorder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the releaseorder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRELEASEORDER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRELEASEORDER() {
            if (releaseorder == null) {
                releaseorder = new ArrayList<String>();
            }
            return this.releaseorder;
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
     *         &lt;element name="RELSTAGE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "relstage"
    })
    public static class GRELSTAGE {

        @XmlElement(name = "RELSTAGE", nillable = true)
        protected List<String> relstage;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the relstage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relstage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRELSTAGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRELSTAGE() {
            if (relstage == null) {
                relstage = new ArrayList<String>();
            }
            return this.relstage;
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
     *         &lt;element name="mSAVEDDATE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SAVEDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SAVEDVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SAVEDUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "msaveddate"
    })
    public static class GSAVEDDATE {

        @XmlElement(name = "mSAVEDDATE")
        protected List<BUILDCONTROLType.GSAVEDDATE.MSAVEDDATE> msaveddate;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the msaveddate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the msaveddate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSAVEDDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GSAVEDDATE.MSAVEDDATE }
         * 
         * 
         */
        public List<BUILDCONTROLType.GSAVEDDATE.MSAVEDDATE> getMSAVEDDATE() {
            if (msaveddate == null) {
                msaveddate = new ArrayList<BUILDCONTROLType.GSAVEDDATE.MSAVEDDATE>();
            }
            return this.msaveddate;
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
         *         &lt;element name="SAVEDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SAVEDVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SAVEDUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "saveddate",
            "savedversion",
            "saveduser"
        })
        public static class MSAVEDDATE {

            @XmlElementRef(name = "SAVEDDATE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> saveddate;
            @XmlElementRef(name = "SAVEDVERSION", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> savedversion;
            @XmlElementRef(name = "SAVEDUSER", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> saveduser;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad saveddate.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSAVEDDATE() {
                return saveddate;
            }

            /**
             * Define el valor de la propiedad saveddate.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSAVEDDATE(JAXBElement<String> value) {
                this.saveddate = value;
            }

            /**
             * Obtiene el valor de la propiedad savedversion.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSAVEDVERSION() {
                return savedversion;
            }

            /**
             * Define el valor de la propiedad savedversion.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSAVEDVERSION(JAXBElement<String> value) {
                this.savedversion = value;
            }

            /**
             * Obtiene el valor de la propiedad saveduser.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSAVEDUSER() {
                return saveduser;
            }

            /**
             * Define el valor de la propiedad saveduser.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSAVEDUSER(JAXBElement<String> value) {
                this.saveduser = value;
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
     *         &lt;element name="SHELLCMD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "shellcmd"
    })
    public static class GSHELLCMD {

        @XmlElement(name = "SHELLCMD", nillable = true)
        protected List<String> shellcmd;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the shellcmd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shellcmd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSHELLCMD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSHELLCMD() {
            if (shellcmd == null) {
                shellcmd = new ArrayList<String>();
            }
            return this.shellcmd;
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
     *         &lt;element name="mSSAPPLNAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SSAPPLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRFIELDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgUSRFIELDNO" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="USRFIELDNO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="sgUSRVALPROG" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="USRVALPROG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="USRCONVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRDISPLAYFMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRALTINDEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRIDXFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRINDEXNULLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRSINGLEMULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRLANGFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRCNVTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="USRRELFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SSRESVD39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SSRESVD40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SSRESVD41" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SSRESVD42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mssapplname"
    })
    public static class GSSAPPLNAME {

        @XmlElement(name = "mSSAPPLNAME")
        protected List<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME> mssapplname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mssapplname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mssapplname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSSAPPLNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME }
         * 
         * 
         */
        public List<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME> getMSSAPPLNAME() {
            if (mssapplname == null) {
                mssapplname = new ArrayList<BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME>();
            }
            return this.mssapplname;
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
         *         &lt;element name="SSAPPLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRFIELDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgUSRFIELDNO" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="USRFIELDNO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="sgUSRVALPROG" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="USRVALPROG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="USRCONVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRDISPLAYFMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRALTINDEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRIDXFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRINDEXNULLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRSINGLEMULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRLANGFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRCNVTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="USRRELFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SSRESVD39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SSRESVD40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SSRESVD41" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SSRESVD42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ssapplname",
            "usrfieldname",
            "usrtype",
            "sgUSRFIELDNO",
            "sgUSRVALPROG",
            "usrconversion",
            "usrdisplayfmt",
            "usraltindex",
            "usridxfile",
            "usrindexnulls",
            "usrsinglemult",
            "usrlangfield",
            "usrcnvtype",
            "usrrelfile",
            "ssresvd39",
            "ssresvd40",
            "ssresvd41",
            "ssresvd42"
        })
        public static class MSSAPPLNAME {

            @XmlElementRef(name = "SSAPPLNAME", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> ssapplname;
            @XmlElementRef(name = "USRFIELDNAME", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usrfieldname;
            @XmlElementRef(name = "USRTYPE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usrtype;
            protected BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO sgUSRFIELDNO;
            protected BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG sgUSRVALPROG;
            @XmlElementRef(name = "USRCONVERSION", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usrconversion;
            @XmlElementRef(name = "USRDISPLAYFMT", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usrdisplayfmt;
            @XmlElementRef(name = "USRALTINDEX", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usraltindex;
            @XmlElementRef(name = "USRIDXFILE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usridxfile;
            @XmlElementRef(name = "USRINDEXNULLS", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usrindexnulls;
            @XmlElementRef(name = "USRSINGLEMULT", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usrsinglemult;
            @XmlElementRef(name = "USRLANGFIELD", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usrlangfield;
            @XmlElementRef(name = "USRCNVTYPE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usrcnvtype;
            @XmlElementRef(name = "USRRELFILE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> usrrelfile;
            @XmlElementRef(name = "SSRESVD39", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> ssresvd39;
            @XmlElementRef(name = "SSRESVD40", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> ssresvd40;
            @XmlElementRef(name = "SSRESVD41", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> ssresvd41;
            @XmlElementRef(name = "SSRESVD42", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> ssresvd42;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad ssapplname.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSSAPPLNAME() {
                return ssapplname;
            }

            /**
             * Define el valor de la propiedad ssapplname.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSSAPPLNAME(JAXBElement<String> value) {
                this.ssapplname = value;
            }

            /**
             * Obtiene el valor de la propiedad usrfieldname.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRFIELDNAME() {
                return usrfieldname;
            }

            /**
             * Define el valor de la propiedad usrfieldname.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRFIELDNAME(JAXBElement<String> value) {
                this.usrfieldname = value;
            }

            /**
             * Obtiene el valor de la propiedad usrtype.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRTYPE() {
                return usrtype;
            }

            /**
             * Define el valor de la propiedad usrtype.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRTYPE(JAXBElement<String> value) {
                this.usrtype = value;
            }

            /**
             * Obtiene el valor de la propiedad sgUSRFIELDNO.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO }
             *     
             */
            public BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO getSgUSRFIELDNO() {
                return sgUSRFIELDNO;
            }

            /**
             * Define el valor de la propiedad sgUSRFIELDNO.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO }
             *     
             */
            public void setSgUSRFIELDNO(BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRFIELDNO value) {
                this.sgUSRFIELDNO = value;
            }

            /**
             * Obtiene el valor de la propiedad sgUSRVALPROG.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG }
             *     
             */
            public BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG getSgUSRVALPROG() {
                return sgUSRVALPROG;
            }

            /**
             * Define el valor de la propiedad sgUSRVALPROG.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG }
             *     
             */
            public void setSgUSRVALPROG(BUILDCONTROLType.GSSAPPLNAME.MSSAPPLNAME.SgUSRVALPROG value) {
                this.sgUSRVALPROG = value;
            }

            /**
             * Obtiene el valor de la propiedad usrconversion.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRCONVERSION() {
                return usrconversion;
            }

            /**
             * Define el valor de la propiedad usrconversion.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRCONVERSION(JAXBElement<String> value) {
                this.usrconversion = value;
            }

            /**
             * Obtiene el valor de la propiedad usrdisplayfmt.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRDISPLAYFMT() {
                return usrdisplayfmt;
            }

            /**
             * Define el valor de la propiedad usrdisplayfmt.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRDISPLAYFMT(JAXBElement<String> value) {
                this.usrdisplayfmt = value;
            }

            /**
             * Obtiene el valor de la propiedad usraltindex.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRALTINDEX() {
                return usraltindex;
            }

            /**
             * Define el valor de la propiedad usraltindex.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRALTINDEX(JAXBElement<String> value) {
                this.usraltindex = value;
            }

            /**
             * Obtiene el valor de la propiedad usridxfile.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRIDXFILE() {
                return usridxfile;
            }

            /**
             * Define el valor de la propiedad usridxfile.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRIDXFILE(JAXBElement<String> value) {
                this.usridxfile = value;
            }

            /**
             * Obtiene el valor de la propiedad usrindexnulls.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRINDEXNULLS() {
                return usrindexnulls;
            }

            /**
             * Define el valor de la propiedad usrindexnulls.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRINDEXNULLS(JAXBElement<String> value) {
                this.usrindexnulls = value;
            }

            /**
             * Obtiene el valor de la propiedad usrsinglemult.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRSINGLEMULT() {
                return usrsinglemult;
            }

            /**
             * Define el valor de la propiedad usrsinglemult.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRSINGLEMULT(JAXBElement<String> value) {
                this.usrsinglemult = value;
            }

            /**
             * Obtiene el valor de la propiedad usrlangfield.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRLANGFIELD() {
                return usrlangfield;
            }

            /**
             * Define el valor de la propiedad usrlangfield.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRLANGFIELD(JAXBElement<String> value) {
                this.usrlangfield = value;
            }

            /**
             * Obtiene el valor de la propiedad usrcnvtype.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRCNVTYPE() {
                return usrcnvtype;
            }

            /**
             * Define el valor de la propiedad usrcnvtype.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRCNVTYPE(JAXBElement<String> value) {
                this.usrcnvtype = value;
            }

            /**
             * Obtiene el valor de la propiedad usrrelfile.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUSRRELFILE() {
                return usrrelfile;
            }

            /**
             * Define el valor de la propiedad usrrelfile.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUSRRELFILE(JAXBElement<String> value) {
                this.usrrelfile = value;
            }

            /**
             * Obtiene el valor de la propiedad ssresvd39.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSSRESVD39() {
                return ssresvd39;
            }

            /**
             * Define el valor de la propiedad ssresvd39.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSSRESVD39(JAXBElement<String> value) {
                this.ssresvd39 = value;
            }

            /**
             * Obtiene el valor de la propiedad ssresvd40.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSSRESVD40() {
                return ssresvd40;
            }

            /**
             * Define el valor de la propiedad ssresvd40.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSSRESVD40(JAXBElement<String> value) {
                this.ssresvd40 = value;
            }

            /**
             * Obtiene el valor de la propiedad ssresvd41.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSSRESVD41() {
                return ssresvd41;
            }

            /**
             * Define el valor de la propiedad ssresvd41.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSSRESVD41(JAXBElement<String> value) {
                this.ssresvd41 = value;
            }

            /**
             * Obtiene el valor de la propiedad ssresvd42.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSSRESVD42() {
                return ssresvd42;
            }

            /**
             * Define el valor de la propiedad ssresvd42.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSSRESVD42(JAXBElement<String> value) {
                this.ssresvd42 = value;
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
             *         &lt;element name="USRFIELDNO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "usrfieldno"
            })
            public static class SgUSRFIELDNO {

                @XmlElement(name = "USRFIELDNO", nillable = true)
                protected List<String> usrfieldno;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the usrfieldno property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the usrfieldno property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUSRFIELDNO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getUSRFIELDNO() {
                    if (usrfieldno == null) {
                        usrfieldno = new ArrayList<String>();
                    }
                    return this.usrfieldno;
                }

                /**
                 * Obtiene el valor de la propiedad sg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Define el valor de la propiedad sg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

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
             *         &lt;element name="USRVALPROG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "usrvalprog"
            })
            public static class SgUSRVALPROG {

                @XmlElement(name = "USRVALPROG", nillable = true)
                protected List<String> usrvalprog;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the usrvalprog property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the usrvalprog property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUSRVALPROG().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getUSRVALPROG() {
                    if (usrvalprog == null) {
                        usrvalprog = new ArrayList<String>();
                    }
                    return this.usrvalprog;
                }

                /**
                 * Obtiene el valor de la propiedad sg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Define el valor de la propiedad sg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
                }

            }

        }

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
     *         &lt;element name="mUPDTABLENAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UPDTABLENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UPDCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgUPDRECORD" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="UPDRECORD" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="UPDRECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="UPDFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="SVRESVD53" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="SVRESVD54" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="SVRESVD55" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="UPDVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MVRESVD57" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MVRESVD58" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MVRESVD59" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mupdtablename"
    })
    public static class GUPDTABLENAME {

        @XmlElement(name = "mUPDTABLENAME")
        protected List<BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME> mupdtablename;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mupdtablename property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mupdtablename property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMUPDTABLENAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME }
         * 
         * 
         */
        public List<BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME> getMUPDTABLENAME() {
            if (mupdtablename == null) {
                mupdtablename = new ArrayList<BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME>();
            }
            return this.mupdtablename;
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
         *         &lt;element name="UPDTABLENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UPDCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgUPDRECORD" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="UPDRECORD" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="UPDRECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="UPDFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="SVRESVD53" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="SVRESVD54" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="SVRESVD55" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="UPDVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MVRESVD57" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MVRESVD58" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MVRESVD59" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "updtablename",
            "updcompany",
            "sgUPDRECORD",
            "mvresvd57",
            "mvresvd58",
            "mvresvd59"
        })
        public static class MUPDTABLENAME {

            @XmlElementRef(name = "UPDTABLENAME", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> updtablename;
            @XmlElementRef(name = "UPDCOMPANY", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> updcompany;
            protected BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME.SgUPDRECORD sgUPDRECORD;
            @XmlElementRef(name = "MVRESVD57", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> mvresvd57;
            @XmlElementRef(name = "MVRESVD58", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> mvresvd58;
            @XmlElementRef(name = "MVRESVD59", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> mvresvd59;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad updtablename.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUPDTABLENAME() {
                return updtablename;
            }

            /**
             * Define el valor de la propiedad updtablename.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUPDTABLENAME(JAXBElement<String> value) {
                this.updtablename = value;
            }

            /**
             * Obtiene el valor de la propiedad updcompany.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUPDCOMPANY() {
                return updcompany;
            }

            /**
             * Define el valor de la propiedad updcompany.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUPDCOMPANY(JAXBElement<String> value) {
                this.updcompany = value;
            }

            /**
             * Obtiene el valor de la propiedad sgUPDRECORD.
             * 
             * @return
             *     possible object is
             *     {@link BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME.SgUPDRECORD }
             *     
             */
            public BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME.SgUPDRECORD getSgUPDRECORD() {
                return sgUPDRECORD;
            }

            /**
             * Define el valor de la propiedad sgUPDRECORD.
             * 
             * @param value
             *     allowed object is
             *     {@link BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME.SgUPDRECORD }
             *     
             */
            public void setSgUPDRECORD(BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME.SgUPDRECORD value) {
                this.sgUPDRECORD = value;
            }

            /**
             * Obtiene el valor de la propiedad mvresvd57.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getMVRESVD57() {
                return mvresvd57;
            }

            /**
             * Define el valor de la propiedad mvresvd57.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setMVRESVD57(JAXBElement<String> value) {
                this.mvresvd57 = value;
            }

            /**
             * Obtiene el valor de la propiedad mvresvd58.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getMVRESVD58() {
                return mvresvd58;
            }

            /**
             * Define el valor de la propiedad mvresvd58.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setMVRESVD58(JAXBElement<String> value) {
                this.mvresvd58 = value;
            }

            /**
             * Obtiene el valor de la propiedad mvresvd59.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getMVRESVD59() {
                return mvresvd59;
            }

            /**
             * Define el valor de la propiedad mvresvd59.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setMVRESVD59(JAXBElement<String> value) {
                this.mvresvd59 = value;
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
             *         &lt;element name="UPDRECORD" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="UPDRECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="UPDFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="SVRESVD53" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="SVRESVD54" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="SVRESVD55" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="UPDVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "updrecord"
            })
            public static class SgUPDRECORD {

                @XmlElement(name = "UPDRECORD")
                protected List<BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME.SgUPDRECORD.UPDRECORD> updrecord;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the updrecord property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the updrecord property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUPDRECORD().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME.SgUPDRECORD.UPDRECORD }
                 * 
                 * 
                 */
                public List<BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME.SgUPDRECORD.UPDRECORD> getUPDRECORD() {
                    if (updrecord == null) {
                        updrecord = new ArrayList<BUILDCONTROLType.GUPDTABLENAME.MUPDTABLENAME.SgUPDRECORD.UPDRECORD>();
                    }
                    return this.updrecord;
                }

                /**
                 * Obtiene el valor de la propiedad sg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Define el valor de la propiedad sg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="UPDRECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="UPDFIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="SVRESVD53" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="SVRESVD54" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="SVRESVD55" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="UPDVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "updrecord",
                    "updfield",
                    "svresvd53",
                    "svresvd54",
                    "svresvd55",
                    "updvalue"
                })
                public static class UPDRECORD {

                    @XmlElementRef(name = "UPDRECORD", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> updrecord;
                    @XmlElementRef(name = "UPDFIELD", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> updfield;
                    @XmlElementRef(name = "SVRESVD53", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> svresvd53;
                    @XmlElementRef(name = "SVRESVD54", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> svresvd54;
                    @XmlElementRef(name = "SVRESVD55", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> svresvd55;
                    @XmlElementRef(name = "UPDVALUE", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> updvalue;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Obtiene el valor de la propiedad updrecord.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getUPDRECORD() {
                        return updrecord;
                    }

                    /**
                     * Define el valor de la propiedad updrecord.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setUPDRECORD(JAXBElement<String> value) {
                        this.updrecord = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad updfield.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getUPDFIELD() {
                        return updfield;
                    }

                    /**
                     * Define el valor de la propiedad updfield.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setUPDFIELD(JAXBElement<String> value) {
                        this.updfield = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad svresvd53.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getSVRESVD53() {
                        return svresvd53;
                    }

                    /**
                     * Define el valor de la propiedad svresvd53.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setSVRESVD53(JAXBElement<String> value) {
                        this.svresvd53 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad svresvd54.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getSVRESVD54() {
                        return svresvd54;
                    }

                    /**
                     * Define el valor de la propiedad svresvd54.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setSVRESVD54(JAXBElement<String> value) {
                        this.svresvd54 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad svresvd55.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getSVRESVD55() {
                        return svresvd55;
                    }

                    /**
                     * Define el valor de la propiedad svresvd55.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setSVRESVD55(JAXBElement<String> value) {
                        this.svresvd55 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad updvalue.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getUPDVALUE() {
                        return updvalue;
                    }

                    /**
                     * Define el valor de la propiedad updvalue.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setUPDVALUE(JAXBElement<String> value) {
                        this.updvalue = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad s.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Define el valor de la propiedad s.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

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
     *         &lt;element name="mWSFILENAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="WSFILENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WSRECORDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mwsfilename"
    })
    public static class GWSFILENAME {

        @XmlElement(name = "mWSFILENAME")
        protected List<BUILDCONTROLType.GWSFILENAME.MWSFILENAME> mwsfilename;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mwsfilename property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mwsfilename property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMWSFILENAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BUILDCONTROLType.GWSFILENAME.MWSFILENAME }
         * 
         * 
         */
        public List<BUILDCONTROLType.GWSFILENAME.MWSFILENAME> getMWSFILENAME() {
            if (mwsfilename == null) {
                mwsfilename = new ArrayList<BUILDCONTROLType.GWSFILENAME.MWSFILENAME>();
            }
            return this.mwsfilename;
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
         *         &lt;element name="WSFILENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WSRECORDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "wsfilename",
            "wsrecordname"
        })
        public static class MWSFILENAME {

            @XmlElementRef(name = "WSFILENAME", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> wsfilename;
            @XmlElementRef(name = "WSRECORDNAME", namespace = "http://temenos.com/BUILDCONTROL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> wsrecordname;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Obtiene el valor de la propiedad wsfilename.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getWSFILENAME() {
                return wsfilename;
            }

            /**
             * Define el valor de la propiedad wsfilename.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setWSFILENAME(JAXBElement<String> value) {
                this.wsfilename = value;
            }

            /**
             * Obtiene el valor de la propiedad wsrecordname.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getWSRECORDNAME() {
                return wsrecordname;
            }

            /**
             * Define el valor de la propiedad wsrecordname.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setWSRECORDNAME(JAXBElement<String> value) {
                this.wsrecordname = value;
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
