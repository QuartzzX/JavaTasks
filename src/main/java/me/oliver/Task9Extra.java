package me.oliver;
// add the contents of an array to another array
public class Task9Extra {

        public static void main(String[] args) {
            //Initialize array
            int [] arr1 = new int [] {1, 2, 3, 4, 5};
            //Create another array arr2 with size of arr1
            int[] arr2 = new int[arr1.length];
            //Copying all elements of one array into another
            System.arraycopy(arr1, 0, arr2, 0, arr1.length);
            //Displaying elements of array arr1
            System.out.println("Elements of original array: ");
            for (int j : arr1) {
                System.out.print(j + " ");
            }

            System.out.println();

            //Displaying elements of array arr2
            System.out.println("Elements of new array: ");
            for (int j : arr2) {
                System.out.print(j + " ");
            }
        }
    }

