package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/** Determines how many cans of paint needed to paint a room.
 * @author echo
 * @version 1.0
 */
public class Paint {
    /** declares a constant COVERAGE. */
    static final int COVERAGE = 400;
    
    /** Operates the calculation.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter the length of the room in feet: ");
        double length = myScanner.nextDouble();
        System.out.print("Please enter the width of the room in feet: ");
        double width = myScanner.nextDouble();
        System.out.print("Please enter the height of the room in feet: ");
        double height = myScanner.nextDouble();
        System.out.print("Please enter the number of coats to enter: ");
        int coats = myScanner.nextInt();
        // calculate the total area to be painted
        double surfaceArea = length * width + 2 * height * (length + width);
        double coverageNeeded = surfaceArea * coats;
        // calculate cans of paint needed
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;
        // round up to integer to decide how many cans to buy
        int cansToBuy = (int) Math.ceil(cansOfPaintNeeded);
        System.out.println("You will use " + cansOfPaintNeeded 
                + " cans of paint. You should buy " 
                + cansToBuy + " cans!");
        myScanner.close();
    }

}
