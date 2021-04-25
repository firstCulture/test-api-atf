package com.herokuapp.booker.restful.common.restAssertions;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import static org.junit.Assert.assertEquals;


public class RestAssertions {

    /**
     * Assert two JSONObjects
     *
     * @param jsonObject1 first JSONObject
     * @param jsonObject2 second JSONObject
     */
    @SneakyThrows
    public static void assertJson(String jsonObject1, String jsonObject2) {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(mapper.readTree(String.valueOf(jsonObject1)), mapper.readTree(String.valueOf(jsonObject2)));
    }

}
