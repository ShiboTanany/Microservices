package com.microservice.test.currencyvalue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.test.currencyvalue.entities.ExchangeEntity;
import com.microservice.test.currencyvalue.services.ExchangeService;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private ExchangeService exchangeService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ExchangeService getExchangeService() {
		return exchangeService;
	}



	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}



	public RestTemplate getRestTemplate() {
		return restTemplate;
	}



	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}



	@GetMapping("/from/{from}/to/{to}/{value}")
	public ExchangeEntity getcurrencyFactor(@PathVariable("from") String from ,@PathVariable("to") String to ,
			@PathVariable("value") double value) {
		ExchangeEntity entity = getExchangeService().getOneObject(from, to);
		ResponseEntity<ExchangeEntity> NewEntity = restTemplate.getForEntity("http://localhost:8082/from/"+from+"/to/"+to+"/"+value, ExchangeEntity.class);
		System.out.println(NewEntity.getBody());
		entity.setValue(NewEntity.getBody().getValue());
		entity.setTotal(value*entity.getFactor());
		return entity;
	}

}
