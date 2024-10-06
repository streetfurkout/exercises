package com.pluralsight;

import java.util.Scanner;

public class SandwichPriceCalculator {
    public static void main(String[] args) {

        //Welcome message
        System.out.println("Welcome to our shop, happy to see you!!");

        Scanner scanner = new Scanner(System.in);


        //Asking for options to the customer
        System.out.println("Do you want regular size or large size? " + "\n" + "r for Regular size and l for Large size.");
        String size = scanner.nextLine();

        //Price Calculating
        double basePrice;
        if (size.equalsIgnoreCase(size)) {
            basePrice = 5.45;

        } else if (size.equalsIgnoreCase(size)) {
            basePrice = 8.95;
            scanner.nextLine();

        } else {
            System.out.println("Invalid Size");
        }

        //Ask for customer`s age and if eligible do discount
        System.out.println("Please enter your age!");
        int age;
        if (age <= 17) {

        }
    }
}

