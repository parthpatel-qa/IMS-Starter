package com.qa.ims.persistence.domain;

import java.util.List;


public class Order {

	private Long Order_id;
	private Long customer_ID;
	private List<Item> items;
	private Double Total;
	private String date;
	
	
	
	public Order(Long customer_ID, List<Item> items, Double total, String date) {
		super();
		this.customer_ID = customer_ID;
		this.items = items;
		Total = total;
		this.date = date;
	}


	public Order(Long order_id, Long customer_ID, List<Item> items, Double total, String date) {
		super();
		Order_id = order_id;
		this.customer_ID = customer_ID;
		this.items = items;
		Total = total;
		this.date = date;
	}

	
	public Long getCustomer_ID() {
		return customer_ID;
	}



	public void setCustomer_ID(Long customer_ID) {
		this.customer_ID = customer_ID;
	}
	
	
	


	public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}


	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public void setTotal(Double total) {
		Total = total;
	}



	public Order(double total) {
		super();
		Total = total;
	}



	public Order(Long order_id, double total) {
		super();
		Order_id = order_id;
		Total = total;
	}



	public Long getOrder_id() {
		return Order_id;
	}



	public void setOrder_id(Long order_id) {
		Order_id = order_id;
	}



	public double getTotal() {
		return Total;
	}



	public void setTotal(double total) {
		Total = total;
	}
	
	

	
	public String toString() {
		return "Order id: "+Order_id + ", Customer ID: "+ customer_ID+", Order place on: "+ date+", Total: "+ Total +", Date placed: "+date;
}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Order_id == null) ? 0 : Order_id.hashCode());
		result = prime * result + ((Total == null) ? 0 : Total.hashCode());
		result = prime * result + ((customer_ID == null) ? 0 : customer_ID.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (Order_id == null) {
			if (other.Order_id != null)
				return false;
		} else if (!Order_id.equals(other.Order_id))
			return false;
		if (Total == null) {
			if (other.Total != null)
				return false;
		} else if (!Total.equals(other.Total))
			return false;
		if (customer_ID == null) {
			if (other.customer_ID != null)
				return false;
		} else if (!customer_ID.equals(other.customer_ID))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}
	
	
}
