package me.oliver;

import java.util.Scanner;

public class Caesar {

    public static void main(String[] args){
        System.out.print("Caesar Cipher Number: ");
        Scanner input = new Scanner(System.in);
        int cipherNumber = input.nextInt(); //takes user input
        System.out.println(replaceAlpha(cipherNumber)); //runs replaceAlpha which does the cipher work

    }

    public static String normalizeText(){
        /* Remove spaces and non-letters from text */
        System.out.print("Enter text to cipher: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine(); //takes user input
        String inputUpper = userInput.toUpperCase(); //converts input to UPPER case
        String removeSpaces = inputUpper.replaceAll("\\s+",""); //removes any spaces
        return(removeSpaces.replaceAll("[^a-zA-Z]",""));
    }


    public static String replaceAlpha(int cipher_shift){
        String textToUse = normalizeText(); //runs normalizeText to take text input
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder newString = new StringBuilder();
        int lengthOfText = textToUse.length();
        for(int i=0;i<lengthOfText;i++){
            char replacedLetters = letters.charAt(i+cipher_shift);
            newString.append(replacedLetters);
        }
        return(newString.toString());
    }

}