package com.pluralsight;

import java.util.*;

import static java.lang.String.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");
        System.out.print("Enter first number: ");
        double num1 = myScanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.print("Select Your Operator: ");
        System.out.print("(A) Add ");
        System.out.print("(S) Subtract ");
        System.out.print("(M) Multiply ");
        System.out.println("(D) Divide ");
        String operator = myScanner.nextLine();

            if (operator.contentEquals("A")) {
                double sum = num1 + num2;
                System.out.println("Answer: " + sum);
            } else if (operator.contentEquals("a")) {
                double sum = num1 + num2;
                System.out.println("Answer: " + sum);
            } else if (operator.contentEquals("S")) {
                double sub = num1 - num2;
                System.out.println("Results: " + sub);
            } else if (operator.contentEquals("s")) {
                double sub = num1 - num2;
                System.out.println("Results: " + sub);
            } else if (operator.contentEquals("M")) {
                double mult = num1 * num2;
                System.out.println("Results: " + mult);
            } else if (operator.contentEquals("m")) {
                double mult = num1 * num2;
                System.out.println("Results: " + mult);
            } else if (operator.contentEquals("D")) {
                double divi = num1 / num2;
                System.out.println("Results: " + divi);
            } else if (operator.contentEquals("d")) {
                double divi = num1 / num2;
                System.out.println("Results: " + divi);
            }

        }
        }