package ca.bcit.comp1510.lab11;

/**
 * Simulates the trasaction system. 
 * @author echo
 * @version 1.0
 */
public class Transaction {
    
    /**
     * An array of Item.
     */
    private Item[] cart;
    
    /**
     * Represents the total price of items in the array.
     */
    private double totalPrice;
    
    /**
     * Represents the number of Item objects in the array.
     */
    private int itemCount;
    
    /**
     * Constructs a Transaction object with the length of array.
     * @param length to initialize the array
     */
    public Transaction(int length) {
        cart = new Item[length];
        totalPrice = 0;
        itemCount = 0;
    }
    
    /**
     * Creates an item and adds it to the cart.
     * @param name name of the item
     * @param price price of the item
     * @param quantity quantity of the item
     */
    public void addToCart(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        cart[itemCount] = item;
        itemCount++;
        totalPrice += price * quantity;
    }
    
    /**
     * Add an item to the cart.
     * @param item an Item object
     */
    public void addToCart(Item item) {
        cart[itemCount] = item;
        itemCount++;
        totalPrice += item.getPrice() * item.getQuantity();
    }
    
    /**
     * Increases the size of the cart in the Transaction.
     */
    public void increaseSize() {
        if (itemCount == cart.length) {
            final int three = 3;
            Item[] biggerCart = new Item[cart.length + three];
            for (int i = 0; i < cart.length; i++) {
                biggerCart[i] = cart[i];
            }
            this.cart = biggerCart;
        }
    }
    
    /**
     * Returns the total price of all the items in the cart.
     * @return the double number of total price.
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Returns the total number of items in the cart.
     * @return the total number of items
     */
    public int getCount() {
        int count = 0;
        for (Item item: cart) {
            count += item.getQuantity();
        }
        return count;
    }
    
    /**
     * Returns a string containing the list of items and the total price.
     * @return the information
     */
    public String toString() {
        String s1 = "Details of your shopping cart:";
        for (Item item:this.cart) {
            s1 += item.toString();
        }
        s1 += "\nTotal price:" + getTotalPrice();
        return s1;
    }
    
}
