package com.reena.microservices.currencyconversion.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyExchangeClient {
	
	public CurrencyExchangeBean extracted(String from, String to) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

		ResponseEntity<CurrencyExchangeBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/{from}/{to}", CurrencyExchangeBean.class,
				uriVariables);

		return responseEntity.getBody();
	}

}
