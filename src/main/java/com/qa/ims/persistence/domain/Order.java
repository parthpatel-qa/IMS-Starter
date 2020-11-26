package com.qa.ims.persistence.domain;

import java.sql.Date;
import java.util.List;


public class Order {
	

			private Long order_ID;
			private Long customer_ID;
			private Date date_placed;
			private double total = 0.00; 
			private List<OrderLine> orderLineList;
			
			
			public Order(Long order_id, Long customer_id, Date order_date, double total,
					List<OrderLine> orderLineList) {
				super();
				this.order_ID = order_id;
				this.customer_ID = customer_id;
				this.date_placed = order_date;
				this.total = total;
				this.orderLineList = orderLineList;
			}


			public Order(Long customer_id, Date order_date) {
				super();
				this.customer_ID = customer_id;
				this.date_placed = order_date;
			}


			public Order(Long order_ID, double total) {
				super();
				this.order_ID = order_ID;
				this.total = total;
			}

			
			// Getters and Setters
			public Long getOrder_ID() {
				return order_ID;
			}

			public void setOrder_ID(Long order_ID) {
				this.order_ID = order_ID;
			}

			public Long getCustomer_ID() {
				return customer_ID;
			}

			public void setCustomer_id(Long customer_ID) {
				this.customer_ID = customer_ID;
			}

			public Date getDate_Placed() {
				return date_placed;
			}

			public void setDate_Placed(Date date_Placed) {
				this.date_placed = date_Placed;
			}

			public double getTotal() {
				return total;
			}

			public void setTotal(double total) {
				this.total = total;
			}


			public List<OrderLine> getOrderLineList() {
				return orderLineList;
			}

			public void setOrderLineList(List<OrderLine> orderLineList) {
				this.orderLineList = orderLineList;
			}

		
			
			 
			@Override
			public String toString() {
				String expected =  "Order ID: " + order_ID + " Customer ID: " + customer_ID + " Total: "+ total+ " Date: " + date_placed;
				expected += "\n\t Items: " + "\n";
				expected += "\t---------------\n";
				for(OrderLine i : orderLineList) {
					expected += "\t" + i.toString() + "\n";
					
				}
				return expected;
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
				if (order_ID == null) {
					if (other.order_ID != null)
						return false;
				} else if (!(order_ID == other.order_ID))
					return false;
				if (customer_ID == null) {
					if (other.customer_ID != null)
						return false;
				} else if (!customer_ID.equals(other.customer_ID))
					return false;
				if (date_placed == null) {
					if (other.date_placed != null)
						return false;
				} else if (!(date_placed.equals(other.date_placed)))
					return false;
				if (total == 0) {
					if (other.total != 0)
						return false;
				} else if (!(total == other.total))
					return false;
				if (orderLineList == null) {
					if (other.orderLineList != null)
						return false;
				} else if (!(orderLineList.equals(other.orderLineList)))
					return false;
				return true;
			} 	
	
	
	

	
}
