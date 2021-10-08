package com.company;

public class cars {
    private String name;
    private double price;
    private int maxSpeed;
    public cars(String name, double price, int maxSpeed){
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
