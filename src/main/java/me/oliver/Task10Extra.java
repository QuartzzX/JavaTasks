package me.oliver;
import java.util.Arrays;
//  insert a new item before the second element in an existing array.
public class Task10Extra {

        public static void main(String[] args) {

            int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int Index_position = 1;
            int newValue    = 15;

            System.out.println("Original Array : "+Arrays.toString(my_array));

            for(int i=my_array.length-1; i > Index_position; i--){
                my_array[i] = my_array[i-1];
            }
            my_array[Index_position] = newValue;
            System.out.println("New Array: "+Arrays.toString(my_array));
        }
    }

