package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Drives the program.
 * @author echo
 * @version 1.0
 */
public class Names {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        //prompt for and read user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first name:");
        String s1 = scan.next();
        System.out.println("Please enter the middle name:");
        String s2 = scan.next();
        System.out.println("Please enter the last name:");
        String s3 = scan.next();
        scan.close();
       
        //create a new object(name) of the Name Class
        Name name = new Name(s1, s2, s3);
        
        //convert each string to title case
        s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        s2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        s3 = s3.substring(0, 1).toUpperCase() + s3.substring(1);
        
        //use the mutators to make each string title case
        name.setFirstName(s1);
        name.setMiddleName(s2);
        name.setLastName(s3);
        
        //print the result
        System.out.println(name.toString());
    }
}
