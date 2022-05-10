// Task Two
package me.oliver;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What operation would you like to use; Addition, Subtraction, Multiplication, Division, Powers, Floor-Division or Modulus?");

        String mathType = scan.next();

        if (mathType.equalsIgnoreCase("addition")) {
            System.out.println("Whats the first number you want to add?");

            float firstNumber = scan.nextFloat();

            System.out.println("Enter your second number");

            float secondNumber = scan.nextFloat();

            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));


        } else if (mathType.equalsIgnoreCase("subtraction")) {
            System.out.println("Whats the first number you want to subtract?");

            float firstNumber = scan.nextFloat();

            System.out.println("Enter your second number");

            float secondNumber = scan.nextFloat();

            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));

        } else if (mathType.equalsIgnoreCase("division")) {
            System.out.println("Whats the first number you want to divide?");

            float firstNumber = scan.nextFloat();

            System.out.println("Enter your second number");

            float secondNumber = scan.nextFloat();

            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        } else if (mathType.equalsIgnoreCase("multiplication")) {
            System.out.println("Whats the first number you want to multiply?");

            float firstNumber = scan.nextFloat();

            System.out.println("Enter your second number");

            float secondNumber = scan.nextFloat();

            System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
        } else if (mathType.equalsIgnoreCase("powers")) {
            System.out.println("Whats is your base number");

            float firstNumber = scan.nextFloat();

            System.out.println("Enter the exponent");

            float secondNumber = scan.nextFloat();

            System.out.println(firstNumber + "^" + secondNumber + " = " + (Math.pow(firstNumber, secondNumber)));

        } else if (mathType.equalsIgnoreCase("modulus")) {
            System.out.println("Please enter your first number");

            float firstNumber = scan.nextFloat();

            System.out.println("Enter your second number");

            float secondNumber = scan.nextFloat();

            System.out.println(firstNumber + " % " + secondNumber + " =");
            System.out.println("Whole Number Equation = " + (firstNumber - (firstNumber % secondNumber) + "/" + (firstNumber - (firstNumber % secondNumber)) / secondNumber));
            System.out.println("Remainder = " + (firstNumber % secondNumber));

        } else if (mathType.equalsIgnoreCase("floor-division")) {
            System.out.println("Please enter your first number");

            long firstNumber = scan.nextLong();

            System.out.println("Please enter your second number");

            long secondNumber = scan.nextLong();

            System.out.println(firstNumber + " / " + secondNumber + " Floor = " + (Math.floorDiv(firstNumber, secondNumber)));
        } else System.out.println("Please select from one of the options next time!");


    }

}

