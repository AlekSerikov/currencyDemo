package com.example.demo.serviceNew;

import com.example.demo.entity.Currency;
import com.example.demo.handlers.exceptions.NoSuchCurrencyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyDbServiceIml extends CurrencyServiceMainImpl implements CurrencyDbService{
    @Override
    public List<Currency> updateCurrency(List<Currency> currencies) {
        return currencyRepository.saveAll(currencies);
    }

    @Override
    public List<Currency> getAllCurrency() {
        return currencyRepository.findAll();
    }

    @Override
    public Currency getCurrencyByName(String name) {
        return currencyRepository.findByName(name)
                .orElseThrow(() -> new NoSuchCurrencyException("There is no currency with name " + name));
    }
}
