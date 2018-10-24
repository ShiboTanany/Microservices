package com.microservice.test.currencyvalue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.test.currencyvalue.entities.ExchangeEntity;
import com.microservice.test.currencyvalue.repositories.ExchangeRepository;

@Service
public class ExchangeService {

	@Autowired
	private ExchangeRepository exchangeRepository;

	public ExchangeRepository getExchangeRepository() {
		return exchangeRepository;
	}

	public void setExchangeRepository(ExchangeRepository exchangeRepository) {
		this.exchangeRepository = exchangeRepository;
	}

	public ExchangeEntity getOneObject(String from, String to) {

		return exchangeRepository.getExchangeEntity(from, to).get();

	}

}
