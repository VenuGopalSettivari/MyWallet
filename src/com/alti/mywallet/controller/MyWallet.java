package com.alti.mywallet.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alti.mywallet.bean.CardBean;

@RestController
@RequestMapping("card")
public class MyWallet {


	List list =null;
	CardBean card = null;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CardBean> getCardList(){
		System.out.println("Hellow getting list of cards");
		
		return list;
	}
	
	@RequestMapping(value = "/{number}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public CardBean getCardByNumber(@RequestParam String number){
		
		return card;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public void insertCard(@RequestBody CardBean cardBean){
		System.out.println("POST Card");
		System.out.println("card num-"+cardBean.getCardNumber());
		System.out.println("card bean- "+cardBean);
		
		
	}
	
	@RequestMapping(value = "/{number}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCard(@RequestParam String number){
		
	}
	
	@RequestMapping(value = "/{number}", method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateCard(CardBean cardBean){
		
	}

	
}
