package com.example.testeTDD;

import com.example.EmailValidator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailValidatorTest {

    @Test
    public void testValidEmail() {
        EmailValidator validator = new EmailValidator();
        assertTrue(validator.isValid("test@example.com"));
    }

    @Test
    public void testInvalidEmailMissingAtSymbol() {
        EmailValidator validator = new EmailValidator();
        assertFalse(validator.isValid("testexample.com"));
    }

    @Test
    public void testInvalidEmailMissingDomain() {
        EmailValidator validator = new EmailValidator();
        assertFalse(validator.isValid("test@"));
    }

    @Test
    public void testInvalidEmailMissingUsername() {
        EmailValidator validator = new EmailValidator();
        assertFalse(validator.isValid("@example.com"));
    }

    @Test
    public void testInvalidEmailSpecialCharacters() {
        EmailValidator validator = new EmailValidator();
        assertFalse(validator.isValid("test^@example.com"));
    }
}
