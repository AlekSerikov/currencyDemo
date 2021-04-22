package com.example.demo.serviceNew;

import com.example.demo.entity.Currency;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyApiServiceImpl extends CurrencyServiceMainImpl implements CurrencyApiService{

    @Override
    public List<Currency> updateDatabaseFromApi() {
        return currencyRepository.saveAll(getAllCurrency());
    }
}
