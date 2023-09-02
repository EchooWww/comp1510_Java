
package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * A program that simulates D&D dices.
 * @author echo
 * @version 1.0
 */
public class Dice {
    /** 
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int die4 = rand.nextInt(4) + 1;
        int die6 = rand.nextInt(6) + 1;
        int die8 = rand.nextInt(8) + 1;
        int die10 = rand.nextInt(10) + 1;
        int die12 = rand.nextInt(12) + 1;
        int die20 = rand.nextInt(20) + 1;
        
        //final output
        System.out.println("The result of the roll"
                + " for the 4-sided die is: " + die4
                + "\nThe result of the roll"
                + " for the 6-sided die is: " + die6
                + "\nThe result of the roll"
                + " for the 8-sided die is: " + die8
                + "\nThe result of the roll"
                + " for the 10-sided die is: " + die10
                + "\nThe result of the roll"
                + " for the 12-sided die is: " + die12
                + "\nThe result of the roll"
                + " for the 20-sided die is: " + die20
                + "\nThe total roll is :"
                + (die4 + die6 + die8 + die10 + die12 + die20));
     
    }
}
