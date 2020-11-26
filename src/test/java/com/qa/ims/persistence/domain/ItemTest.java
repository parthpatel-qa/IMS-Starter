package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ItemTest {
	
	@Test
	public void constructorTest1() {
		Item item = new Item("Name", 1l, 1.00);
		assertTrue(item instanceof Item);
	}
	
	@Test
	public void constructorTest2() {
		Item item = new Item(1l, "Name", 1l, 1.00);
		assertTrue(item instanceof Item);
	}
	
	@Test
	public void getItemIdTest() {
		Item item = new Item(1l, "Name", 1l, 1.00);
		assertEquals(Long.valueOf(1l), item.getItem_id());
	}
	
	@Test
	public void setIDTest() {
		Item item = new Item("Name", 1l, 1.00);
		item.setItem_id(1l);
		assertEquals(Long.valueOf(1l), item.getItem_id());
	}
	
	@Test
	public void getItemTitleTest() {
		Item item = new Item(1l, "Name", 1l, 1.00);
		assertEquals("Name", item.getItem_name());
	}
	
	@Test
	public void setItemTitleTest() {
		Item item = new Item("Name", 1l, 1.00);
		item.setItem_name("Name2");
		assertEquals("Name2", item.getItem_name());
	}
	
	
	@Test
	public void getPriceTest() {
		Item item = new Item("Name", 1l, 1.00);
		assertEquals(Double.valueOf(1.00), Double.valueOf(item.getPrice()));
	}
	
	@Test
	public void setPriceTest() {
		Item item = new Item("Name", 1l, 1.00);
		item.setPrice(2.00);
		assertEquals(Double.valueOf(2.00), Double.valueOf(item.getPrice()));
	}
	
	@Test
	public void toStringTest() {
		Item item = new Item(1l, "Name", 1l, 1.00);
		String created = item.toString();
		String expected = "Item id: "+ 1 + ", Item: "+ "Name" +", Price: "+1.00 +", Quantity: "+ 1;
		assertEquals(expected, created);
	}
	
	@Test
	public void equalsTest() {
		Item item = new Item(1l, "Name", 1l, 1.00);
		Item item2 = new Item(1l, "Name", 1l, 1.00);
		
		assertEquals(true, item.equals(item2));
	}

}
