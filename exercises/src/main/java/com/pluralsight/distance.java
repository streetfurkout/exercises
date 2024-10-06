package com.pluralsight;

public class distance {
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println(distance);
    }
}
