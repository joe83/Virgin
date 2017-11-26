//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 04:47:21 PM IST 
//


package com.virginvoyages.seaware.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The OffLocationServicePricedType complex type describes the data that is used to describe a priced off-location service, that is, an off-location service and the corresponding charge.
 * 
 * <p>Java class for OffLocationServicePricedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffLocationServicePricedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OffLocService" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceType"/>
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServicePricedType", propOrder = {
    "offLocService",
    "charge"
})
public class OffLocationServicePricedType {

    @XmlElement(name = "OffLocService", required = true)
    protected OffLocationServiceType offLocService;
    @XmlElement(name = "Charge")
    protected VehicleChargeType charge;

    /**
     * Gets the value of the offLocService property.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceType }
     *     
     */
    public OffLocationServiceType getOffLocService() {
        return offLocService;
    }

    /**
     * Sets the value of the offLocService property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceType }
     *     
     */
    public void setOffLocService(OffLocationServiceType value) {
        this.offLocService = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeType }
     *     
     */
    public VehicleChargeType getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeType }
     *     
     */
    public void setCharge(VehicleChargeType value) {
        this.charge = value;
    }

}