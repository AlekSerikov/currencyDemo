package com.example.demo.controller;

import com.example.demo.entity.Currency;
import com.example.demo.service.CurrencyService;
import com.example.demo.serviceNew.CurrencyApiService;
import com.example.demo.serviceNew.CurrencyDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/api")
@RestController
public class CurrencyController {

//    @Resource(name = "serviceImplFactory")
//    private CurrencyService currencyService;

    @Autowired
    private CurrencyApiService currencyApiService;

    @Autowired
    private CurrencyDbService currencyDbService;

    @GetMapping("/currency")
    public List<Currency> getCurrencies() {
        return currencyDbService.getAllCurrency();
    }

    @GetMapping("/currency/{name}")
    public Currency getCurrencyByName(@PathVariable String name) {
        return currencyDbService.getCurrencyByName(name);
    }

    @PutMapping("/currency")
    public List<Currency> updateCurrency (){
        return currencyApiService.updateDatabaseFromApi();
    }
}