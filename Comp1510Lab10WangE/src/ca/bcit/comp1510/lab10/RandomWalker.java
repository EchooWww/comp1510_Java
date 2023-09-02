package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * Represents a RandomWalker object.
 * @author echo
 * @version 1.0
 */
public class RandomWalker {
    
    /**
     * The x coordinate of the current position.
     */
    private int positionX;
    
    /**
     * The Y coordinate of the current position.
     */
    private int positionY;
    
    /**
     * The maximum number of steps in the walk.
     */
    private int maxStep;
    
    /**
     * The current number of steps taken.
     */
    private int currentStep;
    
    /**
     * The boundary of the squre the walker inhabits.
     */
    private int boundary;
    
    /**
     * The distance an objec is from the origin.
     */
    private int maximumDistance;
    
    /**
     * Constructs a RandomWalker object with maximum steps and boundary.
     * @param maxStep the integer of maximum steps
     * @param boundary the integer of boundary
     */
    public RandomWalker(int maxStep, int boundary) {
        this.maxStep = maxStep;
        this.boundary = boundary;
        this.positionX = 0;
        this.positionY = 0;
        this.currentStep = 0;
        this.maximumDistance = 0;
    }
    
    /**
     * Constructs a RandomWalker object with maximum steps, boundary, x and y.
     * @param maxStep the integer of maximum steps
     * @param boundary the integer of boundary
     * @param positionX the X coordinate of the current postion
     * @param positionY the Y coordinate of the current position
     */
    public RandomWalker(int positionX, 
            int positionY, int maxStep, int boundary) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.maxStep = maxStep;
        this.boundary = boundary;
        this.currentStep = 0;
        this.maximumDistance = 0;

    }
    
    /**
     * The accesor for the maximumDistance.
     * @return the value of maximumDistance
     */
    public int getMaxDistance() {
        return maximumDistance;
    }
    
    /**
     * Returns the current step and current position of the RandomWalker object.
     * @return the string
     */
    public String toString() {
        return "Current steps: " + getCurrentStep() 
                + "\nCurrent position: x = " + getPositionX() 
                + ", y = " + getPositionY();
    }
    
    private int max(int a, int b) {
        return Math.max(a, b);
    }
    
    /**
     * Simulates taking a single step.
     */
    public void takeStep() {
        Random rand = new Random();
        final int four = 4;
        int direction = rand.nextInt(four);
        switch (direction) {
            case (0) :
                positionY = getPositionY() + 1;
                break;
            case (1) :
                positionX = getPositionX() + 1;
                break;
            case (2) :
                positionY = getPositionY() - 1;
                break;
            default :
                positionY = getPositionY() - 1;
                break;
        }
        currentStep = getCurrentStep() + 1;
        maximumDistance = max(maximumDistance, 
                max(Math.abs(getPositionX()), Math.abs(getPositionY())));
    }
    
    /**
     * Returns whether the current step number is less than maximum.
     * @return true or false
     */
    public boolean moreSteps() {
        return getCurrentStep() < maxStep;
    }
    
    /**
     * Returns whether the current position is within the boundary.
     * @return true or false
     */
    public boolean isBounds() {
        return Math.abs(getPositionX()) <= boundary 
                && Math.abs(getPositionY()) <= boundary;
    }
    
    /**
     * Simulates a random walk.
     */
    public void walk() {
        while (moreSteps() && isBounds()) {
            takeStep(); }
    }

    /**
     * Get the current step of a walker.
     * @return the current ste
     */
    public int getCurrentStep() {
        return currentStep;
    }
    
    /**
     * Gets the current X coordinate of the walker.
     * @return the x value
     */
    public int getPositionX() {
        return positionX;
    }
    
    /**
     * Gets the current X coordinate of the walker.
     * @return the y value
     */
    public int getPositionY() {
        return positionY;
    }
}
