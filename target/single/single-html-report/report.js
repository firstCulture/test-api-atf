$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Booking.feature");
formatter.feature({
  "name": "Validate Booking functionality and API service",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate booking POST and GET request and ui filter field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Make booking POST request with invalid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.herokuapp.booker.restful.stepdef.BookingStepDef.makeBookingPostRequestWithInvalidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Make POST request that creates a new booking",
  "keyword": "And "
});
formatter.match({
  "location": "com.herokuapp.booker.restful.stepdef.BookingStepDef.makePOSTRequestThatCreatesANewBooking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Make GET request with booking id from made POST request",
  "keyword": "And "
});
formatter.match({
  "location": "com.herokuapp.booker.restful.stepdef.BookingStepDef.makeGETRequestWithBookingIdFromMadePOSTRequest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens index page",
  "keyword": "When "
});
formatter.match({
  "location": "com.herokuapp.booker.restful.stepdef.CommonStepDef.userOpensIndexPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search in the filter filed by full name",
  "keyword": "And "
});
formatter.match({
  "location": "com.herokuapp.booker.restful.stepdef.CommonStepDef.userSearchInTheFilterFiledByFullName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate that restful booker title is present",
  "keyword": "Then "
});
formatter.match({
  "location": "com.herokuapp.booker.restful.stepdef.CommonStepDef.validateThatATextIsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});