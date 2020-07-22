package com.TheK;

public class HealthyBurger extends Burger {

    private String extraHealthy1Name;
    private double extraHealthy1Price;

    private String extraHealthy2Name;
    private double extraHealthy2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");

    }

    public void addHealthAddition1Name(String name , double price){
        this.extraHealthy1Name = name;
        this.extraHealthy1Price = price;
    }

    public void addHealthAddition2Name(String name , double price){
        this.extraHealthy2Name = name;
        this.extraHealthy2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();

        if(extraHealthy1Name != null){
            burgerPrice += extraHealthy1Price;
            System.out.println("Added "+this.extraHealthy1Name+" for an extra "+this.extraHealthy1Price);
        }

        if(extraHealthy2Name != null){
            burgerPrice += extraHealthy2Price;
            System.out.println("Added "+this.extraHealthy2Name+" for an extra "+this.extraHealthy2Price);
        }

        return burgerPrice;
    }
}
