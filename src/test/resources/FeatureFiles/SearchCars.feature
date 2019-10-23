

@Search-Cars @Smoke-Test
Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that 
  the Search Cars page is working
  Doing the Acceptance Testing

  @Search-Cars-Positive
  Scenario: Validate Search Cars Page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide Website
    When I move to Car For Sale Menu
      | Menu          |
      | Cars For Sale |
    And click on "Search Cars" link
    And select carbrand as "BMW" from AnyMake dropdown
    And select "1 SERIES" as car model
    And select location as "Australia" from SelectLocation dropdown
    And select "$1,000" as price
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Cars Under $1000 for Sale | CarsGuide"

    