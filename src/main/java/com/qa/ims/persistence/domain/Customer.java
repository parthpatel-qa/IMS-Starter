package com.qa.ims.persistence.domain;

public class Customer {

	//database fields as variables
	private Long customer_ID;
	private String customer_name;
	private String email;
	private String password;
	
	//constructors
	public Customer(String customer_name, String email, String password) {
		super();
		this.customer_name = customer_name;
		this.email = email;
		this.password = password;
	}
	public Customer(Long customer_ID, String customer_name, String email, String password) {
		super();
		this.customer_ID = customer_ID;
		this.customer_name = customer_name;
		this.email = email;
		this.password = password;
	}
	//getters and setters
	public Long getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(Long customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

	
	@Override
	public String toString() {
		return "Customer id: "+customer_ID + ", Name: "+ customer_name+", Email: "+email +", Password: "+ password;
}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer_ID == null) ? 0 : customer_ID.hashCode());
		result = prime * result + ((customer_name == null) ? 0 : customer_name.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Customer other = (Customer) obj;
		if (customer_ID == null) {
			if (other.customer_ID != null)
				return false;
		} else if (!customer_ID.equals(other.customer_ID))
			return false;
		if (customer_name == null) {
			if (other.customer_name != null)
				return false;
		} else if (!customer_name.equals(other.customer_name))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	

	
	

}
