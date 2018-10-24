package com.microservice.test.currencyexchange.entities;

public class ExchangeEntity {

	private Integer id;
	private String from;
	private String to;
	private double factor;
	private double value;
	private double total;
	
	public ExchangeEntity() {};
	
	public ExchangeEntity(Integer id, String from, String to, double factor) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
	
		this.factor = factor;
	};
	
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public double getFactor() {
		return factor;
	}
	public void setFactor(double factor) {
		this.factor = factor;
	}
	
	
}
