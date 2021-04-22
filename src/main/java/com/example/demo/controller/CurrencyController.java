package com.example.demo.controller;

import com.example.demo.entity.Currency;
import com.example.demo.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/api")
@RestController
public class CurrencyController {

    @Resource(name = "serviceImplFactory")
    private CurrencyService currencyService;


    @GetMapping("/currency")
    public List<Currency> getCurrencies() {
        return currencyService.getAllCurrency();
    }

    @GetMapping("/currency/{name}")
    public Currency getCurrencyByName(@PathVariable String name) {
        return currencyService.getCurrencyByName(name);
    }

    @PutMapping("/currency")
    public Currency updateCurrency (@RequestBody Currency currency){

        return null;
    }
}