package com.alti.mywallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alti.mywallet.bean.CustomerBean;
import com.alti.mywallet.dao.CustomerDAO;
import com.alti.mywallet.exception.CustomerNotCreated;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDAO dao;
	
	@Override
	public void createCustomer(CustomerBean bean){
			try {
				dao.createCustomer(bean);
			} catch (CustomerNotCreated e) {
				System.out.println("Cutomer is not able to created");
				e.printStackTrace();
			}
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
