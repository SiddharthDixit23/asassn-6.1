package com.developers.siddharth.testingassignment;

/**
 * Created by siddharth on 7/22/2017.
 */

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmailValidatorTest {
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"));
    }
}