package com.example.microservice.currecyconversionservice.proxy;

import com.example.microservice.currecyconversionservice.model.CurrecyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "currency-exchange", url = "localhost:8000")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{currencyFrom}/to/{currencyTo}")
    CurrecyConversion calculateCurrencyConversion(@PathVariable String currencyFrom,
                                                         @PathVariable String currencyTo);

}
