package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Calculates the product of integers between 1 and n.
 * @author echo
 * @version 1.0
 */
public class Factorial {
    
    /**
     * Support method to validate user inputs.
     * @param scan for the scanner input
     * @return the valid value of input
     */
    public static int readInt(Scanner scan) {
        //to validate the input is an integer first
        while (!scan.hasNextInt()) {
            System.out.println("Invalid input, "
                    + "please enter a nonnegative integer:");
            scan.nextLine();
        }
        //to assign the integer to int num
        int num = scan.nextInt();
        //validete the next input is a nonnegative integer
        while (num < 0) {
            System.out.println("Nonnegative integer is required, "
                    + "please enter another number:");
            scan.nextLine();
            //validate the next input is an integer
            while (!scan.hasNextInt()) {
                System.out.println("Invalid input, "
                        + "please enter a nonnegative integer:");
                scan.nextLine();
            }
            //assign the finally nonnegative value of input to num
            num = scan.nextInt();
        }
        //return the valid input
        return num;
    }
    
    /** Drives the project.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a nonnegative integer:");
        //call the support method for a valid input to calculate the factorial
        int n = readInt(scan);
        //while loop to do the calculation.
        while (n >= 0) {
            int i;
            i = 1;
            int product = 1;
            while (i <= n) {
                product *= i;
                i++;
            }
            System.out.println("The factorial of the input is " + product);
            System.out.println("Please enter another nonnegative integer:");
            n = readInt(scan);
        }
        scan.close();    
    }
    
}
