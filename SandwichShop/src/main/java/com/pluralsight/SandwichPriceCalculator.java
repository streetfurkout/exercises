package com.pluralsight;

import java.util.Scanner;

public class SandwichPriceCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome to our shop, happy to see you!!");

        double regularBasePrice = 5.45;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want regular size or large size?");
        String size = scanner.nextLine();

        System.out.println(size.equalsIgnoreCase(size));


    }
}
