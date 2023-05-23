Feature: Calculator

  Scenario: Addition
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5

  Scenario: Subtraction
    Given I have a calculator
    When I subtract 5 from 7
    Then the result should be 2
