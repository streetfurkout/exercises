package com.pluralsight;

public class cheaper {
    public static void main(String[] args) {
        double carPrice = 100.000;
        double truckPrice = 150.000;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest one is " + smallestPrice);
    }
}
