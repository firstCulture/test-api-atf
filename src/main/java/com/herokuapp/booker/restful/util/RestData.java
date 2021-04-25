package com.herokuapp.booker.restful.util;

public class RestData {

    public static String rightBody = "{\n" +
            "  \"firstname\" : \"Jhon\",\n" +
            "  \"lastname\" : \"Smith\",\n" +
            "  \"totalprice\" : 111,\n" +
            "  \"depositpaid\" : true,\n" +
            "  \"bookingdates\" : {\n" +
            "    \"checkin\" : \"2021-04-22\",\n" +
            "    \"checkout\" : \"2021-04-23\"\n" +
            "  },\n" +
            "  \"additionalneeds\" : \"Breakfast\"\n" +
            "}";

    public static String wrongBody = "{\n" +
            "  \"firstname\" : \"Jhon\",\n" +
            "  \"lastname\" : null,\n" +
            "  \"totalprice\" : 111,\n" +
            "  \"depositpaid\" : true,\n" +
            "  \"bookingdates\" : {\n" +
            "    \"checkin\" : \"2021-04-22\",\n" +
            "    \"checkout\" : \"2021-04-23\"\n" +
            "  },\n" +
            "  \"additionalneeds\" : \"Breakfast\"\n" +
            "}";

}
