
package ca.bcit.comp1510.lab02;

/** 
 * prints a table with a list of students' grades.
 * @author Echo
 * @version 1.0
 * */
public class Students {
    /** 
     * Contents of the table.
     * @param args unused.
     */
    public static void main(String[] args) {
        System.out.println("//////////////////"
                + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n"
                + "== " + " " + " " + " " + " " + " " + " " 
                + "Student Points" 
                + " " + " " + " " + " " + " " + " " + "==\n"
                + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////\n"
                + "Name\t" + "Lab\t" + "Bonus\t" + "Total\n"
                + "Joe\t" + "43\t" + "7\t" + (43 + 7) + "\n"
                + "William\t" + "50\t" + "8\t" + (50 + 8) + "\n"
                + "Mary Sue\t" + "39\t" + "10\t" + (39 + 10) + "\n"
                + "Peng\t" + "87\t" + "6\t" + (87 + 6) + "\n"
                + "Kwon\t" + "99\t" +  "0\t" + (99 + 0));
    }

}
