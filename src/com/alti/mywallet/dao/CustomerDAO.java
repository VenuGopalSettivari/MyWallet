package com.alti.mywallet.dao;

import java.util.List;

import com.alti.mywallet.bean.CustomerBean;
import com.alti.mywallet.exception.CustomerNotCreated;

public interface CustomerDAO {


	void createCustomer(CustomerBean bean) throws CustomerNotCreated;
	
	void deleteCustomer(String byLogin);
	
	List<CustomerBean> getCustomerList();
	
	CustomerBean getCustomerByLogin(String byLogin);
	
	void updateCustomer(CustomerBean bean);
	
}
