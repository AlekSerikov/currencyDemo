package com.example.demo.serviceNew;

import com.example.demo.entity.Currency;

import java.util.List;

public interface CurrencyServiceMain {

    List<Currency> getAllCurrency();

    Currency getCurrencyByName(String name);

}