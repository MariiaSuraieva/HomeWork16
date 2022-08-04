package com.hillel.suraieva.homework16;

public class Drinks {
    private static double price;
    private static final Drinks COFFEE = new Drinks(1.45);
    private static final Drinks TEA = new Drinks(0.6);
    private static final Drinks LIMONADE = new Drinks(2.1);
    private static final Drinks MOHITO = new Drinks(3.5);
    private static final Drinks MINERALWATER = new Drinks(1.2);
    private static final Drinks COCACOLA = new Drinks(1.55);

    private Drinks(double price) {
        this.price = price;
    }

    public static double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.valueOf(price);

    }
}
