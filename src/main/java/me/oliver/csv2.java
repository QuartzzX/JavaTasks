package me.oliver;
import java.io.*;
import java.util.Scanner;
public class csv2
{
    public static void main(String[] args) throws Exception
    {
//parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("/Users/o.r.long/Library/CloudStorage/OneDrive-SaintKentigern/2022 - Year 12/Computer Science/Programming/CSV files/humans.csv"));
        sc.useDelimiter(" , ");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner
    }
}
