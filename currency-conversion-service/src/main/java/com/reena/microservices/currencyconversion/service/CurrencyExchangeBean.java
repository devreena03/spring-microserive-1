package com.reena.microservices.currencyconversion.service;

import java.math.BigDecimal;

public class CurrencyExchangeBean {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

//	public CurrencyExchangeBean() {
//
//	}
//
//	public CurrencyExchangeBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
//			BigDecimal totalCalculatedAmount, int port) {
//		super();
//		this.id = id;
//		this.from = from;
//		this.to = to;
//		this.conversionMultiple = conversionMultiple;
//
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

}
