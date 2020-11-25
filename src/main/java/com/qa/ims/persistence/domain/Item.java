package com.qa.ims.persistence.domain;

public class Item {

	private Long Item_id;
	private String item;
	private Long Quantity;
	private double Price;
	
	//constructors
	
	public Item(String item_name, Long quantity, double price) {
		super();
		item = item_name;
		Quantity = quantity;
		Price = price;
	}



	public Item(Long item_id, String item_name, Long quantity, double price) {
		super();
		Item_id = item_id;
		item = item_name;
		Quantity = quantity;
		Price = price;
	}


	//getter and setters
	
	public Long getItem_id() {
		return Item_id;
	}



	public void setItem_id(Long item_id) {
		Item_id = item_id;
	}



	public String getItem_name() {
		return item;
	}
 


	public void setItem_name(String item_name) {
		item = item_name;
	}



	public Long getQuantity() {
		return Quantity;
	}



	public void setQuantity(Long quantity) {
		Quantity = quantity;
	}



	public double getPrice() {
		return Price;
	}



	public void setPrice(double price) {
		Price = price;
	}
	
	
	@Override
	public String toString() {
		return "Item id: "+Item_id + ", Item: "+ item+", Price: "+Price +", Quantity: "+ Quantity;
}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Item_id == null) ? 0 : Item_id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Quantity == null) ? 0 : Quantity.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
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
		Item other = (Item) obj;
		if (Item_id == null) {
			if (other.Item_id != null)
				return false;
		} else if (!Item_id.equals(other.Item_id))
			return false;
		if (Double.doubleToLongBits(Price) != Double.doubleToLongBits(other.Price))
			return false;
		if (Quantity == null) {
			if (other.Quantity != null)
				return false;
		} else if (!Quantity.equals(other.Quantity))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		return true;
	}
	
}
