package com.example.demo.service;

import com.example.demo.entity.Currency;

import java.util.List;

public interface CurrencyDbService {

    List<Currency> getAllCurrency();

    Currency getParticularCurrency(String name);

    List<Currency> updateCurrency();

}
