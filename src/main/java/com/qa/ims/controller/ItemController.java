package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item>{

	public static final Logger LOGGER = LogManager.getLogger();

	private Utils utils;
	private ItemDAO itemDAO;
	

	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.setItemDAO(itemDAO);
		this.utils = utils;
	}

	@Override
	public List<Item> readAll() {
		List<Item> items = getItemDAO().readAll();
		for (Item customer : items) { 
			LOGGER.info(customer.toString());
		}
		return items;
	}

	@Override
	public Item create() {
		LOGGER.info("Please enter an item name");
		String name = utils.getString();
		LOGGER.info("Please enter a quantity");
		Long quantity = utils.getLong();
		LOGGER.info("Please enter a price");
		Double price = utils.getDouble();
		Item items = getItemDAO().create(new Item(name, quantity, price));
		LOGGER.info("Item created");
		return items;
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the name of the item");
		String name = utils.getString();
		LOGGER.info("Please enter the quantity of the stock");
		Long quantity = utils.getLong();
		LOGGER.info("Please enter the price of this item");
		Long price = utils.getLong();
		Item items = itemDAO.update(new Item(id, name, quantity, price));
		LOGGER.info("Item Updated");
		return items;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = utils.getLong();
		return itemDAO.delete(id);
	}


	public ItemDAO getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

}
