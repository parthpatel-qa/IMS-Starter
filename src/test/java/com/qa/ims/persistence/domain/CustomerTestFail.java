package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTestFail {
	
	@Test
	public void testFailID() {
		Customer c = new Customer(1l, "Test", "Test@test");
		Customer c1 = new Customer(2l, "Test", "Test@test");
		
		assertEquals(false, c.equals(c1));
	}
	@Test
	public void testFailIDNull() {
		Customer c = new Customer(null, "Test", "Test@test");
		Customer c1 = new Customer(2l, "Test", "Test@test");
		
		assertEquals(false, c.equals(c1));
	}
	@Test
	public void testFailFirstName() {
		Customer c = new Customer(1l, "Test", "Test@test");
		Customer c1 = new Customer(1l, "fail", "Test@test");
		
		assertEquals(false, c.equals(c1));
	}
	@Test
	public void testFailFirstNameNull() {
		Customer c = new Customer(1l, null, "Test@test");
		Customer c1 = new Customer(1l, "fail", "Test@test");
		
		assertEquals(false, c.equals(c1));
	}

	@Test
	public void equalsTestFailSurname() {
		Customer c = new Customer(1l, "Test", "Test@test");
		Customer c1 = new Customer(1l, "Test", "Test@fail");
		
		assertEquals(false, c.equals(c1));
	}
	@Test
	public void equalsTestFailSurnameNull() {
		Customer c = new Customer(1l, "Test", null);
		Customer c1 = new Customer(1l, "Test", "Test@fail");
		
		assertEquals(false, c.equals(c1));
	}
}
