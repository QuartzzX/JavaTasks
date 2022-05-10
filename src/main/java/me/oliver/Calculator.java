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

            int firstNumber = scan.nextInt();

            System.out.println("Enter your second number");

            int secondNumber = scan.nextInt();

            System.out.println(firstNumber + " + " + secondNumber + " =");
            System.out.println(firstNumber + secondNumber);

        }
        else if (mathType.equalsIgnoreCase("subtraction")) {
            System.out.println("Whats the first number you want to subtract?");

            int firstNumber = scan.nextInt();

            System.out.println("Enter your second number");

            int secondNumber = scan.nextInt();

            System.out.println(firstNumber + " - " + secondNumber + " =");
            System.out.println(firstNumber - secondNumber);
        }
        else if (mathType.equalsIgnoreCase("division")) {
            System.out.println("Whats the first number you want to divide?");

            int firstNumber = scan.nextInt();

            System.out.println("Enter your second number");

            int secondNumber = scan.nextInt();

            System.out.println(firstNumber + " / " + secondNumber + " =");
            System.out.println(firstNumber / secondNumber);
        }
        else if (mathType.equalsIgnoreCase("multiplication")) {
            System.out.println("Whats the first number you want to multiply?");

            int firstNumber = scan.nextInt();

            System.out.println("Enter your second number");

            int secondNumber = scan.nextInt();

            System.out.println(firstNumber + " x " + secondNumber + " =");
            System.out.println(firstNumber * secondNumber);
        }
        else if (mathType.equalsIgnoreCase("powers")) {
            System.out.println("Whats is your base number");

           int firstNumber = scan.nextInt();

           System.out.println("Enter the exponent");

           int secondNumber = scan.nextInt();

            System.out.println(firstNumber + "^" + secondNumber + " =");
            System.out.println(Math.pow(firstNumber, secondNumber));


        }
        else if (mathType.equalsIgnoreCase("modulus")) {
            System.out.println("Please enter your first number");

            int firstNumber = scan.nextInt();

            System.out.println("Enter your second number");

            int secondNumber = scan.nextInt();

            System.out.println(firstNumber + " % " + secondNumber + " =");
            System.out.println("Whole Number Equation = " + (firstNumber - (firstNumber % secondNumber) + "/" + (firstNumber - (firstNumber % secondNumber)) / secondNumber ));
            System.out.println("Remainder = " + (firstNumber % secondNumber));

        }
        else if (mathType.equalsIgnoreCase("floor-division")){
            System.out.println("Please enter your first number");

            int firstNumber = scan.nextInt();

            System.out.println("Please enter your second number");

            int secondNumber = scan.nextInt();

            System.out.println(firstNumber + " / " + secondNumber + " Floor =");
            System.out.println(Math.floorDiv(firstNumber, secondNumber));
        }

    }

}

