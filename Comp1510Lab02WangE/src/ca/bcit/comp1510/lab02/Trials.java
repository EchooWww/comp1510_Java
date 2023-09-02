package ca.bcit.comp1510.lab02;

/** 
 * The answers of prelab questions.
 * @author echo
 * @version 1.0
 */
public class Trials {

    /** 
     * Runs the calculation.
     * @param args unused
     */
    
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int c = 7;
        double w = 12.9;
        double y = 3.2;
        System.out.println("a + b * c = " + (a + b * c));
        System.out.println("a – b – c = " + (a - b - c));
        System.out.println("a / b = " + (a / b));
        System.out.println("b / a = " + (b / a));
        System.out.println("a – b / c = " + (a - b / c));
        System.out.println("w / y = " + (w / y));
        System.out.println("y / w = " + (y / w));
        System.out.println("a + w / b = " + (a + w / b));
        System.out.println("a % b / y = " + (a % b / y));
        System.out.println("b % a = " + (b % a));
        System.out.println("w % y = " + (w % y));
    }
}

/*
 1. Can you explain the difference between the 
 following three lines of code to your lab instructor?
 a. int x; 
 b. int x = 3;
 c. x = 3;
 a means to declare(create) a 32-bit integer variable named x;
 b means to declare(create) a 32-bit integer variable and 
 give it an initial value of 3;
 c means value 3 is assigned to the variable x; 
 2. Given the declarations below, find the result of each expression:
 int a = 3;
 int b = 9;
 int c = 7; 
 double w = 12.9;
 double y = 3.2 ;
 a. a + b * c = 66
 b. a – b – c = -13
 c. a / b = 0
 d. b / a = 3
 e. a – b / c = 2
 f. w / y = 4.03125
 g. y / w = 0.24806201550387597
 h. a + w / b = 4.433333333333334
 i. a % b / y = 0.9375
 j. b % a = 0
 k. w % y = 0.09999999999999964
 */
