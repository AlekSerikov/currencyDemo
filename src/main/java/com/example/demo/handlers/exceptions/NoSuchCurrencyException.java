package com.example.demo.handlers.exceptions;

public class NoSuchCurrencyException extends RuntimeException{
    public NoSuchCurrencyException(String message) {
        super(message);
    }
}
