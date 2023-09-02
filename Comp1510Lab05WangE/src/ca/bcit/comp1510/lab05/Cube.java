package ca.bcit.comp1510.lab05;

/**
 * Cube: to represent a cube concept.
 * @author Echo Wang - set 1C;
 * @version 1.0
 *
 */
public class Cube {
    /** the X coordinate.*/
    private double x;
    
    /** the Y coordinate.*/
    private double y;
    
    /** the Z coordinate.*/
    private double z;
    
    /** the edge length.*/
    private double length;
    
    /** the constructor of the class Cube. 
     * @param xValue the value of x
     * @param yValue the value of y
     * @param zValue the value of z
     * @param lengthValue the value of length*/
    public Cube(double xValue, double yValue, double zValue, 
            double lengthValue) {
        x = xValue;
        y = yValue;
        z = zValue;
        length = lengthValue;
    }
    
    /** Accesor for x.
     * @return x */
    public double getX() {
        return x;
    }
    
    /** Mutator for x.
     * @param xValue the value of x */
    public void setX(double xValue) {
        x = xValue;
    }
    
    /** Accesor for y.
     * @return y */
    public double getY() {
        return y;
    }
    
    /** Mutator for y.
     * @param yValue the value of y*/
    public void setY(double yValue) {
        y = yValue;
    }
    
    /** Accessor for z.
     * @return z */
    public double getZ() {
        return z;
    }
    
    /** Mutator for z.
     * @param zValue the value of z*/
    public void setZ(double zValue) {
        z = zValue;
    }
    
    /** Accessor for length.
     * @return length */
    public double getLength() {
        return length;
    }
    
    /** Mutator for length.
     * @param lengthValue the value of length */
    public void setLength(double lengthValue) {
        length = lengthValue;
    }
    
    /** Calculates the surface area.
     * @return the surface area
     */
    public double calArea() {
        final int param1 = 6;
        double area = param1 * length * length;
        return area;
    }
    
    /** Calculates the volume.
     * @return the volume
     */
    public double calVolume() {
        double volume = length * length * length;
        return volume;
    }
    
    /** Calculates the face diagonal.
     * @return the face diagonal */
    public double calFaceDia() {
        final double param2 = Math.sqrt(2);
        double faceDia = param2 * length;
        return faceDia;
    }
    
    /** Calculates the space diagonal.
     * @return the space diagonal */
    public double calSpaceDia() {
        final double param3 = Math.sqrt(3);
        double spaceDia = param3 * length;
        return spaceDia;
    }
    
    /** concatenate the information.
     * @return the information*/
    public String toString() {
        String info = "The coordinates of the cube center is ("
                    + x + ", " + y + ", " + z + "), "
                    + "the edge length is " + length + ".";
        return info;
    }
}
