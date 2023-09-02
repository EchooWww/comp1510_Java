package ca.bcit.comp1510.lab05;

/** Represents the concepts of a right circular cone.
 * @author Echo Wang - Set 1C
 * @version 1.0
 */
public class Cone {
    
    /** the radius of a cone.*/
    private double radius;
   
    /** the height of a cone.*/
    private double height;
    
    /** the constructor of the cone class.
     * @param rValue the value of radius
     * @param hValue the value of height*/
    public Cone(double rValue, double hValue) {
        radius = rValue;
        height = hValue;
    }
    
    /** Accesor of radius.
     * @return radius */
    public double getR() {
        return radius;
    }
    
    /** Mutator of radius.
     * @param rValue the value of radius */
    public void setR(double rValue) {
        radius = rValue;
    }
    
    /** Accessor of height.
     * @return height */
    public double getH() {
        return height;
    }
    
    /** Mutator of height.
     * @param hValue the value of hight */
    public void setH(double hValue) {
        height = hValue;
    }
    
    /** Calculator for volume.
     * @return volume */
    public double calVolume() {
        final int param1 = 3;
        double volume = Math.PI * radius * radius * height / param1;
        return volume;
    }
    
    /** Calculator for slant height.
     * @return slant height */
    public double calSlant() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return slantHeight;
    }
    
    /** Calculator for surface area.
     * @return surface area */
    public double calArea() {
        double area = Math.PI * radius * radius
              + Math.PI * radius * Math.sqrt(radius * radius + height * height);
        return area;
    }
    
    /** Concatenate the information. /
     * @return info */
    public String toString() {
        String info = "The radius " + radius 
                + ", the height is " + height + ".";
        return info;
    }
}
