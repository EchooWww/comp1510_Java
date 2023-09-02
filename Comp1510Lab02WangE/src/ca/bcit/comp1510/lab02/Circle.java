package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/** 
 * Circle A program calculates some important values for a circle.
 * @author echo
 * @version 1.0
 */
public class Circle {
    /** 
     * declare a constant PI. 
     */
    static final double PI = 3.14159;
    /**
     * Drives the program.
     * @param args unused.
     */
    
    public static void main(String[] args) {
        double radius; 
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a radius value for the Circle");
        radius = myScanner.nextDouble();
        double circumference = 2 * PI * radius;
        System.out.println("The circumference of the Circle "
                + "is " + circumference);
        double area = PI * radius * radius;
        System.out.println("The area of the Circle is " + area);
        double doubleRadius = 2 * radius;
        double circumferenceDouble = 2 * PI * doubleRadius;
        double areaDouble = PI * doubleRadius * doubleRadius;
        double timesCircum = circumferenceDouble / circumference;
        double timesArea = areaDouble / area;
        System.out.println("When the radius doubles, "
                + "the area becomes " + timesArea + " times of original, "
                + "and the circumference becomes " 
                + timesCircum + " times of original.");
        myScanner.close();
    }

}
