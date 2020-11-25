package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.DBUtils;


public class OrderDAO implements Dao<Order>{
	
	public static final Logger LOGGER = LogManager.getLogger();
	ItemDAO itemDAO = new ItemDAO();

	@Override
	public List<Order> readAll() {
		try( Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("Select * FROM Orders");){
					List<Order> orders = new ArrayList<>();
					while (resultSet.next()) {
						orders.add(modelFromResultSet(resultSet));
					}
					return orders;
				} catch (SQLException e) {
					LOGGER.debug(e);
					LOGGER.error(e.getMessage());
				}
			return new ArrayList<>();
	}

	@Override
	public Order create(Order orders) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("INSERT INTO Orders(customer_ID, date_placed, total) values('" + orders.getCustomer_ID()
					+ "','" + orders.getDate() + "," +orders.getTotal() + "')");
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	public Order readOrders(Long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM Orders where order_ID = " + id);) {
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	
	@Override
	public Order update(Order orders) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
				statement.executeUpdate("update Orders set customer_ID ='" + orders.getCustomer_ID() + "', dateplaced ='"
					+ orders.getDate() +  "', total ='"
					+ orders.getTotal());
			return readOrders(orders.getOrder_id());
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public int delete(long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
			return statement.executeUpdate("delete from Orders where order_ID = " + id);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return 0;
	}

	@Override
	public Order modelFromResultSet(ResultSet resultSet) throws SQLException {
		Long oid = resultSet.getLong("order_ID");
		Long cid = resultSet.getLong("customer_ID");
		List<Item> items = readLines(resultSet.getLong("item_ID"));
		for(Item item: items) {
			item.setQuantity(1L);
		}
		Double total = resultSet.getDouble("total");
		String date = resultSet.getString("date");
	
	return new Order(oid, cid, items, total, date);
	}
	
	public List<Item> readLines(Long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM orderline where order_ID = " + id);) {
			List<Item> items = new ArrayList<Item>();
			while (resultSet.next()) {
				items.add(itemDAO.readItem(resultSet.getLong("item_ID")));
			}
			return items;
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	public Order readLatest() {
		try( Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM Orders ORDER BY order_ID DESC LIMIT 1");){
			resultSet.next();
			return modelFromResultSet(resultSet);
		}catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
		
	}
	
	public Order createOrderLine(long order_ID, long item_ID) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("INSERT INTO orderline(order_ID, item_ID) values(" + order_ID
					+ "," + item_ID+")");
			LOGGER.info("Item added to order "+ order_ID);
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return null;
	}




}
