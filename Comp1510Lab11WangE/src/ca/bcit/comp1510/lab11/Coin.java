package ca.bcit.comp1510.lab11;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;
    
    /**
     * The key of the Coin object.
     */
    private int key;

    /**
     * The locked status of the Coin object.
     */
    private boolean lockStatus;

    
    /**
     * Constructs a Coin object and flips it to give it a starting value.
     * @throws Exception when coin is locked
     */
    public Coin() throws Exception {
        flip();
        if (locked()) {
            throw new Exception("The coin is locked!");
        }
    }
    
    /**
     * Flips this Coin by randomly choosing a face value.
     * @throws Exception when coin is locked
     */
    public void flip() throws Exception {
        if (locked()) {
            throw new Exception("The coin is locked!");
        }
        face = (int) (Math.random() * 2);
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        
        return faceName;
    }

    @Override
    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public boolean lock(int keynum) {
        boolean lock = true;
        if (keynum == this.key) {
            lock = true;
            lockStatus = true;
        }
        return lock;
    }

    @Override
    public boolean unlock(int keynum) {
        boolean unlock = false;
        if (keynum == this.key) {
            unlock = true;
            lockStatus = false;
        }
        return unlock;
    }
    
    @Override
    public boolean locked() {
        return lockStatus;
    }
}

