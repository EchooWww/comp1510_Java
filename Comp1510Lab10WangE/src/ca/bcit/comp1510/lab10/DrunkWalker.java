package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * The application simulating a drunk walker.
 * @author echo
 * @version 1.0
 */
public class DrunkWalker {
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {       
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the maximum steps:");
        int step = scan.nextInt();
        System.out.println("Please enter the boundary size:");
        int boundary = scan.nextInt();
        System.out.println("Please enter number of drunks to run:");
        int drunk = scan.nextInt();
        int fall = 0;
        for (int i = 0; i < drunk; i++) {
            RandomWalker drunkWalker = new RandomWalker(step, boundary);
            drunkWalker.walk();
            if (drunkWalker.getCurrentStep() < step) {
                fall++;
            }
        }
        System.out.println("The number of tests is " 
                + drunk);
        System.out.println("The number of falls is " + fall);
        scan.close();
    }
}
