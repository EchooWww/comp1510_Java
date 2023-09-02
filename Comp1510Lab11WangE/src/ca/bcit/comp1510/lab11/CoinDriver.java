package ca.bcit.comp1510.lab11;

/**
 * The driver class of a Coin object.
 * @author echo
 * @version 1.0
 *
 */
public class CoinDriver {

    /**
     * Drives the program.
     * @param args unused
     * @throws Exception if coin is locked
     */
    public static void main(String[] args) throws Exception {
        Coin coin = new Coin();
        System.out.println(coin);
        coin.flip();
        System.out.println(coin);
        coin.setKey(2);
        coin.lock(2);
        coin.unlock(2);
        coin.flip();
        System.out.println(coin);
        coin.setKey(1);
        coin.lock(1);
        coin.flip();
    }

}
