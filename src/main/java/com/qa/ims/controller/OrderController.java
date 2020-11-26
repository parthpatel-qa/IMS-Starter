package com.qa.ims.controller;
 
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderLine;
import com.qa.ims.utils.Utils;


public class OrderController implements CrudController<Order>{

	public static final Logger LOGGER = LogManager.getLogger();
	

	private OrderDAO orderDAO;
	private Utils utils;
	private CustomerDAO customerDAO;
	private ItemDAO itemDAO;
	
	
	public OrderController(OrderDAO orderDAO, Utils utils, CustomerDAO customerDAO, ItemDAO itemDAO) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
		this.customerDAO = customerDAO;
		this.setItemDAO(itemDAO);
	}

	@Override 
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order.toString());
		}
		return orders;
	}

	@Override
	public Order create() {
		LOGGER.info("Please enter the Customer ID");
		Long customerID = utils.getLong();
		LOGGER.info("Please enter the date(YYYY-MM-DD)");
		String str = utils.getString();
		Date date = Date.valueOf(str);
		Order order = orderDAO.create(new Order(customerID, date));
		LOGGER.info("Order created");
		return order;
}
 	
		
	

	@Override
	public Order update() {
		LOGGER.info("Please enter the Order id: ");
		Long id = utils.getLong();
		LOGGER.info("Please enter the new customer id: ");
		Long cust_id = utils.getLong();
		Order order = orderDAO.update(new Order(id, cust_id));
		return order;
	}
	

	@Override
	public int delete() {
		LOGGER.info("Please enter the Order id of the order you would like to delete");
		Long orderid = utils.getLong();
		return orderDAO.delete(orderid);
	}

	public ItemDAO getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

}
