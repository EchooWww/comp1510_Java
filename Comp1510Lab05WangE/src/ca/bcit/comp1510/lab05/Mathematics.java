package ca.bcit.comp1510.lab05;

/**
 * Mathematics: to perform calculations.
 * @author Echo Wang - Set 1C
 * @version 1.0
 */
public class Mathematics {
    /**
     * The constant PI.
     */
    public static final double PI = Math.PI;

    /**
     * Calculate the surface area with the ridus.
     * @param d the radius
     * @return circleArea the area
     */
    public double getCircleArea(double d) {
        double circleArea = PI * d * d;
        return circleArea;
    }
    
    /**
     * Calculate the sum of number from 0 to i.
     * @param i the maximum number
     * @return the sum
     */
    public int sumOfInts(int i) {
        int sumOfInts = 0;
        for (int j = 0; j <= i; j++) {
            sumOfInts += j;
        }

        return sumOfInts;
    }

    /**
     * Tell whether i is positive.
     * @param i the input
     * @return whether it's positive
     */
    public boolean isPositive(int i) {
        boolean isPositive = i > 0;
        return isPositive;
    }
    
    /**
     * Tell whether i is even.
     * @param i the input
     * @return whether it's even 
     */
    public boolean isEven(int i) {
        boolean isEven = i % 2 == 0;
        return isEven;
    }
    
    /**
     * Calculate the sum of evens from 0 to i.
     * @param i the maximum number
     * @return sum of evens
     */
    public int sumOfEvens(int i) {
        int sumOfEvens = 0;
        if (i > 0) {
            for (int j = 0; j % 2 == 0 && j <= i; j += 2) {
                sumOfEvens += j; 
            }
             
        } else {
            for (int j = 0; j % 2 == 0 && j >= i; j -= 2) {
                sumOfEvens += j;
            }
        }
        return sumOfEvens;
    }
}
