
package ca.bcit.comp1510.lab05;


/** Sphere: To represent a Sphere concept.
 * @author Echo Wang - Set 1C
 * @version 1.0
 */
public class Sphere {
    /** the X-coordinate.*/
    private double x;
    
    /** the Y-coordinate.*/
    private double y;
   
    /** the Z-coordinate.*/
    private double z;
   
    /** the radius.*/
    private double radius;
    
    /** the constructor of class Sphere. 
     * @param xValue for X
     * @param yValue for Y
     * @param zValue for Z
     * @param rValue for radius*/
    public Sphere(double xValue, double yValue, double zValue, double rValue) {
        x = xValue;
        y = yValue;
        z = zValue;
        radius = rValue;
    }
    
    /** Accessor for x. 
     * @return the value of x*/
    public double getX() {
        return x;
    }
    
    /** Mutator for x.
     * @param xValue value input*/
    public void setX(double xValue) {
        x = xValue;
    }
    
    /** Accessor for y.
     * @return the value of y*/
    public double getY() {
        return y;
    }
    
    /** Mutator for y.
     * @param yValue value input*/
    public void setY(double yValue) {
        y = yValue;
    }
    
    /** Accessor for z.
     * @return the value of z*/
    public double getZ() {
        return z;
    }
   
    /** Mutator for z.
     * @param zValue value input*/
    public void setZ(double zValue) {
        z = zValue;
    }
    
    /** Accessor for radius.
     * @return the value of radius*/
    public double getRadius() {
        return radius;
    }
    
    /** Mutator for radius.
     * @param rValue value input*/
    public void setRadius(double rValue) {
        radius = rValue;
    }
    
    /** calculator the surface area.
     * @return the surface area */
    public double calArea() {
        final int param1 = 4;
        double area = param1 * Math.PI * radius * radius;
        return area;
    }
    
    /** calculator for the volume.
     * @return the volume */
    public double calVolume() {
        final double param2 = 0.75;
        double volume = param2 * Math.PI * radius * radius * radius;
        return volume;
    }
   
    /** concatenate the states.
     * @return the information*/
    public String toString() {
        String info = "The coordinates of the sphere center is (" 
                + x + ", " + y + ", " + z + "), the radius is " + radius + ".";
        return info;
    }
}
