package ca.bcit.comp1510.lab08;

/**
 * The driver class.
 * @author echo
 * @version 1.0
 */
public class Driver {
    /**
    * Drives the program.
    * @param args unused
    */
    final static double x = 2;
    public static void main(String[] args) {
        Games myGame = new Games();
        myGame.play();
        System.out.println(x);
    }

};
