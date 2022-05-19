package me.oliver;
import java.util.List;
import java.util.ArrayList;
// Java program to delete the first element of ArrayList
public class Task12Extra {

        public static void main(String[] args)
        {
            List<Integer> al = new ArrayList<>();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            al.add(50);

            // First element's index is always 0
            int index = 0;

            System.out.println("Standard ArrayList : " + al);

            // Delete first element by passing index
            al.remove(index);

            System.out.println("Modified ArrayList : " + al);
        }
    }

