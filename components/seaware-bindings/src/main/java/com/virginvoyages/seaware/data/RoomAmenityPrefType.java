//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 04:47:21 PM IST 
//


package com.virginvoyages.seaware.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Indicates preferences for hotel room amenities.
 * 
 * <p>Java class for RoomAmenityPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomAmenityPrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to128">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attribute name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="QualityLevel" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="RoomGender">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Male"/>
 *             &lt;enumeration value="Female"/>
 *             &lt;enumeration value="MaleAndFemale"/>
 *             &lt;enumeration value="Unknown"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SharedRoomInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomAmenityPrefType", propOrder = {
    "value"
})
@XmlSeeAlso({
    com.virginvoyages.seaware.data.PropertyValueMatchType.Amenities.Amenity.class
})
public class RoomAmenityPrefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "RoomAmenity")
    protected String roomAmenity;
    @XmlAttribute(name = "ExistsCode")
    protected String existsCode;
    @XmlAttribute(name = "QualityLevel")
    protected String qualityLevel;
    @XmlAttribute(name = "RoomGender")
    protected String roomGender;
    @XmlAttribute(name = "SharedRoomInd")
    protected Boolean sharedRoomInd;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * Used for Character Strings, length 0 to 128.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the roomAmenity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomAmenity() {
        return roomAmenity;
    }

    /**
     * Sets the value of the roomAmenity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomAmenity(String value) {
        this.roomAmenity = value;
    }

    /**
     * Gets the value of the existsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistsCode() {
        return existsCode;
    }

    /**
     * Sets the value of the existsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistsCode(String value) {
        this.existsCode = value;
    }

    /**
     * Gets the value of the qualityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityLevel() {
        return qualityLevel;
    }

    /**
     * Sets the value of the qualityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityLevel(String value) {
        this.qualityLevel = value;
    }

    /**
     * Gets the value of the roomGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomGender() {
        return roomGender;
    }

    /**
     * Sets the value of the roomGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomGender(String value) {
        this.roomGender = value;
    }

    /**
     * Gets the value of the sharedRoomInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharedRoomInd() {
        return sharedRoomInd;
    }

    /**
     * Sets the value of the sharedRoomInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharedRoomInd(Boolean value) {
        this.sharedRoomInd = value;
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
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

}
