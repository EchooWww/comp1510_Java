package ca.bcit.comp1510.lab06;


/**
 * Name: can be used to represent a Name, enhanced version.
 * @author echo
 * @version 2.0
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
        if (s1 != null && !s1.isEmpty() && !s1.trim().isEmpty()) {
            firstName = s1.substring(0, 1).toUpperCase() 
                    + s1.substring(1, s1.length()).toLowerCase();
        } else {
            firstName = "JANE"; 
        }
        if (s2 != null && !s2.isEmpty() && !s2.trim().isEmpty()) {
            middleName = s2.substring(0, 1).toUpperCase() 
                    + s2.substring(1, s2.length()).toLowerCase();
        } else {
            middleName = "MARGARET";
        }
        if (s3 != null && !s3.isEmpty() && !s3.trim().isEmpty()) {
            lastName = s3.substring(0, 1).toUpperCase() 
                    + s3.substring(1, s3.length()).toLowerCase();
        } else {
            lastName = "DOE";
        }
    }
    
    /** Mutator for firstName.
     * @param s the first name input, in name format */
    public void setFirstName(String s) {
        if (s != null && !s.isEmpty() && !s.trim().isEmpty()) {
            firstName = s.substring(0, 1).toUpperCase() 
                    + s.substring(1, s.length()).toLowerCase();
        }
    }

    
    /** Accessor for firstName.
     * @return firstName as a string*/
    public String getFirstName() {
        return firstName;
    }
    
    
    /** Mutator for middleName.
     * @param s the middle name input, in name format */
    public void setMiddleName(String s) {
        if (s != null && !s.isEmpty() && !s.trim().isEmpty()) {
            middleName = s.substring(0, 1).toUpperCase() 
                    + s.substring(1, s.length()).toLowerCase();
        }
    }

    /** Accessor for middleName.
     * @return firstName as a string*/
    public String getMiddleName() {
        return middleName;
    }

    
    /** Mutator for lastName.
     * @param s the last name input, in name format, in name format  */
    public void setLastName(String s) {
        if (s != null && !s.isEmpty() && !s.trim().isEmpty()) {
            lastName = s.substring(0, 1).toUpperCase() 
                    + s.substring(1, s.length()).toLowerCase();
        }
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
        if (n <= getLength() - 1) {
            char nthChar = toString().charAt(n - 1);
            return nthChar;
        } else {
            char charExc = '@';
            return charExc;
        }
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
