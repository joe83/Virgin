//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 04:47:21 PM IST 
//


package com.virginvoyages.seaware.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List_OfferLoyaltySector.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferLoyaltySector">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Leisure"/>
 *     &lt;enumeration value="Lodging"/>
 *     &lt;enumeration value="Transportation"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferLoyaltySector")
@XmlEnum
public enum ListOfferLoyaltySector {


    /**
     * Leisure and activity suppliers, including cruise, day tour, actvity, package tour and golf.
     * 
     */
    @XmlEnumValue("Leisure")
    LEISURE("Leisure"),

    /**
     * Accommodation suppliers, including hotel, hostel and vacation rental.
     * 
     */
    @XmlEnumValue("Lodging")
    LODGING("Lodging"),

    /**
     * Transportation suppliers, including air, car, ground and rail.
     * 
     */
    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferLoyaltySector(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferLoyaltySector fromValue(String v) {
        for (ListOfferLoyaltySector c: ListOfferLoyaltySector.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
