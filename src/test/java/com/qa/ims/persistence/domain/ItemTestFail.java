package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTestFail {

	@Test
	public void itemNameTestFail() {
		Item i = new Item(1l, "name", 1l, 1.00);
		Item i2 = new Item(1l, "fail", 1l, 1.00);
		
		assertEquals(false, i.equals(i2));
	}
	
	@Test
	public void itemNameTestFailNull() {
		Item i = new Item(1l, null, 1l, 1.00);
		Item i2 = new Item(1l, "fail", 1l, 1.00);
		
		assertEquals(false, i.equals(i2));
	}
	
	@Test
	public void item_IDTestFail() {
		Item i = new Item(1l, "name", 1l, 1.00);
		Item i2 = new Item(2l, "fail", 1l, 1.00);
		
		assertEquals(false, i.equals(i2));
	}
	
	@Test
	public void item_IDTestFailNull() {
		Item i = new Item(null, "name", 1l, 1.00);
		Item i2 = new Item(2l, "fail", 1l, 1.00);
		
		assertEquals(false, i.equals(i2));
	}
	
	@Test
	public void quantityTestFail() {
		Item i = new Item(1l, "fail", 2l, 1.00);
		Item i2 = new Item(1l, "fail", 1l, 1.00);
		
		assertEquals(false, i.equals(i2));
	}
	
	@Test
	public void quantityTestFailNull() {
		Item i = new Item(1l, "fail", null, 1.00);
		Item i2 = new Item(1l, "fail", 1l, 1.00);
		
		assertEquals(false, i.equals(i2));
	}
	
	@Test
	public void priceTestFail() {
		Item i = new Item(1l, "fail", 1l, 1.01);
		Item i2 = new Item(1l, "fail", 1l, 1.00);
		
		assertEquals(false, i.equals(i2));
	}
	
	@Test
	public void priceTestFailNull() {
		Item i = new Item(1l, "fail", 1l, 0);
		Item i2 = new Item(1l, "fail", 1l, 1.00);
		
		assertEquals(false, i.equals(i2));
	}
	
}
