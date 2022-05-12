package me.oliver;
// Task One Extra
// Print a five int array and then print just the first 3 digits.
public class TaskOneExtra {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};

        for (int element : array) {
            System.out.println(element);

        } //end for loop
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
