package com.hillel.suraieva.homework16;

import java.util.Scanner;

import static com.hillel.suraieva.homework16.DrinksMachine.*;

public class Main {
    public static void main(String[] args) {
        sell();
        System.out.println("You ordered " + Order.count + " drinks");


    }

    private static void sell() {
        boolean stop = false;
        double sum = 0;


        do { System.out.println("0 - coffee" + '\n' + "1 - tea" + '\n' + "2 - limonade"
                + '\n' + "3 - mohito" + '\n' + "4 - mineral water" + '\n' + "5 - coca-cola");
            System.out.println("Please, press button from 0 till 5 or # to finish");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                double cost = prepareDrink(number);
                sum += cost;
                System.out.println("your order costs " + sum + " Euro");
                new Order();
                System.out.println("Something else?");
            } else if (scanner.next().equals("#")) {
                System.out.println("Thank you for using, Don't forget your drinks, your total is "+ sum + " Euro");
                stop = true;
            }


        } while (stop == false);
    }


    static double prepareDrink(int number) {

        double values = 0;
        for (DrinksMachine value : values()) {
            if (value.ordinal() == number)
            {System.out.println("your " + value + " prepared");
            values = DrinksMachine.valueOf(String.valueOf(value)).getPrice();}
        }
        return values;


    }
}