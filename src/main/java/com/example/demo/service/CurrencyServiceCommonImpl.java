package com.example.demo.service;

import com.example.demo.entity.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceCommonImpl implements CurrencyServiceCommon {

    @Autowired
    private CurrencyDbService currencyDbService;

    @Override
    public List<Currency> getAllCurrency() {
        return currencyDbService.getAllCurrency();
    }

    @Override
    public Currency getCurrencyByName(String name) {
        return currencyDbService.getParticularCurrency(name);
    }

    @Override
    public List<Currency> updateCurrency() {
        return currencyDbService.updateCurrency();
    }
}
