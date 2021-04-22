package com.example.demo.handlers;

public class ErrorMessage {

    private String errorInfo;

    public ErrorMessage() {
    }

    public ErrorMessage(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
}