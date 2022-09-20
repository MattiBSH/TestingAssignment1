Feature: numerals to roman numerals conversion

  Scenario: 42 is put in as roman numerals and XLII is returned
    Given I have 42.0 as number of numerals
    When I convert the number to roman numerals
    Then I should get XLII as roman numerals