package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * The driver class of RandomWalker.
 * @author echo
 * @version 1.0
 */
public class TestWalker {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int ten = 10;
        final int five = 5;
        RandomWalker walker1 = new RandomWalker(ten, five);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the maximum steps:");
        int step = scan.nextInt();
        System.out.println("Please enter the boundary size:");
        int boundary = scan.nextInt();
        RandomWalker walker2 = new RandomWalker(step, boundary);
        System.out.println(walker1);
        System.out.println(walker2);
        for (int i = 0; i < five; i++) {
            walker1.takeStep();
            System.out.println("walker1 " + walker1);
            walker2.takeStep();
            System.out.println("walker2 " + walker2);
        }
        System.out.println("Maximum distance for walker1: " 
                + walker1.getMaxDistance());
        System.out.println("Maximum distance for walker2: "
                + walker2.getMaxDistance());

        
        final int twoHundred = 200;
        for (int i = 0; i < five; i++) {
            RandomWalker walker3 = new RandomWalker(twoHundred, ten);
            walker3.walk();
            System.out.println(walker3);
            System.out.println("Maximum distance for walker3: "
                    + walker3.getMaxDistance());
        }
       
        
        scan.close();
    }
    
}
