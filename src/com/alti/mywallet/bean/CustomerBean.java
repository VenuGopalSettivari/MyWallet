package com.alti.mywallet.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class CustomerBean implements Serializable{

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerID;
	
	@Column(name = "CUSTOMER_LOGIN", nullable = false)
	private String customerLogIn;
	
	@Column(name = "CUSTOMER_PASSWORD", nullable = false)
	private String password;
	
	@Column(name = "FIRST_NAME", nullable = false)
	private String customerFirstName;
	
	@Column(name = "LAST_NAME", nullable = false)
	private String customerLastName;
	
	@Column(name = "EMAIL", nullable = false)
	private String emailAddress;
	
	
	
	
	public int getCustomerID() {
		return customerID;
	}
/*	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
*/	
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
		return "CustomerBean [customerID=" + customerID + ", customerLogIn=" + customerLogIn + ", password=" + password
				+ ", customerFirstName=" + customerFirstName + ", customerLastName=" + customerLastName
				+ ", emailAddress=" + emailAddress + "]";
	}
	
	
	
	
}
