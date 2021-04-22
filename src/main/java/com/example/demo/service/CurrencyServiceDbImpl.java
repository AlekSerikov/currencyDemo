package com.example.demo.service;

import com.example.demo.dao.CurrencyRepository;
import com.example.demo.entity.Currency;
import com.example.demo.handlers.exceptions.InternalServerErrorException;
import com.example.demo.handlers.exceptions.NoSuchCurrencyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceDbImpl implements CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    @Override
    public List<Currency> getAllCurrency() {
        try {
            return currencyRepository.findAll();
        } catch (RuntimeException e) {
            throw new InternalServerErrorException("Internal server error");
        }
    }

    @Override
    public Currency getCurrencyByName(String name) {
        return currencyRepository.findByName(name)
                .orElseThrow(() -> new NoSuchCurrencyException("There is no currency with name " + name));
    }

    @Override
    public Currency updateCurrency(Currency currency) {
        return currencyRepository.save(currency);
    }

    @Override
    public List<Currency> updateAllCurrency(List<Currency> currencyList) {
        return currencyRepository.saveAll(currencyList);
    }
}