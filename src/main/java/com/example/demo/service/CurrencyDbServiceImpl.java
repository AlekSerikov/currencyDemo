package com.example.demo.service;

import com.example.demo.dao.CurrencyRepository;
import com.example.demo.entity.Currency;
import com.example.demo.handlers.exceptions.NoSuchCurrencyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyDbServiceImpl implements CurrencyDbService {

    @Autowired
    private CurrencyRepository currencyRepository;

    @Autowired
    CurrencyApiService currencyApiService;

    @Override
    public List<Currency> getAllCurrency() {
        return currencyRepository.findAll();
    }

    @Override
    public Currency getParticularCurrency(String name) {
        return currencyRepository.findByName(name)
                .orElseThrow(() -> new NoSuchCurrencyException("There is no currency with name: " + name));
    }

    @Override
    public List<Currency> updateCurrency() {
        return currencyRepository.saveAll(currencyApiService.getAllCurrency());
    }
}