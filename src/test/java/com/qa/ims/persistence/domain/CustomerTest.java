package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void constructorTest1() {
		Customer c = new Customer("Test", "Test@Test");
		assertTrue(c instanceof Customer);
	}
	
	@Test
	public void constructorTest2() {
		Customer c = new Customer(1l,"Test", "Test@test");
		assertTrue(c instanceof Customer);
	}
		
	@Test
	public void getCustomer_IDTest() {
		Customer c = new Customer(1l, "Test", "Test@test");
		assertEquals(Long.valueOf(1l), c.getId());
	}
	
	@Test
	public void setCustomer_IDTest() {
		Customer c = new Customer("Test", "Test@test");
		c.setId(1l);
		assertEquals(Long.valueOf(1l), c.getId());
	}
	
	@Test
	public void getFirstNameTest() {
		Customer c = new Customer("Test", "Test@test");
		assertEquals("Test", c.getFirstName());
	}
	
	@Test
	public void setFirstName() {
		Customer cust = new Customer("Test", "Test@test");
		cust.setFirstName("Tested");
		assertEquals("Tested", cust.getFirstName());
	}
	
	@Test
	public void getLastName() {
		Customer c = new Customer("Test", "Test@test");
		assertEquals("Test@test", c.getSurname());
	}
	
	@Test
	public void setLastName() {
		Customer cust = new Customer("Test", "Test@test");
		cust.setSurname("Tested");
		assertEquals("Tested", cust.getSurname());
	}
	
	@Test
	public void toStringTest() {
		Customer cust = new Customer(1l, "Test", "Test@test");
		String created = cust.toString();
		String expected = "id:" + 1l + " first name:" + "Test" + " surname:" + "Test@test";
		assertEquals(expected, created);
		}
	
	@Test
	public void equalsTest() {
		Customer c = new Customer(1l, "Test", "Test@test");
		Customer c1 = new Customer(1l, "Test", "Test@test");
		
		assertEquals(true, c.equals(c1));
		
	}

}
