package com.herokuapp.booker.restful.dto;

import org.json.JSONObject;

public class BookingDates {

    private String checkIn;
    private String checkOut;

    public BookingDates(JSONObject jsonObject) {
        this.checkIn = jsonObject.get("checkin").toString();
        this.checkOut = jsonObject.get("checkout").toString();
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
}
