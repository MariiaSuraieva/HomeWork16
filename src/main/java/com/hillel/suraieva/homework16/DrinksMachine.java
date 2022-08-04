package com.hillel.suraieva.homework16;

public enum DrinksMachine {
    COFFEE(1.45),
    TEA(0.6),
    LIMONADE(2.1),
    MOHITO(3.5),
    MINERALWATER(1.2),
    COCACOLA(1.55);
    private double price;


    DrinksMachine(double price ) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
