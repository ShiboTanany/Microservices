package com.microservice.test.currencyexchange.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.microservice.test.currencyexchange.entities.ExchangeEntity;
@Repository
public class ExchangeRepository {
	private static List<ExchangeEntity> list = new ArrayList<>();

	static {

		list.add(new ExchangeEntity(new Integer(1), "USD", "EGP", 18));
		list.add(new ExchangeEntity(new Integer(1), "EUR", "EGP", 21));
	}

	public Optional<ExchangeEntity> getExchangeEntity(String from, String to) {
		Optional<ExchangeEntity> object = list.stream()
				.filter(entity -> entity.getFrom().equals(from) && entity.getTo().equals(to)).findFirst();
		return object;
	}

}
