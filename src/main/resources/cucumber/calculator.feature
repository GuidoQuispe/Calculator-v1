Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself
 
  @add
  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 plus 3
    Then the result should be 5

