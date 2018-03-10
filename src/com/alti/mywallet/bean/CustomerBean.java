package com.alti.mywallet.bean;

import java.io.Serializable;

public class CustomerBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String customerLogIn;
	private String password;
	private String customerFirstName;
	private String customerLastName;
	private String emailAddress;
	
	
	public String getCustomerLogIn() {
		return customerLogIn;
	}
	public void setCustomerLogIn(String customerLogIn) {
		this.customerLogIn = customerLogIn;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "CustomerBean [customerLogIn=" + customerLogIn + ", password=" + password + ", customerFirstName="
				+ customerFirstName + ", customerLastName=" + customerLastName + ", emailAddress=" + emailAddress + "]";
	}
	
	
	
}
