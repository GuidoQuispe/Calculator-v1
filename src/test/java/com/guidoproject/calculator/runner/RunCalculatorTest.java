package com.guidoproject.calculator.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty"},
                plugin = {"json:target/cucumber.json"},
                glue = "com.guidoproject.calculator.steps", 
                features = "classpath:cucumber/calculator.feature")
public class RunCalculatorTest {
}