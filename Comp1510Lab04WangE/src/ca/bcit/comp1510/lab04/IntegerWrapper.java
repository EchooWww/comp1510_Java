package ca.bcit.comp1510.lab04;

import java.util.Scanner;


/**
 * IntegerWrapper: A program to show the wrapper class Integer.
 * @author echo
 * @version 1.0
 */
public class IntegerWrapper {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        //prompts for, read and autobox the input int to an Integer object
        System.out.println("Please enter an integer: ");
        Integer input = scan.nextInt();

        //convert and print the binary representation 
        String binaryInput = Integer.toBinaryString(input);
        System.out.println("The binary representation is: "
                + binaryInput);
        
        //convert and print the octal representation 
        String octalInput = Integer.toOctalString(input);
        System.out.println("The octal representation is: "
                + octalInput); 
        
        //convert and print the hexadecimal representation 
        String hexInput = Integer.toHexString(input);
        System.out.println("The hexadecimal representation is: "
                + hexInput); 
       
        //print the minimum and maximum possible Java integer with constants
        System.out.println("The minimum possible Java integer is: "
                + Integer.MIN_VALUE); 
        System.out.println("The minimum possible Java integer is: "
                + Integer.MAX_VALUE); 
        
        //ask for integers, convert strings to ints, add and print
        System.out.println("Please enter two integers, one per line: ");
        String string1 = scan.next();
        String string2 = scan.next();       
        scan.close();
        int num1 = Integer.parseInt(string1);
        int num2 = Integer.parseInt(string2);
        int sum = num1 + num2;
        System.out.println("The sum of these two integers is : "
                + sum); 
        
    }
}
