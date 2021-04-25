Feature: Validate Booking functionality and API service

  @Test
  Scenario: Validate booking POST and GET request and ui filter field
    Given Make booking POST request with invalid credentials
    And Make POST request that creates a new booking
    And Make GET request with booking id from made POST request
    When User opens index page
    And User search in the filter filed by full name
    Then Validate that restful booker title is present

