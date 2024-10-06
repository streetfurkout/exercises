package com.pluralsight;

public class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int result;
        result = a + b;
        System.out.println(result);
        ;
    }


    public static void main1(String[] args) {
        float a = 3;
        float b = 5;
        float result;
        result= a-b;
        System.out.println(result);
    }

    public static void main2(String[] args) {
        int x = 5;
        int y;
        x++;
        ++x;
        y = ++x;

    }

    public static void main3(String[] args) {
        int count = 11;
        double unitPrice = 5.33;
        double taxRate = 0.18;
        double totalCost;

        totalCost = (count* unitPrice) + (unitPrice*taxRate);
        System.out.println(totalCost);
        }
    }


