package com.qa.ims.persistence.domain;

public class OrderLine {
	
	private Long order_ID;
	private Long item_ID;
	private Long quantity;
	
	

 

	public OrderLine(Long order_ID, Long item_ID, Long quantity) {
		super();
		this.order_ID = order_ID;
		this.item_ID = item_ID;
		this.quantity = quantity;
	}

 
	public Long getOrder_ID() {
		return order_ID;
	}


	public void setOrder_ID(Long order_ID) {
		this.order_ID = order_ID;
	}


	public Long getItem_ID() {
		return item_ID;
	}


	public void setItem_ID(Long item_ID) {
		this.item_ID = item_ID;
	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "OrderLine [Order ID=" + order_ID + ", Item ID=" + item_ID + ", Quantity=" + quantity + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item_ID == null) ? 0 : item_ID.hashCode());
		result = prime * result + ((order_ID == null) ? 0 : order_ID.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
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
		OrderLine other = (OrderLine) obj;
		if (item_ID == null) {
			if (other.item_ID != null)
				return false;
		} else if (!item_ID.equals(other.item_ID))
			return false;
		if (order_ID == null) {
			if (other.order_ID != null)
				return false;
		} else if (!order_ID.equals(other.order_ID))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}


	
	
	

}
