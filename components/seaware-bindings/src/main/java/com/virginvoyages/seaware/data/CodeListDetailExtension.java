//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 04:47:21 PM IST 
//


package com.virginvoyages.seaware.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Detail Code List extension structure that includes all Summary information plus quantity, proximity, charge, schedule and apply to level information.
 * 
 * <p>Java class for CodeListDetailExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListDetailExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CodeListSummaryExtension">
 *       &lt;sequence>
 *         &lt;element name="ApplyToLevel" type="{http://www.opentravel.org/OTA/2003/05}List_ApplyToLevel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}CodeListFeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Schedule" type="{http://www.opentravel.org/OTA/2003/05}CodeListScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Proximity">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Nearby"/>
 *             &lt;enumeration value="NotSpecified"/>
 *             &lt;enumeration value="Offsite"/>
 *             &lt;enumeration value="Onsite"/>
 *             &lt;enumeration value="OnsiteAndOffsite"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListDetailExtension", propOrder = {
    "applyToLevel",
    "charge",
    "schedule"
})
public class CodeListDetailExtension
    extends CodeListSummaryExtension
{

    @XmlElement(name = "ApplyToLevel")
    protected List<ListApplyToLevel> applyToLevel;
    @XmlElement(name = "Charge")
    protected List<CodeListFeeType> charge;
    @XmlElement(name = "Schedule")
    protected List<CodeListScheduleType> schedule;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "Proximity")
    protected String proximity;

    /**
     * Gets the value of the applyToLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyToLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyToLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListApplyToLevel }
     * 
     * 
     */
    public List<ListApplyToLevel> getApplyToLevel() {
        if (applyToLevel == null) {
            applyToLevel = new ArrayList<ListApplyToLevel>();
        }
        return this.applyToLevel;
    }

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListFeeType }
     * 
     * 
     */
    public List<CodeListFeeType> getCharge() {
        if (charge == null) {
            charge = new ArrayList<CodeListFeeType>();
        }
        return this.charge;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListScheduleType }
     * 
     * 
     */
    public List<CodeListScheduleType> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<CodeListScheduleType>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the proximity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProximity() {
        return proximity;
    }

    /**
     * Sets the value of the proximity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProximity(String value) {
        this.proximity = value;
    }

}
