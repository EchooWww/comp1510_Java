package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * FunWithStrings: explores some useful methods in the string class.
 * @author echo
 * @version 1.0
 */
public class FunWithStrings {
    /**
     * Drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String favBook;
        System.out.println("Please enter the title of your favorite book:");
        
        // the nextLine() method returns the whole line of the input. 
        // the next() method only returns content before first blank space
        favBook = scan.nextLine();
        System.out.println(favBook);
        
        //print the length of the input
        System.out.println("The length of your favorite book's title is " 
                + favBook.length());
       
        // if the input starts with "the" or "The" or "THE", this should be true
        System.out.println("Q: Is it true that the title starts with \"The\"?"
                + " A: " + (favBook.toUpperCase()).startsWith("THE"));        
        // Strings are immutable in Java, which means 
        // we cannot change the value of the string object after creating it.
        favBook.toUpperCase();
        System.out.println(favBook);
        String upper = favBook.toUpperCase();
        System.out.println(upper);
        
        //Print in upper and lower case 
        System.out.println("The title in upper case is " + upper);
        System.out.println("The title in lower case is " 
                + favBook.toLowerCase());
        
        //Test the function trim()
        String trimmedUserInput = favBook.trim();
        System.out.println("The length after removing "
                + "leading/trailing whitespace is " 
                + trimmedUserInput.length());
        
        //Final output
        String trimmedUpper = trimmedUserInput.toUpperCase();
        String trimmedLower = trimmedUserInput.toLowerCase();
        int trimmedLength = trimmedUserInput.length();
        String first = trimmedUpper.substring(0, 1);
        String mid = trimmedLower.substring(1, trimmedLength - 1);
        String last = trimmedUpper.substring(trimmedLength - 1, trimmedLength);
        System.out.println(first + mid + last);
        
        scan.close();
    }
}
