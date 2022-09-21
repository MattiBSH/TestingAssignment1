Feature: Celsius to fahrenheit conversion

  Scenario: 42 is put in as celcius and fahrenheit is returned
    Given I have 42.0 celcius
    When I convert the temperature to fahrenheit
    Then I should get 107.6 fahrenheit