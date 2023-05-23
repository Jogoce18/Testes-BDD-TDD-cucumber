package com.example.testeBDD;

import com.example.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorStepDefinitions {
    private Calculator calculator;
    private int result;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int num1, int num2) {
        result = calculator.add(num1, num2);
    }

    @When("I subtract {int} from {int}")
    public void iSubtractFrom(int num1, int num2) {
        result = calculator.subtract(num2, num1);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}
