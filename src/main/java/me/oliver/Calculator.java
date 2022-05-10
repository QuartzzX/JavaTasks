package me.oliver;

import java.util.Scanner;

    public class Calculator {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Would you like to Add, Subtract, Divide, or Multiply?");

            String mathType = scan.next();

            if (mathType.equalsIgnoreCase("add")) {
                System.out.println("Whats the first number you want to add?");

                int firstNumber = scan.nextInt();

                System.out.println(firstNumber + " + ");
                System.out.println("Enter your second number");

                int secondNumber = scan.nextInt();

                System.out.println(firstNumber + " + " + secondNumber + " =");
                System.out.println(firstNumber + secondNumber);

            } else if (mathType.equalsIgnoreCase("subtract")) {
                System.out.println("Whats the first number you want to subtract?");

                int firstNumber = scan.nextInt();

                System.out.println(firstNumber + " - ");
                System.out.println("Enter your second number");

                int secondNumber = scan.nextInt();

                System.out.println(firstNumber + " - " + secondNumber + " =");
                System.out.println(firstNumber - secondNumber);
            } else if (mathType.equalsIgnoreCase("divide")) {
                System.out.println("Whats the first number you want to divide?");

                int firstNumber = scan.nextInt();

                System.out.println(firstNumber + " % ");
                System.out.println("Enter your second number");

                int secondNumber = scan.nextInt();

                System.out.println(firstNumber + " % " + secondNumber + " =");
                System.out.println(firstNumber / secondNumber);
            } else if (mathType.equalsIgnoreCase("multiply")){
                System.out.println("Whats the first number you want to multiply?");

                int firstNumber = scan.nextInt();

                System.out.println(firstNumber + " x ");
                System.out.println("Enter your second number");

                int secondNumber = scan.nextInt();

                System.out.println(firstNumber + " x " + secondNumber + " =");
                System.out.println(firstNumber * secondNumber);
            }

        }

    }

