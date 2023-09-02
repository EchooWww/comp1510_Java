package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Random;

/**
 * The driver class.
 * @author echo
 * @version 1.0
 */
public class CatHotelDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Random random = new Random();
        final int limit = 15;
        Cat cat1 = new Cat("Mia", random.nextInt(limit));
        Cat cat2 = new Cat("Yoomi", random.nextInt(limit));
        Cat cat3 = new Cat("Vicky", random.nextInt(limit));
        Cat cat4 = new Cat("Puppy", random.nextInt(limit));
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        CatHotel cathotel = new CatHotel(cats, "<Meeow>");
        System.out.println("Guest list before addition:");
        cathotel.printGuestList();
        System.out.println("The number of guests in Meeow is " 
                + cathotel.guestCount() + " now.");
        cathotel.addCat(cat4);
        System.out.println("\nGuest list after addition:");
        cathotel.printGuestList();
        System.out.println("The number of guests in Meeow is " 
                + cathotel.guestCount() + " now.");
        final int upper = 8;
        System.out.println("\nThere are " + cathotel.removeOldGuests(upper) 
            + " guests older than " + upper + " removed.");
        System.out.println("Guest list after remove:");
        cathotel.printGuestList();
        System.out.println("The number of guests in Meeow is " 
                + cathotel.guestCount() + " now.");
        cathotel.removeAllGuests();
        System.out.println("\nAll guests are removed from Meeow.");
        System.out.println("Guest list after remove:");
        cathotel.printGuestList();
    }

}
