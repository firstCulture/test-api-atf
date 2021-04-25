package com.herokuapp.booker.restful.util;

import lombok.SneakyThrows;

import java.io.File;

import static com.herokuapp.booker.restful.common.consts.RestConst.APPLICATION_TYPE_VALUE;
import static com.herokuapp.booker.restful.common.consts.RestConst.TOKEN_VALUE;
import static com.jayway.restassured.RestAssured.given;
import static java.lang.Boolean.TRUE;

public class RestUtil {

    private static final String ACCESS_TOKEN = "ea05090e82fc453";
    private static final String APPLICATION_TYPE = "application/json";

    /**
     * Do Get request
     *
     * @param url        required url to do get request
     * @param httpStatus expected http status code
     * @return String response of made request
     */
    public static String getRequest(String url, int httpStatus) {
        return given().header(TOKEN_VALUE, ACCESS_TOKEN)
                .and().header(APPLICATION_TYPE_VALUE, APPLICATION_TYPE)
                .when()
                .get(url)
                .then()
                .log()
                .all(TRUE)
                .assertThat()
                .statusCode(httpStatus)
                .and()
                .extract()
                .asString();
    }

    /**
     * Do Post request
     *
     * @param url        required url to do post request
     * @param body       required body for post request
     * @param httpStatus expected http status code
     * @return String response of made request
     */
    @SneakyThrows
    public static String postRequest(String url, String body, int httpStatus) {
        return given().header(TOKEN_VALUE, ACCESS_TOKEN)
                .and().header(APPLICATION_TYPE_VALUE, APPLICATION_TYPE)
                .and()
                .body(body)
                .when()
                .post(url)
                .then()
                .log()
                .all(TRUE)
                .assertThat()
                .statusCode(httpStatus)
                .and()
                .extract()
                .asString();
    }

    /**
     * DO Put request
     *
     * @param url        required url to do put request
     * @param body       required body for put request
     * @param httpStatus expected http status code
     * @return String response of made request
     */
    public static String putRequest(String url, File body, int httpStatus) {
        return given().header(TOKEN_VALUE, ACCESS_TOKEN)
                .and().header(APPLICATION_TYPE_VALUE, APPLICATION_TYPE)
                .body(body)
                .when()
                .put(url)
                .then()
                .log()
                .all(TRUE)
                .assertThat()
                .statusCode(httpStatus)
                .and()
                .extract()
                .asString();
    }

    /**
     * Do Delete request
     *
     * @param url        required url to do delete request
     * @param httpStatus expected http status code
     * @return String response of made request
     */
    public static String deleteRequest(String url, int httpStatus) {
        return given().header(TOKEN_VALUE, ACCESS_TOKEN)
                .and().header(APPLICATION_TYPE_VALUE, APPLICATION_TYPE)
                .when()
                .delete(url)
                .then()
                .log()
                .all(TRUE)
                .assertThat()
                .statusCode(httpStatus)
                .and()
                .extract()
                .asString();
    }

}
