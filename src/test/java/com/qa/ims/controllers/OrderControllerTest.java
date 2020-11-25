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

import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	
	@Mock
	private Utils utils;
	
	@Mock
	private OrderDAO dao;
	
	@Mock 
	private ItemDAO iDao;
	
	@InjectMocks
	private OrderController controller;
	
	@Test
	public void readAllTest() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1L, 1L, null, 45.00, null));
		
		Mockito.when(dao.readAll()).thenReturn(orders);
		
		assertEquals(orders, controller.readAll());
		
		Mockito.verify(dao, Mockito.times(1)).readAll();
	
	}
	
	@Test
	public void createTest() {
		Long id =1l;
		Double total = 25.00;
		String date = "1996-04-04";
		
		Order created = new Order(2L, id,  null, total, date);
		Order expected = new Order(3l, 1L, null, 25.00, "1996-04-04");
		
		Mockito.when(utils.getLong()).thenReturn(id);
		Mockito.when(utils.getDouble()).thenReturn(total);
		Mockito.when(utils.getString()).thenReturn(date);
		Mockito.when(dao.create(created)).thenReturn(expected);
		
		assertEquals(expected, controller.create());
		
	}
	
	@Test
	public void updateTest() {
		Long id =1l;
		Double total = 25.00;
		String date = "1996-04-04";
		
		Order toUpdate = new Order(2L, id, null, total, date);
		Order updated = new Order(2l, 1L, null, 25.00, "1996-04-04");
		
		Mockito.when(utils.getLong()).thenReturn(id);
		Mockito.when(utils.getDouble()).thenReturn(total);
		Mockito.when(utils.getString()).thenReturn(date);
		Mockito.when(dao.create(toUpdate)).thenReturn(updated);
		
		assertEquals(updated, controller.update());
	}
	
	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(dao.delete(ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(ID);
	}
	

}
