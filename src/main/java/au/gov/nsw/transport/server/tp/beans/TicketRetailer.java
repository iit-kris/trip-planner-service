package au.gov.nsw.transport.server.tp.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by AlbeusK on 26/07/2016.
 */
public class TicketRetailer {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Building Name")
    private String bldgName;
    @JsonProperty("Street Name")
    private String streetName;
    @JsonProperty("Suburb")
    private String suburb;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Postcode")
    private String postcode;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("Seller Type")
    private String sellerType;
    @JsonProperty("Phone Number")
    private String phoneNumber;
    @JsonProperty("Accessibility")
    private String accessibility;
    @JsonProperty("Latitude")
    private String latitude;
    @JsonProperty("Longitude")
    private String longitude;
    @JsonProperty("Active")
    private String active;
    @JsonProperty("Active Date")
    private String activeDate;
    @JsonProperty("Inactive Date")
    private String inactiveDate;
    @JsonProperty("Opening Hours")
    private String openingHours;
    @JsonProperty("Ticket Types Sold")
    private String ticketTypesSold;
    @JsonProperty("Comments")
    private String comments;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBldgName() {
        return bldgName;
    }

    public void setBldgName(String bldgName) {
        this.bldgName = bldgName;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

    public String getInactiveDate() {
        return inactiveDate;
    }

    public void setInactiveDate(String inactiveDate) {
        this.inactiveDate = inactiveDate;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getTicketTypesSold() {
        return ticketTypesSold;
    }

    public void setTicketTypesSold(String ticketTypesSold) {
        this.ticketTypesSold = ticketTypesSold;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

}
