package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OrderTestFail {
	
	@Test
	public void order_IDTestFail() {
	Date date = Date.valueOf("1996-04-04");
	List<OrderLine> odl = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(1l,2l,date,1.00,odl);
	Order o2 = new Order(2l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
	
	@Test
	public void order_IDTestNull() {
	Date date = Date.valueOf("1996-04-04");
	List<OrderLine> odl = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(null,2l,date,1.00,odl);
	Order o2 = new Order(2l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
	
	@Test
	public void customer_IDTestFail() {
	Date date = Date.valueOf("1996-04-04");
	List<OrderLine> odl = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(1l,1l,date,1.00,odl);
	Order o2 = new Order(1l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
	
	@Test
	public void customer_IDTestNull() {
	Date date = Date.valueOf("1996-04-04");
	List<OrderLine> odl = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(2l,null,date,1.00,odl);
	Order o2 = new Order(2l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
	
	@Test
	public void date_placedTestFail() {
	Date date = Date.valueOf("1996-04-04");
	Date date2 = Date.valueOf("1996-04-05");
	List<OrderLine> odl = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(1l,2l,date2,1.00,odl);
	Order o2 = new Order(1l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
	
	@Test
	public void date_placedTestNull() {
	Date date = Date.valueOf("1996-04-04");
	List<OrderLine> odl = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(2l,2l,null,1.00,odl);
	Order o2 = new Order(2l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
	
	@Test
	public void totalTestFail() {
	Date date = Date.valueOf("1996-04-04");
	List<OrderLine> odl = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(1l,2l,date,1.01,odl);
	Order o2 = new Order(1l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
	
	@Test
	public void totalTestNull() {
	Date date = Date.valueOf("1996-04-04");
	List<OrderLine> odl = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(2l,2l,date,0,odl);
	Order o2 = new Order(2l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
	
	@Test
	public void odlListTestFail() {
	Date date = Date.valueOf("1996-04-04");
	List<OrderLine> odl = new ArrayList<>();
	List<OrderLine> odl2 = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(1l,2l,date,1.00,odl2);
	Order o2 = new Order(1l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
	
	@Test
	public void odlListTestNull() {
	Date date = Date.valueOf("1996-04-04");
	List<OrderLine> odl = new ArrayList<>();
	odl.add(new OrderLine(1l,1l,1l));
	Order o = new Order(2l,2l,date,1.00,null);
	Order o2 = new Order(2l,2l,date,1.00,odl);
	
	assertEquals(false, o.equals(o2));
	}
}
