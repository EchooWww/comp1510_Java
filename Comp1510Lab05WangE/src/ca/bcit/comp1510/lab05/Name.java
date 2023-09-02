package ca.bcit.comp1510.lab05;


/**
 * Name: can be used to represent a Name.
 * @author echo
 * @version 1.0
 */
public class Name {
    /** The private instance to represent first name.*/
    private String firstName;
    
    /** The private instance to represent middle name.*/
    private String middleName;
    
    /** The private instance to represent last name.*/
    private String lastName;
    
    /** The constructor of Name.
     * @param s1 for first name
     * @param s2 for middle name
     * @param s3 for last name
     * */
    public Name(String s1, String s2, String s3) {
        firstName = s1;
        middleName = s2;
        lastName = s3;
    }
    
    /** Mutator for firstName.
     * @param s1 the first name input*/
    public void setFirstName(String s1) {
        firstName = s1;
    }

    
    /** Accessor for firstName.
     * @return firstName as a string*/
    public String getFirstName() {
        return firstName;
    }
    
    
    /** Mutator for middleName.
     * @param s2 the middle name input*/
    public void setMiddleName(String s2) {
        middleName = s2;
    }

    /** Accessor for middleName.
     * @return firstName as a string*/
    public String getMiddleName() {
        return middleName;
    }

    
    /** Mutator for lastName.
     * @param s3 the last name input*/
    public void setLastName(String s3) {
        lastName = s3;
    }
    
    /** Accessor for lastName.
     * @return lastName as a string*/
    public String getLastName() {
        return lastName;
    }

    /** Concatenator of strings.
     * @return fullname as a string*/
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }
    
    /** The length of the name.
     * @return the length*/
    public int getLength() {
        int length = (firstName + middleName + lastName).length();
        return length;
    }
    
    /** Three initials in uppercase.
     * @return the initials in uppercase*/
    public String getUpperInitials() {
        String upperInitials = (firstName.substring(0, 1)
                + middleName.substring(0, 1) 
                + lastName.substring(0, 1)).toUpperCase();
        return upperInitials;
    }
    
    /** Get nth character.
     * @param n the number of sequence
     * @return nth character*/
    public char getNthChar(int n) {
        char nthChar = toString().charAt(n - 1);
        return nthChar;
    }
    
    /** Name in given format.
     * @return the formatted name*/
    public String getFormattedName() {
        String fmt = lastName + ", " + firstName + " " + middleName;
        return fmt;
    }
    
    /** Compare the string with the first name.
     * @param input the input string
     * @return whether equal*/
    public boolean getIfEqual(String input) {
        boolean areEqual = firstName.equals(input);
        return areEqual;
    }
    
    /** Compare the two Name objects.
     * @param name1 the other object
     * @return whether equal*/
    public boolean getIfEqual2(Name name1) {
        boolean areEqual = name1.firstName.equals(this.firstName) 
                && name1.middleName.equals(this.middleName)
                && name1.lastName.equals(this.lastName);
        return areEqual;
    }
    

}
