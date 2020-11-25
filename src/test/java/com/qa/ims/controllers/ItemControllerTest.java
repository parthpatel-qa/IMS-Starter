package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.ItemController;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {
	
	@Mock
	private Utils utils;
	
	@Mock
	private ItemDAO itemDAO;
	
	@InjectMocks
	private ItemController itemController;
	
	@Test
	public void testReadAll() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1l, "bottle", 60l, 5.77));
		items.add(new Item(2l, "toy car", 40l, 9.99));
		
		Mockito.when(itemDAO.readAll()).thenReturn(items);
		
		assertEquals(items, itemController.readAll());
		
		Mockito.verify(itemDAO, Mockito.times(1)).readAll();
	}

	@Test
	public void testCreate() {
		String name = "chair";
		Long quantity = 401l;
		Double price = 4.99;
		Item created = new Item(name, quantity, price);
		Item expected = new Item(3l, name, quantity, price);
		
		Mockito.when(utils.getString()).thenReturn(name);
		Mockito.when(utils.getLong()).thenReturn(quantity);
		Mockito.when(utils.getDouble()).thenReturn(price);
		Mockito.when(itemDAO.create(created)).thenReturn(expected);
		
		assertEquals(expected, itemController.create());
	}
	/*
	 * @Test public void testUpdate() { String name = "chair"; String name2 =
	 * "table"; Long quantity = 440L; Long quantity1 = 560L; Double price = 54.00;
	 * Double price2 = 4.99;
	 * 
	 * Items toUpdate = new Items(3l, name, quantity, price); Items updated = new
	 * Items(3l, name2, quantity1, price2);
	 * 
	 * Mockito.when(utils.getString()).thenReturn(name2);
	 * Mockito.when(utils.getLong()).thenReturn(quantity1);
	 * Mockito.when(utils.getDouble()).thenReturn(price2);
	 * Mockito.when(itemDAO.update(toUpdate)).thenReturn(updated);
	 * 
	 * assertEquals(updated, itemController.update());
	 * 
	 * Mockito.verify(utils, Mockito.times(1)).getLong(); Mockito.verify(utils,
	 * Mockito.times(1)).getString();
	 * Mockito.verify(utils,Mockito.times(1)).getDouble(); Mockito.verify(itemDAO,
	 * Mockito.times(1)).update(updated); }
	 */
	
	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(itemDAO.delete(ID)).thenReturn(1);

		assertEquals(1L, this.itemController.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(itemDAO, Mockito.times(1)).delete(ID);
	}
	

}
