package ca.bcit.comp1510.lab05;

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
        Name name1 = new Name("Echo", "Yiwen", "Wang");
        System.out.println(name1.getLength());
        System.out.println(name1.getUpperInitials());
        System.out.println(name1.getNthChar(2));
        System.out.println(name1.getFormattedName());
        System.out.println(name1.getIfEqual("Echo"));
        Name name2 = new Name("Echo", "Yiwen", "Wang");
        System.out.println(name1.getIfEqual2(name2));
        Name name3 = new Name("Echo", "yiwen", "Wang");
        System.out.println(name1.getIfEqual2(name3));

    }

}
