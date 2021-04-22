package com.example.demo.entity;

import java.util.Map;

public class CurrencyInfo {

    Map<String, Double> conversionRates;

    public CurrencyInfo() {
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }
}
