Feature: To test the Booking Functionality of Yatra.com

Scenario: User proceeds to make a booking by providing valid data for every element
Given The Booking is open and running
When The user enters Source location
And The user enters destination
And The user picks the date of travel
And The user clicks on Search Flights 
Then A new page is at screen

Scenario: User is presented with available flight options
Given The user has access to define his search options using filters
When The user clicks on More Filters
And The user choses Fastest flight
And The user choses cheapest flight 
And The user clicks Search Again
Then The application presents the best option as per user's choice