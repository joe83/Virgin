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
 * <p>Java class for List_OfferTripMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferTripMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Activity"/>
 *     &lt;enumeration value="Flight"/>
 *     &lt;enumeration value="Cruise"/>
 *     &lt;enumeration value="DayTour"/>
 *     &lt;enumeration value="GroundTransportation"/>
 *     &lt;enumeration value="Lodging"/>
 *     &lt;enumeration value="PackageTour"/>
 *     &lt;enumeration value="Train"/>
 *     &lt;enumeration value="VehicleRental"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferTripMode")
@XmlEnum
public enum ListOfferTripMode {

    @XmlEnumValue("Activity")
    ACTIVITY("Activity"),
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("Cruise")
    CRUISE("Cruise"),
    @XmlEnumValue("DayTour")
    DAY_TOUR("DayTour"),
    @XmlEnumValue("GroundTransportation")
    GROUND_TRANSPORTATION("GroundTransportation"),
    @XmlEnumValue("Lodging")
    LODGING("Lodging"),
    @XmlEnumValue("PackageTour")
    PACKAGE_TOUR("PackageTour"),
    @XmlEnumValue("Train")
    TRAIN("Train"),
    @XmlEnumValue("VehicleRental")
    VEHICLE_RENTAL("VehicleRental"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferTripMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferTripMode fromValue(String v) {
        for (ListOfferTripMode c: ListOfferTripMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
