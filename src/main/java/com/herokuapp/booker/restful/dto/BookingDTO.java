package com.herokuapp.booker.restful.dto;

import org.json.JSONObject;

public class BookingDTO {

    private Integer bookingId;
    private String firstName;
    private String lastName;
    private Integer totalPrice;
    private Boolean depositPaid;
    private BookingDates bookingDates;
    private String additionalNeeds;

    public BookingDTO parseBooking (JSONObject jsonObject) {
        this.firstName = jsonObject.get("firstname").toString();
        this.lastName = jsonObject.get("lastname").toString();;
        this.totalPrice = Integer.parseInt(jsonObject.get("totalprice").toString());;
        this.depositPaid = Boolean.parseBoolean(jsonObject.get("depositpaid").toString());;
        this.bookingDates = new BookingDates(jsonObject.getJSONObject("bookingdates"));
        this.additionalNeeds = jsonObject.get("additionalneeds").toString();

        return this;
    }

    public BookingDTO parseBookingWithId(JSONObject jsonObject) {
        this.bookingId = Integer.parseInt(jsonObject.get("bookingid").toString());
        JSONObject bookingJson = jsonObject.getJSONObject("booking");
        this.firstName = bookingJson.get("firstname").toString();
        this.lastName = bookingJson.get("lastname").toString();;
        this.totalPrice = Integer.parseInt(bookingJson.get("totalprice").toString());;
        this.depositPaid = Boolean.parseBoolean(bookingJson.get("depositpaid").toString());;
        this.bookingDates = new BookingDates(bookingJson.getJSONObject("bookingdates"));
        this.additionalNeeds = bookingJson.get("additionalneeds").toString();

        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(Boolean depositPaid) {
        this.depositPaid = depositPaid;
    }

    public BookingDates getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(BookingDates bookingDates) {
        this.bookingDates = bookingDates;
    }

    public String getAdditionalNeeds() {
        return additionalNeeds;
    }

    public void setAdditionalNeeds(String additionalNeeds) {
        this.additionalNeeds = additionalNeeds;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }
}
