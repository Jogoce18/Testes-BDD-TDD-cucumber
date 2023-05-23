package com.example.testeBDD;

import com.example.StringManipulator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StringManipulatorStepDefinitions {
    private StringManipulator manipulator;
    private String result;

    @Given("I have a string manipulator")
    public void iHaveAStringManipulator() {
        manipulator = new StringManipulator();
    }

    @When("I concatenate {string} and {string}")
    public void iConcatenateAnd(String str1, String str2) {
        result = manipulator.concatenate(str1, str2);
    }

    @When("I convert {string} to uppercase")
    public void iConvertToUppercase(String str) {
        result = manipulator.convertToUppercase(str);
    }

    @When("I reverse {string}")
    public void iReverse(String str) {
        result = manipulator.reverse(str);
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}
