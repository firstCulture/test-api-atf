package com.herokuapp.booker.restful.api.booking;

import com.herokuapp.booker.restful.common.consts.RestUrlConst;
import com.herokuapp.booker.restful.util.RestData;
import com.herokuapp.booker.restful.util.RestUtil;

public class CreateBooking {

    /**
     * Create booking through api
     *
     * @return String request response
     */
    public String createBooking() {
        return RestUtil.postRequest(RestUrlConst.CREATE_BOOKING, RestData.rightBody, 200);
    }

    /**
     * Create invalid booking through api
     *
     * @return String request response
     */
    public String createInvalidBooking() {
        return RestUtil.postRequest(RestUrlConst.CREATE_BOOKING, RestData.wrongBody, 500);
    }

}
