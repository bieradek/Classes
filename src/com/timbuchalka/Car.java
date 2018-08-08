package com.timbuchalka;

public class Car {
    // characteristics of a car, the STATE of the car, fields

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
