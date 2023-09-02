
package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * @author blink, echo
 * @version 2.0
 */
public class BaseballStats {
    
    /**
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the input file: ");
        //the Scanner object fileName reads the input file name
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));
        //validate if the file has next line
        while (fileScan.hasNext()) {
            String playerInfo = fileScan.nextLine();
            System.out.println(playerInfo);
            lineScan = new Scanner(playerInfo);
            lineScan.useDelimiter(",");
            //the loop counts the number of items delimited by comma
            int hit = 0;
            int out = 0;
            int walk = 0;
            int fly = 0;
            while (lineScan.hasNext()) {
                String n = lineScan.next();
                if (n.equals("h")) {
                    hit++;
                } else if (n.equals("o")) {
                    out++;
                } else if (n.equals("w")) {
                    walk++;
                } else if (n.equals("s")) {
                    fly++;
                }
            }
            System.out.println("The number of hits is " + hit + "," 
                    + " the number of outs is " + out + ","
                    + " the number of walks is " + walk + "," 
                    + " and the number of sacrifices is " + fly + "."); 
        }
        scan.close();
    }
}
