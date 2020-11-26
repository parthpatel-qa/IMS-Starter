package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OrderTest {
	

	@Test
	public void constructorTest1() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> orderLineList = null;
		Order order = new Order(1l, 1l, date, 1.00,orderLineList);
	
		assertTrue(order instanceof Order);
	}
	
	@Test
	public void constructorTest2() {
		Date date = Date.valueOf("1996-04-04");
		Order order = new Order(1l, date);
	
		assertTrue(order instanceof Order);
	}
	
	@Test
	public void constructorTest3() {
		Order order = new Order( 1l, 1.00);
	
		assertTrue(order instanceof Order);
	}
	
	@Test
	public void getOrderIDTest() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> orderLineList = null;
		Order order = new Order(1l, 1l, date, 1.00,orderLineList);
	
		assertEquals(Long.valueOf(1l), order.getOrder_ID());
	}
	
	@Test
	public void setOrderIDTest() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> orderLineList = null;
		Order order = new Order(1l, 1l, date, 1.00,orderLineList);
	
		order.setOrder_ID(2l);
		assertEquals(Long.valueOf(2l), order.getOrder_ID());
	}
	@Test
	public void getCustomerIDTest() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> orderLineList = null;
		Order order = new Order(1l, 2l, date, 1.00,orderLineList);
	
		assertEquals(Long.valueOf(2l), order.getCustomer_ID());
	}
	
	@Test
	public void setCustomerIDTest() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> orderLineList = null;
		Order order = new Order(1l, 2l, date, 1.00,orderLineList);
	
		order.setCustomer_id(3l);
		assertEquals(Long.valueOf(3l), order.getCustomer_ID());
	}
	
	@Test
	public void getOrderDateTest() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> orderLineList = null;
		Order order = new Order(1l, 2l, date, 1.00,orderLineList);
	
		assertEquals(date, order.getDate_Placed());
	}
	
	@Test
	public void setOrderDateTest() {
		Date date = Date.valueOf("1996-04-04");
		Order order = new Order(1l, 5.00);
	
		order.setDate_Placed(date);
		assertEquals(date, order.getDate_Placed());
	}
	
	@Test
	public void getTotal_costTest() {
		Order order = new Order(1l, 1.00);
		assertEquals(Double.valueOf(1.00), Double.valueOf(order.getTotal()));
	}
	
	@Test
	public void setTotal_costTest() {
		Order order = new Order(1l, 1.00);
		order.setTotal(2.00);
		assertEquals(Double.valueOf(2.00), Double.valueOf(order.getTotal()));
	}
	
	@Test
	public void getOrderLineList() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> orderLineList = null;
		Order order = new Order(1l, 2l, date, 1.00,orderLineList);
	
		assertEquals(orderLineList, order.getOrderLineList());
	}
	
	@Test
	public void setOrderLineList() {
		Order order = new Order(1l, 1.00);
		List<OrderLine> orderLineList = null;
		order.setOrderLineList(orderLineList);
		
		assertEquals(orderLineList, order.getOrderLineList());
	}
	
	@Test
	public void toStringTest() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> odl = new ArrayList<>();
		odl.add(new OrderLine(1l, 1l, 1l));
		Order order = new Order(1l, 2l, date, 1.00, odl);
	
		String output = order.toString();
		String expected = "Order ID: " + 1l + " Customer ID: " + 2l + " Total: "+ 1.00+" Date: " + date;
		expected += "\n\t Items: " + "\n";
		expected += "\t---------------\n";

			expected += "\t" + odl.get(0).toString()+ "\n";
			
		assertEquals(expected, output);
		}
	
	@Test
	public void equalsTest() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> odl = new ArrayList<>();
		odl.add(new OrderLine(1l, 1l, 1l));
		Order order = new Order(1l, 2l, date, 1.00,odl);
		Order order2 = new Order(1l, 2l, date, 1.00,odl);

		assertTrue(order.equals(order2));
	}

}
