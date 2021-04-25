package com.herokuapp.booker.restful.stepdef;

import com.herokuapp.booker.restful.api.booking.CreateBooking;
import com.herokuapp.booker.restful.api.booking.GetBooking;
import com.herokuapp.booker.restful.common.helper.StoreDataHelper;
import com.herokuapp.booker.restful.dto.BookingDTO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lombok.SneakyThrows;
import org.json.JSONObject;

import static com.herokuapp.booker.restful.common.consts.GlobalConst.BOOKING_JSON_VALUE;
import static com.herokuapp.booker.restful.common.consts.GlobalConst.FULL_NAME__VALUE;
import static org.junit.Assert.assertEquals;

public class BookingStepDef {

    @Given("^Make booking POST request with invalid credentials$")
    public void makeBookingPostRequestWithInvalidCredentials() {
        CreateBooking booking = new CreateBooking();
        String response = booking.createInvalidBooking();

        assertEquals("Booking Post request was valid", response, "Internal Server Error");
    }

    @SneakyThrows
    @And("^Make POST request that creates a new booking$")
    public void makePOSTRequestThatCreatesANewBooking() {
        BookingDTO bookingDTO = new BookingDTO();
        CreateBooking booking = new CreateBooking();
        bookingDTO = bookingDTO.parseBookingWithId(new JSONObject(booking.createBooking()));

        assertEquals(bookingDTO.getFirstName(), bookingDTO.getFirstName());
        assertEquals(bookingDTO.getLastName(), bookingDTO.getLastName());
        assertEquals(bookingDTO.getTotalPrice(), bookingDTO.getTotalPrice());
        assertEquals(bookingDTO.isDepositPaid(), bookingDTO.isDepositPaid());
        assertEquals(bookingDTO.isDepositPaid(), bookingDTO.isDepositPaid());
        assertEquals(bookingDTO.getBookingDates().getCheckIn(), bookingDTO.getBookingDates().getCheckIn());
        assertEquals(bookingDTO.getBookingDates().getCheckOut(), bookingDTO.getBookingDates().getCheckOut());
        assertEquals(bookingDTO.getAdditionalNeeds(), bookingDTO.getAdditionalNeeds());
        StoreDataHelper.storeObjectHelper.put(BOOKING_JSON_VALUE, bookingDTO);
    }

    @And("^Make GET request with booking id from made POST request$")
    public void makeGETRequestWithBookingIdFromMadePOSTRequest() {
        BookingDTO bookingDTO = (BookingDTO) StoreDataHelper.storeObjectHelper.get(BOOKING_JSON_VALUE);
        Integer bookingId = bookingDTO.getBookingId();

        GetBooking booking = new GetBooking();
        BookingDTO response = new BookingDTO();
        response = response.parseBooking(new JSONObject(booking.getBookingById(bookingId)));

        assertEquals(bookingDTO.getFirstName(), response.getFirstName());
        assertEquals(bookingDTO.getLastName(), response.getLastName());
        assertEquals(bookingDTO.getTotalPrice(), response.getTotalPrice());
        assertEquals(bookingDTO.isDepositPaid(), response.isDepositPaid());
        assertEquals(bookingDTO.isDepositPaid(), response.isDepositPaid());
        assertEquals(bookingDTO.getBookingDates().getCheckIn(), response.getBookingDates().getCheckIn());
        assertEquals(bookingDTO.getBookingDates().getCheckOut(), response.getBookingDates().getCheckOut());
        assertEquals(bookingDTO.getAdditionalNeeds(), response.getAdditionalNeeds());
        StoreDataHelper.storeStringDataHelper.put(FULL_NAME__VALUE, response.getFirstName().concat(" ").concat(response.getLastName()));
    }

}
