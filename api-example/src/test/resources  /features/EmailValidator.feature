Feature: Email Validation

  Scenario: Validate a valid email
    Given I have an email validator
    When I validate the email "test@example.com"
    Then it should be valid

  Scenario: Validate an invalid email with missing @ symbol
    Given I have an email validator
    When I validate the email "testexample.com"
    Then it should be invalid

  Scenario: Validate an invalid email with missing domain
    Given I have an email validator
    When I validate the email "test@"
    Then it should be invalid

  Scenario: Validate an invalid email with missing username
    Given I have an email validator
    When I validate the email "@example.com"
    Then it should be invalid

  Scenario: Validate an invalid email with special characters
    Given I have an email validator
    When I validate the email "test^@example.com"
    Then it should be invalid
