package ca.bcit.comp1510.lab05;

import java.util.Scanner;
import java.text.DecimalFormat;


/** 
 * GeometryDriver: interact with users to create some shapes.
 * @author Echo Wang - Set 1C
 * @version 1.0
 */
public class GeometryDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {              
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");

        //ask for, read user input and create an Sphere object with it
        System.out.print("Please enter the X-coordinate of sphere center: ");
        double xSphere = scan.nextDouble();
        System.out.print("Please enter the Y-coordinate of sphere center: ");
        double ySphere = scan.nextDouble();
        System.out.print("Please enter the Z-coordinate of sphere center: ");
        double zSphere = scan.nextDouble();
        System.out.print("Please enter the radius of the sphere: ");
        double rSphere = scan.nextDouble();
        Sphere sphere1 = new Sphere(xSphere, ySphere, zSphere, rSphere);
        System.out.println("Surface area is " + df.format(sphere1.calArea()) 
            + ", and volume is " + df.format(sphere1.calVolume()) + "\n");
        
        /* NumberFormat solution:
        *  NumberFormat fmt = NumberFormat.getInstance();
        *  fmt.setMaximumFractionDigits(3);
        *  String formattedArea = fmt.format(calArea());  */
        
        //ask for, read user input and create an Cube object with it
        System.out.print("Please enter the X-coordinate of cube center: ");
        double xCube = scan.nextDouble();
        System.out.print("Please enter the Y-coordinate of cube center: ");
        double yCube = scan.nextDouble();
        System.out.print("Please enter the Z-coordinate of cube center: ");
        double zCube = scan.nextDouble();
        System.out.print("Please enter the edge length: ");
        double edgeCube = scan.nextDouble();
        Cube cube1 = new Cube(xCube, yCube, zCube, edgeCube);
        System.out.println("Surface area is " + df.format(cube1.calArea())
            + ", volume is " + df.format(cube1.calVolume())
            + ", face diagonal is " + df.format(cube1.calFaceDia())
            + ", and space diagonal is " + df.format(cube1.calSpaceDia())
            + "\n");
        
        //ask for, read user input and create an Cone object with it
        System.out.print("Please enter the radius of a right circular cone: ");
        double rCone = scan.nextDouble();
        System.out.print("Please enter the height of a right circular cone: ");
        double hCone = scan.nextDouble();
        Cone cone1 = new Cone(rCone, hCone);        
        System.out.println("Volume is " + df.format(cone1.calVolume()) 
            + ", slang height is " + df.format(cone1.calSlant())
            + ", surface area is " + df.format(cone1.calArea()));
        scan.close();
    }

}
