package ca.bcit.comp1510.lab11;

/**
 * Simulates part of a point of sale system.
 * @author echo
 * @version 1.0
 */
public class Item {
    
    /**
     * Name of the item.
     */
    private final String name;
    
    /**
     * Price of the item.
     */
    private final double price;
    
    /**
     * Quantity of the item being purchased.
     */
    private final int quantity;
    
    /**
     * Constructs an Item object with every instance variable.
     * @param name the String name
     * @param price the double price
     * @param quantity the int quantity
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    /**
     * Constructs an Item object with name and price.
     * @param name the String name
     * @param price the double price
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    /**
     * Get the name of item.
     * @return the string name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the price of item.
     * @return the double price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the quantity of item.
     * @return the int quantity
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Return a string of item info.
     * @return the string
     */
    public String toString() {
        return "\nName: " + name + "\tPrice: " 
                + price + "\tQuantity: " + quantity;
    }
}
