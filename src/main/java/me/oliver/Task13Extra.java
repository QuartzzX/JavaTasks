package me.oliver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// convert array to list
public class Task13Extra {

    // Java Program to convert
// Array to List


        // Generic function to convert an Array to List
        public static <T> List<T> convertArrayToList(T[] array)
        {

            // Create an empty List

            // Iterate through the array
            // Add each element into the list

            // Return the converted List
            return new ArrayList<>(Arrays.asList(array));
        }

        public static void main(String[] args)
        {
            // Create an Array
            String[] array
                    = { "Item1", "Item2", "Digital1" };

            // Print the Array
            System.out.println("Array: "
                    + Arrays.toString(array));

            // convert the Array to List
            List<String> list = convertArrayToList(array);

            // Print the List
            System.out.println("List: " + list);
        }
    }

