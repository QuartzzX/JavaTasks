package me.oliver;
// get the number of occurrences of a specified element in an array
// Java program to count occurrences
// of an element

    public class Task6Extra {
        // Returns number of times x occurs in arr[0..n-1]
        static int countOccurrences(int[] arr, int n, int x) {
            int res = 0;
            for (int i = 0; i < n; i++)
                if (x == arr[i])
                    res++;
            return res;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8, 5, 4, 3, 4, 5, 6, 7, 8, 9, 1, 2, 14, 5, 3,};
            int n = arr.length;
            int x = 3;
            System.out.println("Number "+ x + " is shown " + countOccurrences(arr, n, x)+" time/s");
        }
    }




