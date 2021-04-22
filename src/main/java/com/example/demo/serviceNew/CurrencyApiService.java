package com.example.demo.serviceNew;

import com.example.demo.entity.Currency;

import java.util.List;

public interface CurrencyApiService extends CurrencyServiceMain{

    List<Currency> updateDatabaseFromApi();
}
