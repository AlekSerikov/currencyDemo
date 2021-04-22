package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "currencies")
public class Currency {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private double value;

    public Currency() {
    }

    public Currency(double value) {
        this.value = value;
    }

    public Currency(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}