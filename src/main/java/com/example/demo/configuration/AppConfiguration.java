package com.example.demo.configuration;

import com.example.demo.handlers.RestTemplateResponseErrorHandler;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {

//    @Value("${serviceImpl}")
//    private String currencyImplName;

    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.errorHandler(new RestTemplateResponseErrorHandler()).build(); //check response and request from server to currency api
    }                                                                                            // and handle error

//    @Bean
//    public CurrencyService serviceImplFactory() { //switching between services
//        try {
//            Map<String, Class> currencyServiceMap
//                    = Map.of("CurrencyServiceThirdSideImpl", CurrencyServiceThirdSideImpl.class,
//                    "CurrencyServiceDbImpl", CurrencyServiceDbImpl.class
//            );
//            return (CurrencyService) currencyServiceMap.get(currencyImplName).newInstance();
//        }catch (IllegalAccessException |InstantiationException e){
//            throw new InternalServerErrorException("Internal server error");
//        }
//    }

    @Bean
    public Jackson2ObjectMapperBuilder jacksonBuilder() { //snake to camelCase while object mapping
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return builder;
    }
}