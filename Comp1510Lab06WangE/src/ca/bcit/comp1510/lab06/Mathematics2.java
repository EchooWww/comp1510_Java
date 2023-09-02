
package ca.bcit.comp1510.lab06;

import java.util.Random;

/** Mathematics2: for the JUnit tests.
 * @author echo
 * @version 1.0
 */
public class Mathematics2 {

    /**
     * The constant of ft to km ratio.
     */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;

    /**
     * A method to calculate the square number.
     * @param d for the input number.
     * @return the square of the input.
     */
    public double getSquareArea(double d) {
        return d * d;
    }
    
    /**
     * A method to calculate the sum.
     * @param d for the first input number.
     * @param e for the second input number.
     * @return the sum of the inputs.
     */
    public double add(double d, double e) {
        return d + e;
    }
    
    /**
     * A method to calculate the multiplication.
     * @param d for the first input number.
     * @param e for the second input number.
     * @return the product of the inputs.
     */
    public double multiply(double d, double e) {
        return d * e;
    }
    
    /**
     * A method to calculate the substraction.
     * @param d for the first input number.
     * @param e for the second input number.
     * @return the difference of the inputs.
     */
    public double subtract(double d, double e) {
        return d - e;
    }

    /**
     * A method to calculate the division.
     * @param i for the first input number.
     * @param j for the second input number.
     * @return the division of the inputs.
     */
    public double divide(int i, int j) {
        //first validate the devisor to be not zero
        if (j != 0) {
            return i / j;
        } else {
            return 0;
        }
    }
    
    /**
     * A method to return the absolute value.
     * @param i for the input number.
     * @return the absolute value of the input.
     */
    public int absoluteValue(int i) {
        if (i >= 0) {
            return i;
        } else {
            return -i;
        }
    }
    
    /**
     * A method to return a specified .
     * @return the a random value.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        Random rand = new Random();
        final int a = 11;
        final int b = 10;
        final int c = 15;
        //generate a random integer from 10 to 20
        int n = rand.nextInt(a) + b;
        //exclude 15 by a loop
        while (n == c) {
            n = rand.nextInt(a) + b;
        }
        return n;
    }
    
    /**
     * A method to convert feet to kilometres .
     * @param d the input feet value
     * @return the the corresponding km value.
     */
    public double convertFeetToKilometres(double d) {
        return d * FOOT_TO_KILOMETRE_RATIO;
    }
    
    /**
     * A method to calculate sum of products of numbers 
     * divisable by j from 0 to i.
     * @param i the divisor
     * @param j the limit
     * @return the sum of products.
     */
    
    public int sumOfProducts(int i, int j) {
        int sum = 0;
        //do the calculation under 2 conditions: i > 0 or i <= 0.
        if (i > 0) {
            int n = 1;
            while (n < i) {
                while (n < i && n % j != 0) {
                    n++; }
                sum += n; 
                n++;
            }
        } else {
            int n = -1;
            while (n > i) {
                while (n > i && n % j != 0) {
                    n--; }
                sum += n; 
                n--;
            }
        }
        return sum;
    }
}
