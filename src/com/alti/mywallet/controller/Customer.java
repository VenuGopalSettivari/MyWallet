package com.alti.mywallet.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alti.mywallet.bean.CustomerBean;
import com.alti.mywallet.exception.CustomerNotCreated;
import com.alti.mywallet.service.CustomerService;



@RestController
@RequestMapping("customer")
@ContextConfiguration("classpath:/*.xml") 
public class Customer {

	List list =null;
	CustomerBean customer = null;
	@Autowired
    ApplicationContext context;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerBean> getCustomerList(){
		System.out.println("Hello getting list of customers");
		
		return list;
	}
	
	@RequestMapping(value = "/{customer_login}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerBean getCustomerByLogin(@RequestParam String customerLogin){
		
		return customer;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public void insertCustomer(@RequestBody CustomerBean customerBean){
		CustomerService service = (CustomerService) context.getBean("customerService");
		try{
			service.createCustomer(customerBean);
		}catch(Exception e){
			System.out.println("Error on customer creation");
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/{customer_login}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCustomer(@RequestParam String loginId){
		
	}
	
	@RequestMapping(value = "/{customer_login}", method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateCustomer(CustomerBean customer){
		
	}
	
}
