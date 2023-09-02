package ca.bcit.comp1510.lab10;

/**
 * The class of Name.
 * @author echo
 * @version 1.0
 */
public class Name implements Comparable<Name> {
    
    /**
     * The first name.
     */
    private final String first;
    
    /**
     * The middle name.
     */
    private final String middle;
    
    /**
     * The last name.
     */
    private final String last;
    
    /**
     * Constructs a name object with first, middle, and last name.
     * @param first the string represents first name
     * @param middle the string represents middle name
     * @param last the string represents last name
     */
    public Name(String first, String middle, String last) {
        if (!first.isBlank() && first != null 
                & !last.isBlank() && last != null) {
            throw new IllegalArgumentException(
                    "Must have a non-empty first and last name!");
        }
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    /**
     * Constructs a name object with first and last name.
     * @param first the string represents first name
     * @param last the string represents last name
     */
    public Name(String first, String last) {
        this.first = first;
        this.middle = null;
        this.last = last;
    }

    /**
     * Gets the instance variable first.
     * @return the first name
     */
    public String getFirst() {
        return first;
    }

    /**
     * Gets the instance variable middle.
     * @return the middle name
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Gets the instance variable last.
     * @return the last name
     */
    public String getLast() {
        return last;
    }

    @Override
    public int compareTo(Name o) {
        if (!this.last.equals(o.last)) {
            return this.last.compareTo(o.last); 
        } else if (!this.first.equals(o.first)) {
            return this.first.compareTo(o.first);
        } else {
            return this.middle.compareTo(o.middle);
        }  
    }
    
    /**
     * Returns the string of name.
     * @return the concatenated name
     */
    public String toString() {
        return first + " " + middle + " " + last;
    }
}
