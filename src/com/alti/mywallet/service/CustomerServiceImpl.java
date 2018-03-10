package com.alti.mywallet.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alti.mywallet.bean.CustomerBean;

@Service("employeeService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Override
	public void createCustomer(CustomerBean bean) {
		// TODO Auto-generated method stub
		
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
