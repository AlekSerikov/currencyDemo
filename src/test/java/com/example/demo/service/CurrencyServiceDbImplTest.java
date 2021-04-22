package com.example.demo.service;

import com.example.demo.entity.Currency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import java.util.List;

@SpringBootTest
public class CurrencyServiceDbImplTest {

    @Autowired
//    @Qualifier("currencyServiceDbImplTest")
    @Qualifier("currencyServiceThirdSideImpl")
    private CurrencyService currencyService;

    @Test
    public void getAllCurrencyDoesNotReturnsNullTest() {
        List<Currency> currencyList = currencyService.getAllCurrency();
        Assertions.assertNotNull(currencyList);
    }

    @Test
    public void getAllCurrencyDoesNotReturnsEmptyListTest() {
        List<Currency> currencyList = currencyService.getAllCurrency();
        Assertions.assertNotEquals(currencyList.size(), 0);
    }

    @Test
    public void getCurrencyByName() {

    }
}