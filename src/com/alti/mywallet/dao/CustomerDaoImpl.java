package com.alti.mywallet.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.alti.mywallet.bean.CustomerBean;

@Repository("customerDao")
public class CustomerDaoImpl extends AbstractDAO implements CustomerDAO{

	@Override
	public void createCustomer(CustomerBean bean) {
		persist(bean);	
	}

	@Override
	public void deleteCustomer(String byLogin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerBean> getCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerBean getCustomerByLogin(String byLogin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(CustomerBean bean) {
		// TODO Auto-generated method stub
		
	}

	
}
