package com.pluralsight;

public class checkForFactor {
    public static boolean kata(int base, int factor) {
        // Check if factor is a factor of base
        return base % factor == 0;
    }

    public static void main(String[] args) {
        System.out.println(kata(10, 2));
        System.out.println(kata(10, 3)); // false
        System.out.println(kata(25, 5));
        System.out.println(kata(7, 2));  // false
    }
}


