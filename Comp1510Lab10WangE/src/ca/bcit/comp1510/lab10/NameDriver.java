package ca.bcit.comp1510.lab10;

import java.util.ArrayList;

/**
 * The driver class of Name class.
 * @author echo
 * @version 1.0
 */
public class NameDriver {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Name n1 = new Name("Echo", "Wang");
        Name n2 = new Name("Iris", "Xu");
        Name n3 = new Name("Gin", "Lu");
        Name n4 = new Name("Parin", "Rava");
        Name n5 = new Name("Leroy", "Lau");
        ArrayList <Name> nameList = new ArrayList<Name>();
        nameList.add(n1);
        nameList.add(n2);
        nameList.add(n3);
        nameList.add(n4);
        nameList.add(n5);
        nameList.sort(null);
        System.out.println(nameList);
    }
}
