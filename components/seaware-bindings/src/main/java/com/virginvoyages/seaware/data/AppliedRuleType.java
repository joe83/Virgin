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
import javax.xml.bind.annotation.XmlType;


/**
 * Applied rule information, including category, rule identifier and rule descriptions.
 * 
 * <p>Java class for AppliedRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DefaultUsedInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="RuleInfo">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShortDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *                   &lt;element name="LongDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedRuleType", propOrder = {
    "defaultUsedInd",
    "ruleInfo",
    "description"
})
public class AppliedRuleType {

    @XmlElement(name = "DefaultUsedInd")
    protected Boolean defaultUsedInd;
    @XmlElement(name = "RuleInfo")
    protected AppliedRuleType.RuleInfo ruleInfo;
    @XmlElement(name = "Description")
    protected List<AppliedRuleType.Description> description;
    @XmlAttribute(name = "Category", required = true)
    protected String category;

    /**
     * Gets the value of the defaultUsedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultUsedInd() {
        return defaultUsedInd;
    }

    /**
     * Sets the value of the defaultUsedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultUsedInd(Boolean value) {
        this.defaultUsedInd = value;
    }

    /**
     * Gets the value of the ruleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedRuleType.RuleInfo }
     *     
     */
    public AppliedRuleType.RuleInfo getRuleInfo() {
        return ruleInfo;
    }

    /**
     * Sets the value of the ruleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedRuleType.RuleInfo }
     *     
     */
    public void setRuleInfo(AppliedRuleType.RuleInfo value) {
        this.ruleInfo = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedRuleType.Description }
     * 
     * 
     */
    public List<AppliedRuleType.Description> getDescription() {
        if (description == null) {
            description = new ArrayList<AppliedRuleType.Description>();
        }
        return this.description;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ShortDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
     *         &lt;element name="LongDescription" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "shortDescription",
        "longDescription"
    })
    public static class Description {

        @XmlElement(name = "ShortDescription")
        protected FreeTextType shortDescription;
        @XmlElement(name = "LongDescription")
        protected FreeTextType longDescription;

        /**
         * Gets the value of the shortDescription property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextType }
         *     
         */
        public FreeTextType getShortDescription() {
            return shortDescription;
        }

        /**
         * Sets the value of the shortDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextType }
         *     
         */
        public void setShortDescription(FreeTextType value) {
            this.shortDescription = value;
        }

        /**
         * Gets the value of the longDescription property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextType }
         *     
         */
        public FreeTextType getLongDescription() {
            return longDescription;
        }

        /**
         * Sets the value of the longDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextType }
         *     
         */
        public void setLongDescription(FreeTextType value) {
            this.longDescription = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RuleInfo {

        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "Version")
        protected BigInteger version;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setVersion(BigInteger value) {
            this.version = value;
        }

    }

}
