package com.example.microservice.currecyconversionservice.model;

import java.math.BigDecimal;

public class CurrecyConversion {

    private Long id;
    private String currencyFrom;
    private String currencyTo;
    private int quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculatedAmount;
    private String environment;


    public CurrecyConversion(Long id, String currencyFrom, String currencyTo, int quantity ,BigDecimal conversionMultiple, String environment, BigDecimal totalCalculatedAmount) {
        this.id = id;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.environment = environment;
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }
}
