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
            return;
        }

        //Ask for quantity
        System.out.println("How many sandwich you would like to take?");
        double qt = scanner.nextDouble();

        //Ask for customer`s age and if eligible do discount
        System.out.println("Please enter your age!");
        int age = scanner.nextInt();

        double discountPercentage = 0;
        if (age <= 17) {
            discountPercentage = 0.1;

        } else if (age >= 65) {
            discountPercentage = 0.2;
        }

        //total payment

        double payment = (basePrice * (1 - discountPercentage)) * qt;

        //display payment
        System.out.println("Your total due is: " + payment);
    }

}
