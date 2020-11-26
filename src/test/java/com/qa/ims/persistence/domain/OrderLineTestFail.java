package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderLineTestFail {
	
	@Test
	public void orderLineCustomer_IDTestFail() {
	OrderLine odl = new OrderLine(2l,1l,3l);
	OrderLine odl2 = new OrderLine(2l,2l,3l);
	
	assertEquals(false, odl.equals(odl2));
	}
	
	@Test
	public void orderLineCustomer_IDTestNull() {
	OrderLine odl = new OrderLine(1l,null,3l);
	OrderLine odl2 = new OrderLine(1l,2l,3l);
	
	assertEquals(false, odl.equals(odl2));
	}
	
	@Test
	public void orderLineQuantityTestFail() {
	OrderLine odl = new OrderLine(2l,2l,4l);
	OrderLine odl2 = new OrderLine(2l,2l,3l);
	
	assertEquals(false, odl.equals(odl2));
	}
	
	@Test
	public void orderLineQuantityTestNull() {
	OrderLine odl = new OrderLine(1l,2l,null);
	OrderLine odl2 = new OrderLine(1l,2l,3l);
	
	assertEquals(false, odl.equals(odl2));
	}
	
	@Test
	public void orderLineOrder_IDTestFail() {
	OrderLine odl = new OrderLine(1l,2l,3l);
	OrderLine odl2 = new OrderLine(2l,2l,3l);
	
	assertEquals(false, odl.equals(odl2));
	}
	
	@Test
	public void orderLineOrder_IDTestNull() {
	OrderLine odl = new OrderLine(null,2l,3l);
	OrderLine odl2 = new OrderLine(1l,2l,3l);
	
	assertEquals(false, odl.equals(odl2));
	}
}
