package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderLine;
import com.qa.ims.utils.DBUtils;

public class OrderDAOTest {
	
	private final OrderDAO dao = new OrderDAO();

	@BeforeClass
	public static void init() {
		DBUtils.connect("root", "root");
	}

	@Before
	public void setup() {
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data-test.sql");
	}

//	@Test
//	public void readAllTest() {
//		List<Order> expected = new ArrayList<>();
//		Date date = Date.valueOf("1996-04-04");
//		List<OrderLine> odl = new ArrayList<>();
//		expected.add(new Order(1l, "1996-04-04"));
//		expected.add(new Order(1l, date));

//		dao.create(new Order(1l, date));
//		assertEquals(expected, dao.readAll());
//	}
	
//	@Test
//	public void createTest() {
//		Date date = Date.valueOf("1996-04-04");
//		List<OrderLine> odl = new ArrayList<>();
//		Order expected = new Order(5l, 2l, date, 1.00, odl);
	
//		assertEquals(expected, dao.create(expected));
//	}
	
//	@Test
//	public void readOrdersTest() {
//		Date date = Date.valueOf("1996-04-04");
//		List<OrderLine> odl = new ArrayList<>();
//		Order expected = new Order(4l, 4l, date, 54.00, odl);
	
//		assertEquals(expected, dao.readOrders(1l));
//	}
	
//	@Test
//	public void updateTest() {
//		Date date = Date.valueOf("1996-04-04");
//		List<OrderLine> odl = new ArrayList<>();
//		Order expected = new Order(1l, 1l, date, 2.00, odl);
	
//		assertEquals(expected, dao.update(expected));
//	}
	
	@Test
	public void deleteTest() {
		assertEquals(0, dao.delete(1l));
	}
	
	

}
