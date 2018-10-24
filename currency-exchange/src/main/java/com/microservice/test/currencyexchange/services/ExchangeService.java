package com.microservice.test.currencyexchange.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.test.currencyexchange.entities.ExchangeEntity;
import com.microservice.test.currencyexchange.repositories.ExchangeRepository;

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
