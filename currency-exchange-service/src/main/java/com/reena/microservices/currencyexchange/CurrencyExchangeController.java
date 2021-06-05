package com.reena.microservices.currencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.reena.microservices.currencyexchange.repo.ExchangeRepository;
import com.reena.microservices.currencyexchange.repo.ExchangeValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ExchangeRepository repo;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/{from}/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue value = repo.findByFromAndTo(from, to);
		logger.info("{}", value);
		value.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return value;
	}

}
