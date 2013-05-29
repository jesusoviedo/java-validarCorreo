package com.amatellanes.validators;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValidatorEmailTest {

	private static String[] validEmails, invalidEmails;

	/**
	 * Load data to run the tests.
	 */
	@BeforeClass
	public static void emailProviderText() {
		validEmails = new String[] { "test@example.com",
				"test-101@example.com", "test.101@yahoo.com",
				"test101@example.com", "test_101@example.com",
				"test-101@test.net", "test.100@example.com.au", "test@e.com",
				"test@1.com", "test@example.com.com", "test+101@example.com",
				"101@example.com", "test-101@example-test.com" };

		invalidEmails = new String[] { "example", "example@.com.com",
				"exampel101@test.a", "exampel101@.com", ".example@test.com",
				"example**()@test.com", "example@%*.com",
				"example..101@test.com", "example.@test.com",
				"test@example_101.com", "example@test@test.com",
				"example@test.com.a5" };
	}

	/**
	 * Test which validate an array of valid e-mails.
	 */
	@Test
	public void validEmailTest() {

		for (String temp : validEmails) {

			// Check if the e-mail is valid using our method.
			boolean valid = ValidatorUtil.validateEmail(temp);
			System.out.println("Email is valid : " + temp + " , " + valid);

			// All of e-mails of this test must be valid.
			Assert.assertEquals(valid, true);
		}

	}

	/**
	 * Test which validate an array of invalid e-mails.
	 */
	@Test
	public void invalidEmailTest() {

		for (String temp : invalidEmails) {

			// Check if the e-mail is valid using our method.
			boolean valid = ValidatorUtil.validateEmail(temp);
			System.out.println("Email is valid : " + temp + " , " + valid);

			// All of e-mails of this test must be invalid.
			Assert.assertEquals(valid, false);
		}

	}

}
