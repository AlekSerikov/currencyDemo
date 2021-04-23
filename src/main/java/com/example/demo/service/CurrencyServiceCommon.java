package com.example.demo.service;

import com.example.demo.entity.Currency;

import java.util.List;

public interface CurrencyServiceCommon {

    List<Currency> getAllCurrency();

    Currency getCurrencyByName(String name);

    List<Currency> updateCurrency();

}