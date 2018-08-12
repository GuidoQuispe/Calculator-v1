Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself
 
  @add
  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 plus 3
    Then the result should be 5

Scenario: Add two numbers
    Given I have a calculator
    When I add 2 plus 8
    Then the result should be 10

Scenario: Add two numbers
    Given I have a calculator
    When I add 2 plus 3
    Then the result should be 5

Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 8 - 3
    Then the result should be 5

Scenario: Multiply two numbers
    Given I have a calculator
    When I multiply 8 x 5
    Then the result should be 40

Scenario: Multiply two numbers
    Given I have a calculator
    When I multiply 8 x 8
    Then the result should be 64