package com.herokuapp.booker.restful.api.booking;

import com.herokuapp.booker.restful.common.consts.RestUrlConst;
import com.herokuapp.booker.restful.util.RestUtil;

public class GetBooking {

    public String getBookingById(int id) {
        return RestUtil.getRequest(String.format(RestUrlConst.GET_BOOKING, id), 200);
    }

}
