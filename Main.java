package com.TheK;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("Basic","Sausage",123.87,"white");
        burger.addBurgerAddition1("Cheese",30.65);
        burger.addBurgerAddition2("Lettuce", 24.87);
        System.out.println("Amount to be paid for " +burger.getName()+ " is "+String.format("%.2f",burger.itemizeBurger())+"\n");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",198.76);
        healthyBurger.addHealthAddition1Name("egg", 23.98);
        healthyBurger.addHealthAddition2Name("Lentils",17.54);
        System.out.println("Amount to be paid for " +healthyBurger.getName()+ " is "+String.format("%.2f",healthyBurger.itemizeBurger())+"\n");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addBurgerAddition3("Should not do this ",87.98);
        System.out.println("Amount to be paid for " +deluxeBurger.getName()+ " is "+String.format("%.2f",deluxeBurger.itemizeBurger()));
    }
}
