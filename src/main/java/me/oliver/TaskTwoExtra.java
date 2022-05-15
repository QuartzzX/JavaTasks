package me.oliver;
//Task Two Extra
//Write a Python program to append a new item to the end of the array.

import java.util.Arrays;

public class TaskTwoExtra {
    public static void main(String[] args) {
        int[] array = new int[] {3,6,9};
        System.out.println(Arrays.toString(array));
        array = Arrays.copyOf(array, array.length + 1); //create new array from old array and allocate one more element
        array[array.length - 1] = 12;
        System.out.println(Arrays.toString(array));
    }

}
