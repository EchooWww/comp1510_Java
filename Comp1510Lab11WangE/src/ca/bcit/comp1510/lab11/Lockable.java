package ca.bcit.comp1510.lab11;

/**
 * A new interface consists of methods about locking.
 * @author echo
 * @version 1.0
 */
public interface Lockable {

    /**
     * Established the key used to unlock.
     * @param key the int represents the key
     */
    void setKey(int key);
        
    /**
     * unlocks the implementing object if key correct.
     * @param key the number of key
     * @return true if locked, false if not
     */    
    boolean lock(int key);
        
    /**
     * locks the impelementing object if key is correct.
     * @param key the number of key
     * @return true if unlocked, false if not
     */
    boolean unlock(int key);
        
    /**
     * Returns if the object is locked.
     * @return whether or not locked
     */
    boolean locked();
}
