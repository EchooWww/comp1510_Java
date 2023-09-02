package ca.bcit.comp1510.lab04;

/**
 * Represents one die with any number of sides.
 * 
 * Answers for the questions:
 *
 * 1. No, I don't need and shouldn't have getters/setters for it's public.
 * 
 * 2. Can have getters, but can't have setters as it's a final variable.
 * 
 * 3. It makes sense to have max be final because it represents 
 *    the maximum number of a die and should not be changed within one object.
 *    Making it final can prevent the value from being modified.
 * 
 * 4. It means that a MultiDie object represents an immutable die with 
 * fixed value of faces, it contributes to the abstraction of the object 
 * because it encapsulates the property of fixed value of faces.
 * 
 * 5. Yes. max is an instance variable as it's declared at a class level.
 * 
 * @author Lewis & Loftus 9e & Echo
 * @author BCIT
 * @version 2023

 */
public class MultiDie {
    /** Maximum face value. */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * Constructor sets the initial face value to 1.
     * @param numSides the number of sides
     */
    public MultiDie(int numSides) {
        max = numSides;
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;
        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}



