package com.qa.ims.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class CustomerController implements CrudController<Customer> {

	public static final Logger LOGGER = LogManager.getLogger();

	private CustomerDAO customerDAO;
	private Utils utils;

	public CustomerController(CustomerDAO customerDAO, Utils utils) {
		super();
		this.customerDAO = customerDAO;
		this.utils = utils;
	}

	@Override
	public List<Customer> readAll() {
		ArrayList<Customer> customers = (ArrayList<Customer>) customerDAO.readAll();
		for (Customer customer : customers) {
			LOGGER.info(customer.toString());
		}
		return customers;
		
	}

	@Override
	public Customer create() {
		LOGGER.info("Please enter a name");
		String customer_name = utils.getString();
		LOGGER.info("Please enter an email");
		String email = utils.getString();
		LOGGER.info("Please enter a changeable password for the new customer");
		String password = utils.getString();
		Customer customer = customerDAO.create(new Customer(customer_name, email, password));
		LOGGER.info("Customer created");
		return customer;
	}

	@Override
	public Customer update() {
		LOGGER.info("Please enter the id of the customer you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a new name");
		String customer_name = utils.getString();
		LOGGER.info("Please enter a new email");
		String email = utils.getString();
		LOGGER.info("Please enter a new password");
		String password = utils.getString();
		Customer customer = customerDAO.update(new Customer(id, customer_name, email, password));
		LOGGER.info("Customer Updated");
		return customer;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the customer you would like to delete");
		Long customer_id = utils.getLong();
		return customerDAO.delete(customer_id);
	}



}
