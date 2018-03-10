package com.alti.mywallet.service;

import java.util.List;

import com.alti.mywallet.bean.CustomerBean;

public interface CustomerService {

	void createCustomer(CustomerBean bean);
	
	void deleteCustomer(String byLogin);
	
	List<CustomerBean> getCustomerList();
	
	CustomerBean getCustomerByLogin(String byLogin);
	
	void updateCustomer(CustomerBean bean);
}
