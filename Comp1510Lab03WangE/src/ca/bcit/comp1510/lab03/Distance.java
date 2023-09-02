
package ca.bcit.comp1510.lab03;

import java.util.Scanner;
import java.text.DecimalFormat;

/** Calculates the distance between two points.
 * @author echo
 * @version 1.0
 */
public class Distance {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two values "
                + "for x and y coordinates of point 1 "
                + "(at one time, seperated by white space): ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Please enter two values "
                + "for x and y coordinates of point 2"
                + "(at one time, seperated by white space): ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) 
                + (y2 - y1) * (y2 - y1));
        System.out.println("The distance between point 1 and 2 is: "
                + distance);
        
        scan.close();
        
        //Refine by DecimalFormat
        DecimalFormat numformat = new DecimalFormat("#.##");
        String distanceFormatted = numformat.format(distance);
        System.out.println("The formatted value of distance "
                + "between point 1 and 2 is: " + distanceFormatted);
    }

}
