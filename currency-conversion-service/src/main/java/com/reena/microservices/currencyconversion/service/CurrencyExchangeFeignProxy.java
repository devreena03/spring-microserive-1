package com.reena.microservices.currencyconversion.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-exchange-service", url="localhost:8000")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateways-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeFeignProxy {
	
	//@GetMapping("/currency-exchange/{from}/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/{from}/{to}")
	public CurrencyExchangeBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
