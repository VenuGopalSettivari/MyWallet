package com.alti.mywallet.controller;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alti.mywallet.bean.CustomerBean;


@RestController
@RequestMapping("customer")
public class Customer {

	List list =null;
	CustomerBean customer = null;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerBean> getCustomerList(){
		System.out.println("Hellow getting list of customers");
		
		return list;
	}
	
	@RequestMapping(value = "/{customer_login}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerBean getCustomerByLogin(@RequestParam String customerLogin){
		
		return customer;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public void insertCustomer(@RequestBody CustomerBean customerBean){
		System.out.println("POST CUSTOMER");
		System.out.println("ok00111-"+customerBean.getCustomerFirstName());
		System.out.println("ok001112-"+customerBean);
		
		
	}
	
	@RequestMapping(value = "/{customer_login}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCustomer(@RequestParam String loginId){
		
	}
	
	@RequestMapping(value = "/{customer_login}", method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateCustomer(CustomerBean customer){
		
	}
	
}
