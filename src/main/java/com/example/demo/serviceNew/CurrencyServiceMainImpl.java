package com.example.demo.serviceNew;

import com.example.demo.dao.CurrencyRepository;
import com.example.demo.entity.Currency;
import com.example.demo.entity.CurrencyInfo;
import com.example.demo.handlers.exceptions.InternalServerErrorException;
import com.example.demo.handlers.exceptions.NoSuchCurrencyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CurrencyServiceMainImpl implements CurrencyServiceMain{

    @Autowired
    private RestTemplate restTemplate;

    @Value("${exchangeRateURL}")
    private String exchangeRateURL;

    @Autowired
    protected CurrencyRepository currencyRepository;

    @Override
    public List<Currency> getAllCurrency() {
        return getCurrencyRatesFromUrl(exchangeRateURL).entrySet().stream()
                .map(entry -> new Currency(entry.getKey(), 1 / entry.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public Currency getCurrencyByName(String name) {
        return getAllCurrency().stream()
                .filter(currency -> currency.getName().equalsIgnoreCase(name))
                .findAny()
                .orElseThrow(() -> new NoSuchCurrencyException("There is no currency with name " + name));
    }

    private Map<String, Double> getCurrencyRatesFromUrl(String URL) {
        ResponseEntity<CurrencyInfo> currencyInfoResponseEntity
                = restTemplate.getForEntity(exchangeRateURL, CurrencyInfo.class);
        Map<String, Double> currencyRates = currencyInfoResponseEntity.getBody().getConversionRates();

        if (currencyRates != null) {
            return currencyRates;
        } else {
            throw new InternalServerErrorException("Internal server error");
        }
    }
}