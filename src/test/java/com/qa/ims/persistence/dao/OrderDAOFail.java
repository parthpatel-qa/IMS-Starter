  
package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderLine;
import com.qa.ims.utils.DBUtils;

public class OrderDAOFail {
	private final OrderDAO DAO = new OrderDAO();

	@BeforeClass
	public static void init() {
		DBUtils.connect("root", "fail");
	}

	@Before
	public void setup() {
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test
	public void testCreate() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> odl = new ArrayList<>();
		Order expected = new Order(1l, 1l, date, 1.00, odl);
	
		assertEquals(null, DAO.create(expected));
	}
	
	
//	@Test
//	public void testReadAll() {
//		List<Order> expected = new ArrayList<>();
//
//		assertEquals(expected, DAO.readLatest());
//	}
	
	@Test
	public void testReadLatest() {
		assertEquals(null, DAO.readLatest());
	}
	
	@Test
	public void testUpdate() {
		Date date = Date.valueOf("1996-04-04");
		List<OrderLine> odl = new ArrayList<>();
		Order expected = new Order(1l,1l,date,1l, odl);
		assertEquals(null, DAO.update(expected));
	}
	
	@Test
	public void testDelete() {
		assertEquals(0, DAO.delete(1));
	}
	
	@Test
	public void testRemoveItem() {
		assertEquals(0, DAO.delete(1l));
	}
	
///	@Test
//	public void testReadLines() {
//		assertEquals(null, DAO.readLines(1l));

//	}
}