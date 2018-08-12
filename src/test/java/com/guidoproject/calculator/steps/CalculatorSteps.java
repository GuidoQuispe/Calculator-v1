package com.guidoproject.calculator.steps;

import com.guidoproject.calculator.Calculator;
//import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorSteps {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        assertNotNull(calculator);
    }
    
    @When("^I add (\\d+\\.\\d+|\\d+) plus (\\d+\\.\\d+|\\d+)$")
    public void i_add(int number1, int number2) throws Throwable {
        calculator.add(number1, number2);
    }
    @When("^I subtract (\\d+\\.\\d+|\\d+) - (\\d+\\.\\d+|\\d+)$")
    public void i_subtract(int number1, int number2) throws Throwable {
        calculator.subtract(number1, number2);
    }
    
    @When("^I multiply (\\d+) x (\\d+)$")
    public void i_multiply(int number1, int number2) throws Throwable {
        calculator.multiply(number1, number2);
    }
    
    @When("^I divide (\\d+) / (\\d+)$")
    public void i_divide(int number1, int number2) throws Throwable {
        calculator.divide(number1, number2);
    }
    
    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int result) throws Throwable {
        assertEquals(result, calculator.getResult());
    }
}
