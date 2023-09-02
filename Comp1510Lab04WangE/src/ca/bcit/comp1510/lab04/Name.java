package ca.bcit.comp1510.lab04;


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
    
    

}
