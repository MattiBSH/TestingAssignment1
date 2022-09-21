Feature: numerals to roman numerals conversion

  Scenario: 42 is put in as roman numerals and XLII is returned
    Given I have 42.0 as number of numerals
    When I convert the number to roman numerals
    Then I should get XLII as roman numerals

  Scenario: 1 is put in as roman numerals and I is returned
    Given I have 1 as number of numerals
    When I convert the number to roman numerals
    Then I should get I as roman numerals

  Scenario: 21 is put in as roman numerals and XXI is returned
    Given I have 21 as number of numerals
    When I convert the number to roman numerals
    Then I should get XXI as roman numerals