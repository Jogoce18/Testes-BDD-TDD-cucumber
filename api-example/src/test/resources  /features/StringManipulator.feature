Feature: String Manipulator

  Scenario: Concatenate two strings
    Given I have a string manipulator
    When I concatenate "Hello" and "World"
    Then the result should be "HelloWorld"

  Scenario: Convert string to uppercase
    Given I have a string manipulator
    When I convert "hello" to uppercase
    Then the result should be "HELLO"

  Scenario: Reverse a string
    Given I have a string manipulator
    When I reverse "hello"
    Then the result should be "olleh"
