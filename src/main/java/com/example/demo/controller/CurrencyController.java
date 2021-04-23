package com.example.demo.controller;

import com.example.demo.entity.Currency;
import com.example.demo.service.CurrencyServiceCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class CurrencyController {

    @Autowired
    private CurrencyServiceCommon currencyServiceCommon;

    @GetMapping("/currency")
    public List<Currency> getCurrencies() {
        return currencyServiceCommon.getAllCurrency();
    }

    @GetMapping("/currency/{name}")
    public Currency getCurrencyByName(@PathVariable String name) {
        return currencyServiceCommon.getCurrencyByName(name);
    }

    @PutMapping("/currency")
    public List<Currency> updateCurrency() {
        return currencyServiceCommon.updateCurrency();
    }
}