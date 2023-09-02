package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * The driver class of the part of sale system.
 * @author echo
 * @version 1.0
 */
public class Shoppping {
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of your cart:");
        int length = scan.nextInt();
        Transaction trans = new Transaction(length);
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter the name, price "
                    + "and quantity of the item you're purchasing: ");
            String name = scan.next();
            double price = scan.nextDouble();
            int quantity = scan.nextInt();
            Item item = new Item(name, price, quantity);
            trans.addToCart(item);
            System.out.println("Added to cart successfully!");
        }
        System.out.println(trans);
        trans.increaseSize();
        final int three = 3;
        for (int i = 0; i < three; i++) {
            System.out.println("Please enter the name, price "
                    + "and quantity of the item you're purchasing: ");
            String name = scan.next();
            double price = scan.nextDouble();
            int quantity = scan.nextInt();
            trans.addToCart(name, price, quantity);
            System.out.println("Added to cart successfully!");
        }
        System.out.println(trans);
        scan.close();
    }
    
}
