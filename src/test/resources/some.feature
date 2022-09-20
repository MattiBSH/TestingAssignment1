Feature: Celsius to fahrenheit conversion

  Scenario: a whole number
    Given I have 42 celcius
    When I convert the temperature to fahrenheit
    Then I should get 107.6 fahrenheit