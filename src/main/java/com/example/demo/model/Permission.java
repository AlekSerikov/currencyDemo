package com.example.demo.model;

public enum Permission {
    GET_ALL_CURRENCY("currency:all"),
    GET_PARTICULAR_CURRENCY("currency:particular"),
    UPDATE_CURRENCY("currency:update");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}