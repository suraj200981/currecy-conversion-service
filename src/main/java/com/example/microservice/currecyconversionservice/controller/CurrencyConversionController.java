package com.example.microservice.currecyconversionservice.controller;

import com.example.microservice.currecyconversionservice.model.CurrecyConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{currencyFrom}/to/{currencyTo}/quantity/{quantity}")
    public CurrecyConversion calculateCurrencyConversion(@PathVariable String currencyFrom,
                                                         @PathVariable String currencyTo,
                                                         @PathVariable int quantity){


        HashMap<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from",currencyFrom);
        uriVariables.put("to",currencyTo);

        ResponseEntity<CurrecyConversion> responseEntity= new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                CurrecyConversion.class,
                uriVariables);

        CurrecyConversion currecyConversion= responseEntity.getBody();
        return new CurrecyConversion(currecyConversion.getId(), currencyFrom.toUpperCase(), currencyTo.toUpperCase(), quantity, currecyConversion.getConversionMultiple(),currecyConversion.getEnvironment(),BigDecimal.valueOf(50));

    }
}
