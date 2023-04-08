package com.example.microservice.currecyconversionservice.controller;

import com.example.microservice.currecyconversionservice.model.CurrecyConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{currencyFrom}/to/{currencyTo}/quantity/{quantity}")
    public CurrecyConversion calculateCurrencyConversion(@PathVariable String currencyFrom,
                                                         @PathVariable String currencyTo,
                                                         @PathVariable int quantity){

        return new CurrecyConversion(1L, currencyFrom.toUpperCase(), currencyTo.toUpperCase(), quantity, BigDecimal.valueOf(10.00),"s",BigDecimal.valueOf(50));

    }
}
