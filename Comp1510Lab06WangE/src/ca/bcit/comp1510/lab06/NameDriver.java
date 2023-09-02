package ca.bcit.comp1510.lab06;

/**
 * The driver program.
 * @author Echo Wang - Set 1C
 * @version 1.0
 */
public class NameDriver {

    /** Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Name name1 = new Name("  ", "YiwEN", "");
        System.out.println(name1);
        final int a = 27;
        System.out.println(name1.getNthChar(a));
        System.out.println(name1.getNthChar(2));
        name1.setFirstName("");
        System.out.println(name1);
        name1.setFirstName("    ");
        System.out.println(name1);
        name1.setLastName(null);
        System.out.println(name1);
        name1.setFirstName("eCHO");
        System.out.println(name1);
        name1.setLastName("WaNg");
        System.out.println(name1);
    }
}
