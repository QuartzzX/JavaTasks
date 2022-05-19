package me.oliver;
// find if there is a duplicated element
public class Task14Extra {

        public static void main(String[] args) {
            int[] numArray = {2, 6, 7, 6, 2, 19, 1, 19};
            for (int i = 0; i < numArray.length; i++) {
                for (int j = i + 1; j < numArray.length; j++) {
                    if (numArray[i] == numArray[j]) {
                        System.out.println("Duplicate element found " + numArray[j]);
                    }
                }
            }

        }
}
