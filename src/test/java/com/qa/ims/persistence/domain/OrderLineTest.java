package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OrderLineTest {
	
	@Test
	public void constructorTest() {
		OrderLine odl = new OrderLine(1L,1L,1L);
		assertTrue(odl instanceof OrderLine);
	}
	
	@Test
	public void getOrder_IDTest() {
		OrderLine odl = new OrderLine(1l,2l,3l);
		assertEquals(Long.valueOf(1l), odl.getOrder_ID());
	}
	
	@Test
	public void setOrder_IDTest() {
		OrderLine odl = new OrderLine(4l,5l,6l);
		odl.setOrder_ID(9l);
		assertEquals(Long.valueOf(9l),odl.getOrder_ID());
	}
	
	@Test
	public void getItem_IDTest() {
		OrderLine odl = new OrderLine (1l,2l,3l);
		assertEquals(Long.valueOf(2l),odl.getItem_ID());
	}
	
	@Test
	public void setItem_IDTest() {
		OrderLine odl = new OrderLine(4l,5l,6l);
		odl.setItem_ID(9l);
		assertEquals(Long.valueOf(9l),odl.getItem_ID());
	}
	
	@Test
	public void getQuantityTest() {
		OrderLine odl = new OrderLine (1l,2l,3l);
		assertEquals(Long.valueOf(3l),odl.getQuantity());
	}
	
	@Test
	public void setQuantityTest() {
		OrderLine odl = new OrderLine(4l,5l,6l);
		odl.setQuantity(9l);
		assertEquals(Long.valueOf(9l),odl.getQuantity());
	}
	
	@Test
	public void toStringTest() {
		OrderLine odl = new OrderLine (1l,2l,3l);
		String created = odl.toString();
		String expected = "OrderLine [Order ID=" + 1 + ", Item ID=" + 2 + ", Quantity=" + 3 + "]";
		assertEquals(expected, created);
	}
	
	@Test
	public void equalsTest() {
		OrderLine odl = new OrderLine(1l, 1l, 1l);
		OrderLine odl1 = new OrderLine(1l, 1l, 1l);
		
		assertEquals(true, odl.equals(odl1));
	}
	
}
