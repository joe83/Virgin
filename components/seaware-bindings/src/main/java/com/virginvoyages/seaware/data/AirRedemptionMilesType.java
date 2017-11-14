//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 04:47:21 PM IST 
//


package com.virginvoyages.seaware.data;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about using redemption miles as currency.
 * 
 * <p>Java class for AirRedemptionMilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirRedemptionMilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PointQty" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="RewardCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MoneyToMilesRatio" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirRedemptionMilesType")
public class AirRedemptionMilesType {

    @XmlAttribute(name = "PointQty", required = true)
    protected BigDecimal pointQty;
    @XmlAttribute(name = "RewardCode")
    protected String rewardCode;
    @XmlAttribute(name = "MoneyToMilesRatio")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger moneyToMilesRatio;
    @XmlAttribute(name = "DiscountPercentage")
    protected BigDecimal discountPercentage;

    /**
     * Gets the value of the pointQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointQty() {
        return pointQty;
    }

    /**
     * Sets the value of the pointQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointQty(BigDecimal value) {
        this.pointQty = value;
    }

    /**
     * Gets the value of the rewardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCode() {
        return rewardCode;
    }

    /**
     * Sets the value of the rewardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCode(String value) {
        this.rewardCode = value;
    }

    /**
     * Gets the value of the moneyToMilesRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMoneyToMilesRatio() {
        return moneyToMilesRatio;
    }

    /**
     * Sets the value of the moneyToMilesRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMoneyToMilesRatio(BigInteger value) {
        this.moneyToMilesRatio = value;
    }

    /**
     * Gets the value of the discountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercentage(BigDecimal value) {
        this.discountPercentage = value;
    }

}
