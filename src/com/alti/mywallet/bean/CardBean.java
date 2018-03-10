package com.alti.mywallet.bean;

import java.io.Serializable;

public class CardBean implements Serializable{

private static final long serialVersionUID = 1L;
	
	private String cardNumber;
	private String name;
	private String expDate;
	private String cvv;
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "CardBean [cardNumber=" + cardNumber + ", name=" + name + ", expDate=" + expDate + ", cvv=" + cvv + "]";
	}

	
	
}
