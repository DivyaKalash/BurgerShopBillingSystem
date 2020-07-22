package com.TheK;

public class DeluxeBurger extends Burger{
    public DeluxeBurger() {
        super("Deluxe Burger","Sausage and Bacon",200.75,"white");
        super.addBurgerAddition1("Fries",56.87);
        super.addBurgerAddition2("Soft Drink", 65.00);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }
}
