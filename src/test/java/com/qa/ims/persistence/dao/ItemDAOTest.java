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
//	public void testReadAll() {
//		List<Item> expected = new ArrayList<>();
//		expected.add(1l, "chair",560l,4.99d);
//		expected.add(2l, "chair", 401l, 4.99d);
		
//		assertEquals(expected, dao.readAll());
//	}
	
	@Test
	public void testCreate() {
		Item expected = new Item(2l, "table", 560l, 54.00d);
		assertEquals(expected, dao.create(expected));
	}
	
	@Test
	public void testUpdate() {
		Item expected = new Item(1l, "chair", 560l, 4.99d);
		assertEquals(expected, dao.update(expected));
	}
	
	@Test
	public void testDelete() {
		assertEquals(1, dao.delete(1));
	}
	
	@Test
	public void readAllTest() {
		
	}
	

}
