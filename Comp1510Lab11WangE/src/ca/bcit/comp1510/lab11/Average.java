package ca.bcit.comp1510.lab11;

/**
 * Prints the command line arguments passed to the program.
 * @author echo
 * @version 1.0
 */
public class Average {
    
    /**
     * Drives the program.
     * @param args the arguments passed via command line
     */
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("No arguments.");
            } else {
                int sum = 0;
                for (String s1: args) {
                    int value = Integer.parseInt(s1);
                    sum += value;
                }
                double average = (double) sum / args.length;
                System.out.println(average);
            }
        } catch (NumberFormatException e1) {
            System.out.println("Arguments must be integers.");
        }
        
    }
}
