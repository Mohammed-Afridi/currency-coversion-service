package com.microservices.currency_conversion_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange", url = "localhost:8000")
public interface CurrencyExchangeProxy {
    // I need to call currency exchange service,
    // hence copy its currency exchage Controller class URI and method definition

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrievExchangeValue(@PathVariable String from, @PathVariable String to);
}
