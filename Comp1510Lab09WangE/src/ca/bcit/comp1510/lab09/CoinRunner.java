package ca.bcit.comp1510.lab09;

/**
 * The driver class.
 * @author echo
 * @version 1.0
 */
public class CoinRunner {
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        final int hundred = 100;
        String[]coinFlip = new String[hundred];
        int run = 0;
        int longest = 0;
        for (int i = 0; i < hundred; i++) {
            coin.flip();
            coinFlip[i] = coin.toString();
            System.out.println(coinFlip[i]);
            if (coinFlip[i].equals("Heads")) {
                run += 1;
                if (run >= longest) {
                    longest = run;
                }
            } else {
                run = 0;
            }
        }
        System.out.println("The longest run of heads is " + longest);
    }

}
