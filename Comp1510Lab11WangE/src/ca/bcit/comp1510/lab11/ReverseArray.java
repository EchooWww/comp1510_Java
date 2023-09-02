package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * Accept an array from user input and reverse it.
 * @author echo
 * @version 1.0
 */
public class ReverseArray {
    
    /**
     * The array generated with user input.
     */
    private int[] reverse;
    
    /**
     * Constructs an ReverseArray object.
     * @param length the length of the array
     * @param value variable parameter of the values in the array
     */
    public ReverseArray(int length, int... value) {
        reverse = new int[length];
        for (int i = 0; i < length; i++) {
            reverse[i] = value[i];
        }
    }
    
    /**
     * The helper method.
     */
    private void swap() {
        if (reverse.length > 1) {
            for (int i = 0, j = reverse.length - 1; i < j; i++, j--) {
                int p = reverse[i];
                reverse[i] = reverse[j];
                reverse[j] = p;
            }
        }
    }
    
    /**
     * Return the array as a string.
     * @return the string
     */
    public String toString() {
        String reversed = "";
        for (int n: reverse) {
            reversed += "" + n + ", ";
        }
        return reversed;
    }
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int length = scan.nextInt();
        int[] values = new int[length];
        System.out.println(
                "Please enter the values to be stored in the array, "
                + "split by enter: ");
        for (int i = 0; i < length; i++) {
            values[i] = scan.nextInt();
        }
        ReverseArray newArray = new ReverseArray(length, values);
        System.out.println("Before reverse: " + newArray);
        newArray.swap();
        System.out.println("After reverse: " + newArray);
        scan.close();
    }
    
}
