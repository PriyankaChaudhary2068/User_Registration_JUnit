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
	        boolean actualOutput = userRegistration.validateFirstName.validate("Priyanka");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test(expected = UserRegistrationException.class)
	    public void validateFirstNameForNegativeScenarioTest() {
	        userRegistration.validateFirstName.validate("priyanka");
	    }

	    @Test
	    public void validateLastNameForPositiveScenarioTest() {
	        boolean actualOutput = userRegistration.validateLastName.validate("Chaudhary");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test(expected = UserRegistrationException.class)
	    public void validateLastNameForNegativeScenarioTest() {
	        userRegistration.validateLastName.validate("chudhary");
	    }

	    @Test
	    public void validateEmailIdForPositiveScenarioTest() {
	        boolean actualOutput = userRegistration.validateEmailId.validate("priyankachaudhary@gmail.com");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test(expected = UserRegistrationException.class)
	    public void validateEmailIdForNegativeScenarioTest() {
	        userRegistration.validateEmailId.validate("priyanka.com");
	    }


	    @Test
	    public void validateMobileNumberForPositiveScenarioTest() {
	        boolean actualOutput = userRegistration.validateMobileNumber.validate("+91 7632789079");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test(expected = UserRegistrationException.class)
	    public void validateMobileNumberForNegativeScenarioTest() {
	        userRegistration.validateLastName.validate("+91 566439987098");
	    }

	    @Test
	    public void validatePasswordForPositiveScenarioTest() {
	        boolean actualOutput = userRegistration.validatePassword.validate("Priyanka@0575");
	        Assert.assertTrue(actualOutput);
	    }

	    @Test(expected = UserRegistrationException.class)
	    public void validatePasswordForNegativeScenarioTest() {
	        userRegistration.validatePassword.validate("Priyanka0575");

	    }
	}
	 		