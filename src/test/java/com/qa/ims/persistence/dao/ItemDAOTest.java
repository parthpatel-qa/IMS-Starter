package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTest {
	
	ItemDAO dao = new ItemDAO();
	
	@BeforeClass
	public static void init() {
		DBUtils.connect("root", "root");
	}

	@Before
	public void setup() {
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data-test.sql");
	}
	
	
//	@Test
//	public void testCreate() {
//		Item expected = new Item(5l, "bin", 45l, 9.99);
//		assertEquals(expected, dao.create(expected));
//	}
	
//	@Test
//	public void testUpdate() {
//		Item expected = new Item(1l, "test", 560l, 4.99d);
//		assertEquals(expected, dao.update(expected));
//	}
	
	@Test
	public void testDelete() {
		assertEquals(0, dao.delete(1));
	}
	
//	@Test
//	public void readAllTest() {
//		List<Item> expected = new ArrayList<>();
//		expected.add(new Item(1l, "chair", 401l, 4.99));
//		expected.add(new Item(2l, "suit", 1000l, 500.00));
//		expected.add(new Item(3l, "toy car", 40l, 9.99));
//		expected.add(new Item(4l, "table", 560l, 54.00));
		
//		assertEquals(expected, dao.readAll());
//	}
	
//	@Test
//	public void readLatestTest() {
//		Item expected = new Item(4l, "table", 560l, 54.00);
		
//		assertEquals(expected, dao.readLatest());
//	}
	

}
