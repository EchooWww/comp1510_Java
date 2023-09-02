package ca.bcit.comp1510.lab02;

import java.util.Scanner;
/**
* BaseConvert.
* @author BCIT
* @version 2.0
*/

public class BaseConvert {
    /**
    * Drives the program.
    * @param args unused
    *     Arguments
    */
    public static void main(String[] args) {
        int base10number; 
        int base; 
        int maximumNumber = 0; 
        int place0; 
        int place1;
        int place2;
        int place3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Base Conversion Program");
        System.out.print("Please enter a base (2-9): ");
        base = scan.nextInt();
        // Assign the user's input to the base variable
        // Calculate the correct value to store in maxNumber
        maximumNumber = base * base * base * base - 1;
        System.out.println("The max base 10 number to convert for that base is "
                + maximumNumber);
        System.out.print("Please enter a base 10 number to convert: ");
        base10number = scan.nextInt();
        //calculate the number on the first place from RHS
        place0 = base10number % base;
        //calculate the number on the second place from RHS
        place1 = base10number / base % base;
        //calculate the number on the third place from RHS
        place2 = base10number / base / base % base;
        //calculate the number on the fourth place from RHS
        place3 = base10number / base / base / base % base;     
        scan.close();
        //concat the places with a left-to-right sequence
        String baseBNumber = new String(String.valueOf(place3) 
                + String.valueOf(place2) + String.valueOf(place1) 
                + String.valueOf(place0));
        System.out.println("The number after conversion is " 
                + baseBNumber + " in base " + base + ".");
        Integer a = 237;
        Integer b = 862;
        b = a;
        a = 377;
        System.out.println(b);
        System.out.println(a);
        String html = """
             <html>
                    <body>
                        <p>Hello World</p>
                    </body>
                </html>
                """;
        System.out.println(html);
        
    }
}
