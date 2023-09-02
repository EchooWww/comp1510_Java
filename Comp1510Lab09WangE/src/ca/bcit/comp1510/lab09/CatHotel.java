package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The CatHotel class.
 * @author echo
 * @version 1.0
 */
public class CatHotel {
    
    /**
     * The arraylist to store the guests.
     */
    private ArrayList<Cat> guests;
    
    /**
     * The name of the hotel.
     */
    private String name;
    
    /**
     * The constructor of CatHotel objects.
     * @param guests the list of cat guests as formal parameter.
     * @param name the name of the hotel as formal parameter.
     */
    public CatHotel(ArrayList<Cat> guests, String name) {
        this.guests = guests;
        this.name = name;
    }
    
    /**
     * The method to add a cat to the list of guests.
     * @param cat the add to be added
     */
    public void addCat(Cat cat) {
        guests.add(cat);
    }
    
    /**
     * The method to remove all guests from the hotel.
     */
    public void removeAllGuests() {
        guests.clear();
    }
    
    /**
     * The method to return the number of guests in the hotel.
     * @return the count.
     */
    public int guestCount() {
        return guests.size();
    }
    
    /**
     * The method to remove guests older than the upper bound 
     * and return the number being moved.
     * @param ageLimit the upper bound 
     * @return the removed number
     */
    public int removeOldGuests(int ageLimit) {
        Iterator<Cat> catIterator = guests.iterator();
        int evicted = 0;
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() > ageLimit) {
                catIterator.remove();
                evicted++;
            }
        }
        return evicted;
    }
    
    /**
     * Prints the name and guest list of the CatHotel.
     */
    public void printGuestList() {
        System.out.println(name);
        for (Cat cat: guests) {
            System.out.println(cat);
        }
    }
    
}
