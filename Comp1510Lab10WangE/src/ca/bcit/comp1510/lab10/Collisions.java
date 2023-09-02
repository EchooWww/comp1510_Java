package ca.bcit.comp1510.lab10;

/**
 * Simulates two particles in a space and how many times they collide.
 * @author echo
 * @version 1.0
 */
public class Collisions {
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int boundary = 2000000;
        final int max = 100000;
        final int three = 3;
        final int nThree = -3;
        RandomWalker particle1 = new RandomWalker(nThree, 0, max, boundary);
        RandomWalker particle2 = new RandomWalker(three, 0, max, boundary);
        int collision = 0;
        for (int i = 0; i < max; i++) {
            particle1.takeStep();
            particle2.takeStep();
            if (samePosition(particle1, particle2)) {
                collision++;
            }
        }
        System.out.println("The two particles collide " 
                + collision + " times.");
        
    }
    
    /**
     * Checks if the two RandomWalked objects are in the same position.
     * @param r1 the first object
     * @param r2 the second object
     * @return whether they are in the same position
     */
    public static boolean samePosition(RandomWalker r1, RandomWalker r2) {
        return (r1.getPositionX() == r2.getPositionX() 
                && r1.getPositionY() == r2.getPositionY());
    }
}
