package com.example.demo.serviceNew;

import com.example.demo.entity.Currency;

import java.util.List;

public interface CurrencyDbService extends CurrencyServiceMain{

    List<Currency> updateCurrency(List<Currency> currencies);
}
