package com.microservice.test.currencyexchange.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.test.currencyexchange.entities.ExchangeEntity;
import com.microservice.test.currencyexchange.services.ExchangeService;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private ExchangeService exchangeService;
	
	
	
	public ExchangeService getExchangeService() {
		return exchangeService;
	}



	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}



	@GetMapping("/from/{from}/to/{to}/{value}")
	public ExchangeEntity getcurrencyFactor(@PathVariable("from") String from ,@PathVariable("to") String to ,
			@PathVariable("value") double value) {
		ExchangeEntity entity = getExchangeService().getOneObject(from, to);
		entity.setFactor(1);
		entity.setTotal(1);
		entity.setValue(1);
		return entity;
	}

}
