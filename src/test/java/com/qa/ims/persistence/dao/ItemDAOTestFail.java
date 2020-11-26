package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTestFail {
	private final ItemDAO DAO = new ItemDAO();
	@BeforeClass
	public static void init() {
		DBUtils.connect("root", "fail");
	}

	@Before
	public void setup() {
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test
	public void testReadAllFail() {
		List<Item> expected = new ArrayList<>();

		assertEquals(expected, DAO.readAll());
	}

	
	@Test
	public void testReadLatestFail() {
		assertEquals(null, DAO.readLatest());
	}
	
	@Test
	public void testCreateFail() {
		Item expected = new Item(2l, "chair", 100l, 1.00d);
		assertEquals(null, DAO.create(expected));
	}
	
	@Test
	public void testReadItemFail() {
		
		assertEquals(null, DAO.readItem(1l));
	}
	
	@Test
	public void testUpdateFail() {
		Item expected = new Item(1l, "chair2", 1l, 1.00d);
		assertEquals(null, DAO.update(expected));
	}
	
	@Test
	public void testDeleteFail() {
		assertEquals(0, DAO.delete(1l));
	}


}
