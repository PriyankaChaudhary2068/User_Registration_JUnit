package com.bridgelabz.userRegistrationJUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class UserRegistrationTest {
	 UserRegistration userRegistration;

	    @Before
	    public void setup() {
	        userRegistration = new UserRegistration();
	    }

	    @Test
	    public void validateFirstNameForPositiveScenarioTest() {
	        boolean actualOutput = userRegistration.validateFirstName("Priyanka");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test
	    public void validateFirstNameForNegativeScenarioTest() {
	        boolean actualOutput = userRegistration.validateFirstName("priyanka");
	        Assert.assertFalse(actualOutput);
	    }

	    @Test
	    public void validateLastNameForPositiveScenarioTest() {
	        boolean actualOutput = userRegistration.validateLastName("Chaudhary");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test
	    public void validateLastNameForNegativeScenarioTest() {
	        boolean actualOutput = userRegistration.validateLastName("chaudhary");
	        Assert.assertFalse(actualOutput);
	    }

	    @Test
	    public void validateEmailIdForPositiveScenarioTest() {
	        boolean actualOutput = userRegistration.validateEmailId("priyankachaudhary@gmail.com");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test
	    public void validateEmailIdForNegativeScenarioTest() {
	        boolean actualOutput = userRegistration.validateLastName("priyanka.com");
	        Assert.assertFalse(actualOutput);
	    }


	    @Test
	    public void validateMobileNumberForPositiveScenarioTest() {
	        boolean actualOutput = userRegistration.validateMobileNumber("+91 7632789079");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test
	    public void validateMobileNumberForNegativeScenarioTest() {
	        boolean actualOutput = userRegistration.validateLastName("+91 566439987098");
	        Assert.assertFalse(actualOutput);
	    }

	    @Test
	    public void validatePasswordForPositiveScenarioTest() {
	        boolean actualOutput = userRegistration.validatePassword("Priyanka@0575");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test
	    public void validatePasswordForNegativeScenarioTest() {
	        boolean actualOutput = userRegistration.validatePassword("Priyanka0575");
	        Assert.assertFalse(actualOutput);
	    }

	}


