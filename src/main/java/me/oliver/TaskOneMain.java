// Task One
package me.oliver;

import me.oliver.data.TaskOneData;

import java.util.Scanner;

public class TaskOneMain {

    public static void main(String[] args) {
        getInput();
    }


    public static void getInput() {
        Scanner sc = new Scanner(System.in);


         if(sc.hasNextBoolean()){
            System.out.println("bool");
             //boolean = true/false
        } else if(sc.hasNextShort()){
            System.out.print("short");
             //short numberMin = -32768 numberMax = 32767;
        } else if(sc.hasNextLong()){
            System.out.print("Long");
            //long has a minimum value of -263x10^63 and a maximum value of 263x10^63-1.
        } else if(sc.hasNextInt()){
            System.out.println("That is a integer");
            //integer is any number (if have long and short cannot get integer)
        } else if(sc.next().equalsIgnoreCase("findArray")) {
             for(String str : TaskOneData.array){
                 System.out.println(str);
                 // loops through all items in the array located in data file and prints each item on a separate line.
             }
        } else {
             System.out.println("String");
             // everything
         }



    }

}
