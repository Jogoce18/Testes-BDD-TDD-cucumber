package com.example.testeBDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class ExampleStepDefinitions {

    private int result;
    private int number1;
    private int number2;

    @Given("I have two numbers")
    public void givenIHaveTwoNumbers() {
        number1 = 2;
        number2 = 2;
    }

    @When("I add the numbers together")
    public void whenIAddTheNumbersTogether() {
        result = number1 + number2;
    }

    @Then("the result should be 4")
    public void thenTheResultShouldBeFour() {
        assertEquals(4, result);
    }
}
