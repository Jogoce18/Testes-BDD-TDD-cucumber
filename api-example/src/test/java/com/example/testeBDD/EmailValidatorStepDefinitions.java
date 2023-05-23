package com.example.testeBDD;

import com.example.EmailValidator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailValidatorStepDefinitions {
    private EmailValidator validator;
    private String email;
    private boolean isValid;

    @Given("I have an email validator")
    public void iHaveAnEmailValidator() {
        validator = new EmailValidator();
    }

    @When("I validate the email {string}")
    public void iValidateTheEmail(String email) {
        this.email = email;
        isValid = validator.isValid(email);
    }

    @Then("it should be valid")
    public void itShouldBeValid() {
        assertTrue(isValid);
    }

    @Then("it should be invalid")
    public void itShouldBeInvalid() {
        assertFalse(isValid);
    }
}
