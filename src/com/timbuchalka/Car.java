package com.timbuchalka;

public class Car {
    // characteristics of a car, the STATE of the car, fields

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porshe") || validModel.equals("holden")) {
            this.model = model;
        } else {
            this.model = "Unknown model";
        }
    }

    public String getModel() {
        return this.model;
    }
}
