package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * A program to select random cards.
 * @author echo
 * @version 1.0
 */
public class CardGame {
    
    /** Defines an enumerated type contains card values.*/
    public enum Rank {
        /** This represents the card ace.*/
        ace, 
        /** This represents the card two.*/
        two, 
        /** This represents the card three. */
        three, 
        /** This represents the card four.*/
        four,
        /** This represents the card five.*/
        five, 
        /** This represents the card six.*/
        six, 
        /** This represents the card seven.*/
        seven, 
        /** This represents the card eight.*/
        eight, 
        /** This represents the card nine.*/
        nine, 
        /** This represents the card ten.*/
        ten, 
        /** This represents the card jack.*/
        jack, 
        /** This represents the card queen.*/
        queen, 
        /** This represents the card king.*/
        king
    }
   
    /** Defines an enumerated type contains card suites.*/
    public enum Suit {
        /** This represents the card hearts.*/
        hearts, 
        /** This represents the card diamonds.*/
        diamonds, 
        /**  This represents the card clubs.*/
        clubs, 
        /** This represents the card spades.*/
        spades
    }
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Random random = new Random();
        int randomRankChoice = random.nextInt(Rank.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        int randomSuitChoice = random.nextInt(Suit.values().length);
        Suit randomSuit = Suit.values()[randomSuitChoice];
        System.out.println("The randomly selected card is "
                + randomRank + " of " + randomSuit + ".");

    }

}
