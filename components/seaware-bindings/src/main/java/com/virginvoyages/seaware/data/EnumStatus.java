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
 * <p>Java class for Enum_Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Enum_Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cancel_ConfirmedRequested"/>
 *     &lt;enumeration value="Cancel_Listing"/>
 *     &lt;enumeration value="Cancel_OnlyIfRequestedSegmentIsAvailable"/>
 *     &lt;enumeration value="CancellationRecommended"/>
 *     &lt;enumeration value="CodeToReportActionTakenFromPreviousAccess"/>
 *     &lt;enumeration value="IfHolding_ThenCancel"/>
 *     &lt;enumeration value="IfNotHolding_ThenNeed"/>
 *     &lt;enumeration value="IfNotHolding_ThenSold"/>
 *     &lt;enumeration value="List_AddToWaitingList"/>
 *     &lt;enumeration value="List_SpaceAvailable"/>
 *     &lt;enumeration value="Need"/>
 *     &lt;enumeration value="Need_SegmentSpecifiedOrAlternative"/>
 *     &lt;enumeration value="Sold"/>
 *     &lt;enumeration value="Sold_OnFreeSaleBasis"/>
 *     &lt;enumeration value="SpaceRequested"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Confirming"/>
 *     &lt;enumeration value="Confirming_FromWaitlist"/>
 *     &lt;enumeration value="NoActionTaken"/>
 *     &lt;enumeration value="Unable_HaveWaitlisted"/>
 *     &lt;enumeration value="Unable_FlightDoesNotOperate"/>
 *     &lt;enumeration value="Unable_ToAcceptSale"/>
 *     &lt;enumeration value="Waitlist_Closed"/>
 *     &lt;enumeration value="Have_Listed"/>
 *     &lt;enumeration value="Have_Requested"/>
 *     &lt;enumeration value="HoldsConfirmed"/>
 *     &lt;enumeration value="Reconfirmed"/>
 *     &lt;enumeration value="HaveSold"/>
 *     &lt;enumeration value="SpaceAlreadyRequested"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="HaveCancelled"/>
 *     &lt;enumeration value="PendingConfirmation"/>
 *     &lt;enumeration value="DeferredFromWaitList"/>
 *     &lt;enumeration value="StaffRequest"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="BookOnBoard"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Offered"/>
 *     &lt;enumeration value="OnRequest"/>
 *     &lt;enumeration value="Prepaid"/>
 *     &lt;enumeration value="Shared"/>
 *     &lt;enumeration value="Waitlisted"/>
 *     &lt;enumeration value="Guaranteed"/>
 *     &lt;enumeration value="Held"/>
 *     &lt;enumeration value="Booked"/>
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="SegmentConfirmedAfterScheduleChange"/>
 *     &lt;enumeration value="SegmentConfirmed"/>
 *     &lt;enumeration value="Overbook"/>
 *     &lt;enumeration value="Waitlisted_PriorityA"/>
 *     &lt;enumeration value="Waitlisted_PriorityB"/>
 *     &lt;enumeration value="Waitlisted_PriorityC"/>
 *     &lt;enumeration value="Waitlisted_PriorityD"/>
 *     &lt;enumeration value="Jumpseat"/>
 *     &lt;enumeration value="NeedGroupSpace"/>
 *     &lt;enumeration value="PriorityGroup"/>
 *     &lt;enumeration value="Unable_GroupWaitlisted"/>
 *     &lt;enumeration value="Waitlist_Group"/>
 *     &lt;enumeration value="SegmentWasWaitlist"/>
 *     &lt;enumeration value="SegmentWasReconfirmed"/>
 *     &lt;enumeration value="SegmentWasPending"/>
 *     &lt;enumeration value="BookedOutsideSystem"/>
 *     &lt;enumeration value="PendingCancel"/>
 *     &lt;enumeration value="MandatoryNeed"/>
 *     &lt;enumeration value="NeedProtection"/>
 *     &lt;enumeration value="PendingRequest"/>
 *     &lt;enumeration value="PendingCancellation"/>
 *     &lt;enumeration value="StaffListingInSSR"/>
 *     &lt;enumeration value="LinkSold_HistoryOnly"/>
 *     &lt;enumeration value="CodeshareSold_HistoryOnly"/>
 *     &lt;enumeration value="SuperGuaranteedSell_HistoryOnly"/>
 *     &lt;enumeration value="Confirming_NewSchedule"/>
 *     &lt;enumeration value="OnRequest_NewSchedule"/>
 *     &lt;enumeration value="PlacingOnWaitlist_NewSchedule"/>
 *     &lt;enumeration value="StandbyBoarded"/>
 *     &lt;enumeration value="Flown"/>
 *     &lt;enumeration value="NoRecordAvailable_NOREC"/>
 *     &lt;enumeration value="GoShow"/>
 *     &lt;enumeration value="NoShow"/>
 *     &lt;enumeration value="OffloadFirmBooked"/>
 *     &lt;enumeration value="OffloadOfGoShow"/>
 *     &lt;enumeration value="Downgrade_ToEconomyClass"/>
 *     &lt;enumeration value="DownUpgrade_ToBusinessClass"/>
 *     &lt;enumeration value="Upgrade_ToFirstClass"/>
 *     &lt;enumeration value="OffloadOfNoRecordPassenger"/>
 *     &lt;enumeration value="HoldsConfirmed_ConditionalEMD_Required"/>
 *     &lt;enumeration value="HoldsConfirmed_EMD_Required"/>
 *     &lt;enumeration value="HoldsConfirmed_EMD_Issued"/>
 *     &lt;enumeration value="HoldsConfirmed_NewSchedule_EMDAlreadyIssued"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Enum_Status")
