package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double number1 = input.nextDouble();

        System.out.println("Enter your second number");
        double number2 = input.nextDouble();


        System.out.println("Let`s do some calculations! Please select one of this options: " + "\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide");

        char firstletter = Character.toUpperCase(input.next().charAt(0));

        if (firstletter == 'A') {
            double result = number1 + number1;
            System.out.println(number1 + "+" + number2 + "=" + result);

        } else if (firstletter == 'S') {
            double result = number1 - number2;
            System.out.println(number1 + "-" + number2 + "=" + result);

        } else if (firstletter == 'M') {
            double result = number1 * number2;
            System.out.println(number1 + "*" + number2 + "=" + result);

        } else if (firstletter == 'D') {
            if (number2 != 0) {
                double result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
            } else {
                System.out.println("Cannot divide by zero!");
            }

        }else{
                System.out.println("Invalid operation.");


                }
            }


        }