@XmlEnum
public enum EnumStatus {

    @XmlEnumValue("Cancel_ConfirmedRequested")
    CANCEL_CONFIRMED_REQUESTED("Cancel_ConfirmedRequested"),
    @XmlEnumValue("Cancel_Listing")
    CANCEL_LISTING("Cancel_Listing"),
    @XmlEnumValue("Cancel_OnlyIfRequestedSegmentIsAvailable")
    CANCEL_ONLY_IF_REQUESTED_SEGMENT_IS_AVAILABLE("Cancel_OnlyIfRequestedSegmentIsAvailable"),
    @XmlEnumValue("CancellationRecommended")
    CANCELLATION_RECOMMENDED("CancellationRecommended"),
    @XmlEnumValue("CodeToReportActionTakenFromPreviousAccess")
    CODE_TO_REPORT_ACTION_TAKEN_FROM_PREVIOUS_ACCESS("CodeToReportActionTakenFromPreviousAccess"),
    @XmlEnumValue("IfHolding_ThenCancel")
    IF_HOLDING_THEN_CANCEL("IfHolding_ThenCancel"),
    @XmlEnumValue("IfNotHolding_ThenNeed")
    IF_NOT_HOLDING_THEN_NEED("IfNotHolding_ThenNeed"),
    @XmlEnumValue("IfNotHolding_ThenSold")
    IF_NOT_HOLDING_THEN_SOLD("IfNotHolding_ThenSold"),
    @XmlEnumValue("List_AddToWaitingList")
    LIST_ADD_TO_WAITING_LIST("List_AddToWaitingList"),
    @XmlEnumValue("List_SpaceAvailable")
    LIST_SPACE_AVAILABLE("List_SpaceAvailable"),
    @XmlEnumValue("Need")
    NEED("Need"),
    @XmlEnumValue("Need_SegmentSpecifiedOrAlternative")
    NEED_SEGMENT_SPECIFIED_OR_ALTERNATIVE("Need_SegmentSpecifiedOrAlternative"),
    @XmlEnumValue("Sold")
    SOLD("Sold"),
    @XmlEnumValue("Sold_OnFreeSaleBasis")
    SOLD_ON_FREE_SALE_BASIS("Sold_OnFreeSaleBasis"),
    @XmlEnumValue("SpaceRequested")
    SPACE_REQUESTED("SpaceRequested"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Confirming")
    CONFIRMING("Confirming"),
    @XmlEnumValue("Confirming_FromWaitlist")
    CONFIRMING_FROM_WAITLIST("Confirming_FromWaitlist"),
    @XmlEnumValue("NoActionTaken")
    NO_ACTION_TAKEN("NoActionTaken"),
    @XmlEnumValue("Unable_HaveWaitlisted")
    UNABLE_HAVE_WAITLISTED("Unable_HaveWaitlisted"),
    @XmlEnumValue("Unable_FlightDoesNotOperate")
    UNABLE_FLIGHT_DOES_NOT_OPERATE("Unable_FlightDoesNotOperate"),
    @XmlEnumValue("Unable_ToAcceptSale")
    UNABLE_TO_ACCEPT_SALE("Unable_ToAcceptSale"),
    @XmlEnumValue("Waitlist_Closed")
    WAITLIST_CLOSED("Waitlist_Closed"),
    @XmlEnumValue("Have_Listed")
    HAVE_LISTED("Have_Listed"),
    @XmlEnumValue("Have_Requested")
    HAVE_REQUESTED("Have_Requested"),
    @XmlEnumValue("HoldsConfirmed")
    HOLDS_CONFIRMED("HoldsConfirmed"),
    @XmlEnumValue("Reconfirmed")
    RECONFIRMED("Reconfirmed"),
    @XmlEnumValue("HaveSold")
    HAVE_SOLD("HaveSold"),
    @XmlEnumValue("SpaceAlreadyRequested")
    SPACE_ALREADY_REQUESTED("SpaceAlreadyRequested"),
    OK("OK"),
    @XmlEnumValue("HaveCancelled")
    HAVE_CANCELLED("HaveCancelled"),
    @XmlEnumValue("PendingConfirmation")
    PENDING_CONFIRMATION("PendingConfirmation"),
    @XmlEnumValue("DeferredFromWaitList")
    DEFERRED_FROM_WAIT_LIST("DeferredFromWaitList"),
    @XmlEnumValue("StaffRequest")
    STAFF_REQUEST("StaffRequest"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("BookOnBoard")
    BOOK_ON_BOARD("BookOnBoard"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Offered")
    OFFERED("Offered"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("Prepaid")
    PREPAID("Prepaid"),
    @XmlEnumValue("Shared")
    SHARED("Shared"),
    @XmlEnumValue("Waitlisted")
    WAITLISTED("Waitlisted"),
    @XmlEnumValue("Guaranteed")
    GUARANTEED("Guaranteed"),
    @XmlEnumValue("Held")
    HELD("Held"),
    @XmlEnumValue("Booked")
    BOOKED("Booked"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("SegmentConfirmedAfterScheduleChange")
    SEGMENT_CONFIRMED_AFTER_SCHEDULE_CHANGE("SegmentConfirmedAfterScheduleChange"),
    @XmlEnumValue("SegmentConfirmed")
    SEGMENT_CONFIRMED("SegmentConfirmed"),
    @XmlEnumValue("Overbook")
    OVERBOOK("Overbook"),
    @XmlEnumValue("Waitlisted_PriorityA")
    WAITLISTED_PRIORITY_A("Waitlisted_PriorityA"),
    @XmlEnumValue("Waitlisted_PriorityB")
    WAITLISTED_PRIORITY_B("Waitlisted_PriorityB"),
    @XmlEnumValue("Waitlisted_PriorityC")
    WAITLISTED_PRIORITY_C("Waitlisted_PriorityC"),
    @XmlEnumValue("Waitlisted_PriorityD")
    WAITLISTED_PRIORITY_D("Waitlisted_PriorityD"),
    @XmlEnumValue("Jumpseat")
    JUMPSEAT("Jumpseat"),
    @XmlEnumValue("NeedGroupSpace")
    NEED_GROUP_SPACE("NeedGroupSpace"),
    @XmlEnumValue("PriorityGroup")
    PRIORITY_GROUP("PriorityGroup"),
    @XmlEnumValue("Unable_GroupWaitlisted")
    UNABLE_GROUP_WAITLISTED("Unable_GroupWaitlisted"),
    @XmlEnumValue("Waitlist_Group")
    WAITLIST_GROUP("Waitlist_Group"),
    @XmlEnumValue("SegmentWasWaitlist")
    SEGMENT_WAS_WAITLIST("SegmentWasWaitlist"),
    @XmlEnumValue("SegmentWasReconfirmed")
    SEGMENT_WAS_RECONFIRMED("SegmentWasReconfirmed"),
    @XmlEnumValue("SegmentWasPending")
    SEGMENT_WAS_PENDING("SegmentWasPending"),
    @XmlEnumValue("BookedOutsideSystem")
    BOOKED_OUTSIDE_SYSTEM("BookedOutsideSystem"),
    @XmlEnumValue("PendingCancel")
    PENDING_CANCEL("PendingCancel"),
    @XmlEnumValue("MandatoryNeed")
    MANDATORY_NEED("MandatoryNeed"),
    @XmlEnumValue("NeedProtection")
    NEED_PROTECTION("NeedProtection"),
    @XmlEnumValue("PendingRequest")
    PENDING_REQUEST("PendingRequest"),
    @XmlEnumValue("PendingCancellation")
    PENDING_CANCELLATION("PendingCancellation"),
    @XmlEnumValue("StaffListingInSSR")
    STAFF_LISTING_IN_SSR("StaffListingInSSR"),
    @XmlEnumValue("LinkSold_HistoryOnly")
    LINK_SOLD_HISTORY_ONLY("LinkSold_HistoryOnly"),
    @XmlEnumValue("CodeshareSold_HistoryOnly")
    CODESHARE_SOLD_HISTORY_ONLY("CodeshareSold_HistoryOnly"),
    @XmlEnumValue("SuperGuaranteedSell_HistoryOnly")
    SUPER_GUARANTEED_SELL_HISTORY_ONLY("SuperGuaranteedSell_HistoryOnly"),
    @XmlEnumValue("Confirming_NewSchedule")
    CONFIRMING_NEW_SCHEDULE("Confirming_NewSchedule"),
    @XmlEnumValue("OnRequest_NewSchedule")
    ON_REQUEST_NEW_SCHEDULE("OnRequest_NewSchedule"),
    @XmlEnumValue("PlacingOnWaitlist_NewSchedule")
    PLACING_ON_WAITLIST_NEW_SCHEDULE("PlacingOnWaitlist_NewSchedule"),
    @XmlEnumValue("StandbyBoarded")
    STANDBY_BOARDED("StandbyBoarded"),
    @XmlEnumValue("Flown")
    FLOWN("Flown"),
    @XmlEnumValue("NoRecordAvailable_NOREC")
    NO_RECORD_AVAILABLE_NOREC("NoRecordAvailable_NOREC"),
    @XmlEnumValue("GoShow")
    GO_SHOW("GoShow"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("OffloadFirmBooked")
    OFFLOAD_FIRM_BOOKED("OffloadFirmBooked"),
    @XmlEnumValue("OffloadOfGoShow")
    OFFLOAD_OF_GO_SHOW("OffloadOfGoShow"),
    @XmlEnumValue("Downgrade_ToEconomyClass")
    DOWNGRADE_TO_ECONOMY_CLASS("Downgrade_ToEconomyClass"),
    @XmlEnumValue("DownUpgrade_ToBusinessClass")
    DOWN_UPGRADE_TO_BUSINESS_CLASS("DownUpgrade_ToBusinessClass"),
    @XmlEnumValue("Upgrade_ToFirstClass")
    UPGRADE_TO_FIRST_CLASS("Upgrade_ToFirstClass"),
    @XmlEnumValue("OffloadOfNoRecordPassenger")
    OFFLOAD_OF_NO_RECORD_PASSENGER("OffloadOfNoRecordPassenger"),
    @XmlEnumValue("HoldsConfirmed_ConditionalEMD_Required")
    HOLDS_CONFIRMED_CONDITIONAL_EMD_REQUIRED("HoldsConfirmed_ConditionalEMD_Required"),
    @XmlEnumValue("HoldsConfirmed_EMD_Required")
    HOLDS_CONFIRMED_EMD_REQUIRED("HoldsConfirmed_EMD_Required"),
    @XmlEnumValue("HoldsConfirmed_EMD_Issued")
    HOLDS_CONFIRMED_EMD_ISSUED("HoldsConfirmed_EMD_Issued"),
    @XmlEnumValue("HoldsConfirmed_NewSchedule_EMDAlreadyIssued")
    HOLDS_CONFIRMED_NEW_SCHEDULE_EMD_ALREADY_ISSUED("HoldsConfirmed_NewSchedule_EMDAlreadyIssued"),

    /**
     * It is strongly recommended that you submit a comment to have any of your extended list values permanently added to the OpenTravel specification to support maximum trading partner interoperability. http://www.opentraveldevelopersnetwork.com/specificationcomments/2/entercomment.html
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    EnumStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumStatus fromValue(String v) {
        for (EnumStatus c: EnumStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
