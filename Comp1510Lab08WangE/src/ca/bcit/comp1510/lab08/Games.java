package ca.bcit.comp1510.lab08;

import java.util.Random;
import java.util.Scanner;


/**
 * Games: easy, fun games with Random class and luck.
 * @author echo
 * @version 1.0
 */
public class Games {
    
    /**
     * The socre of user. 
     */
    private int score;
    
    /**
     * The Scanner object.
     */
    private Scanner scan;
    
    /**
     * The Random object.
     */
    private Random rand;
    
    /**
     * The constructor.
     */
    public Games() {
        score = 0;
        scan = new Scanner(System.in);
        rand = new Random();
    }
    
    /**
     * The play method.
     */
    public void play() {
        System.out.print("Welcome to the Games program!\n"
                + "Make your choice (enter a number):\n"
                + "1. See your score\n"
                + "2. Guess a number\n"
                + "3. Play Rock, Paper, Scissors\n"
                + "4. Quit\n"
                + ">");
        
        while (scan.hasNext()) {
            while (!scan.hasNextInt()) {
                System.out.print("That's not a valid choice!\n"
                        + "Make your choice (enter a number):\n"
                        + "1. See your score\n"
                        + "2. Guess a number\n"
                        + "3. Play Rock, Paper, Scissors\n"
                        + "4. Quit\n"
                        + ">");
                scan.next();
            }
            int n = scan.nextInt();
            final int f = 4;
            while (n < 1 || n > f) {
                System.out.print("That's not a valid choice!\n"
                        + "Make your choice (enter a number):\n"
                        + "1. See your score\n"
                        + "2. Guess a number\n"
                        + "3. Play Rock, Paper, Scissors\n"
                        + "4. Quit\n"
                        + ">");
                while (!scan.hasNextInt()) {
                    System.out.print("That's not a valid choice!\n"
                            + "Make your choice (enter a number):\n"
                            + "1. See your score\n"
                            + "2. Guess a number\n"
                            + "3. Play Rock, Paper, Scissors\n"
                            + "4. Quit\n"
                            + ">");
                    scan.next();
                }

                n = scan.nextInt();
            }
            
            final int three = 3;
            switch (n) {
                case (1):
                    System.out.println("Your score is " + score + "\n"
                        + "Welcome to the Games program!\n"
                        + "Make your choice (enter a number):\n"
                        + "1. See your score\n"
                        + "2. Guess a number\n"
                        + "3. Play Rock, Paper, Scissors\n"
                        + "4. Quit\n"
                        + ">");
                    break;
                case (2):
                    guessANumber(scan, rand);
                    break;
                case (three):
                    rockPaperScissors(scan, rand);
                    break;
                default:
                    return;
            }
        }
    }
    
    /**
     * To guess a bumber.
     * @param scanner the Scanner object
     * @param random the Random object
     */
    public void guessANumber(Scanner scanner, Random random) {
        final int limit = 101;
        int answer = random.nextInt(limit);
        System.out.println("I've picked a random number between 0 and 100\n"
                + "Can you guess it?\n"
                + "Guess the number!");
        int guess = scanner.nextInt();
        int i = 1;
        if (guess == answer) {
            System.out.println("RIGHT!/nFive points!");
            play();
        }
        while (guess != answer) {
            while (guess < answer) {
                System.out.println("Too low, guess again!\n"
                        + "Guess the number!");
                guess = scanner.nextInt();
                i++;
            }
            while (guess > answer) {
                System.out.println("Too high, guess again!\n"
                        + "Guess the number!");
                guess = scanner.nextInt();
                i++;
            }

        }
        System.out.println("RIGHT!");
        final int five = 5;
        if (i <= five) {
            System.out.println("Five points!");
            score += five;
        }
        play();
    }
    
    /**
     * To play rock, paper, scissors.
     * @param scanner the Scanner object
     * @param random the Random object
     */
    public void rockPaperScissors(Scanner scanner, Random random) {
        final int three = 3;
        final int five = 5;
        int computer = random.nextInt(three);
        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS\n"
                + "Which one do you choose?");
        String user = scanner.next();
        while (!user.toLowerCase().equals("scissors") 
                && !user.toLowerCase().equals("paper") 
                && !user.toLowerCase().equals("rock")) {
            System.out.println("That's not a valid choice! Try again!");
            user = scanner.next();
        }
        if (user.toLowerCase().equals("scissors")) {
            switch (computer) {
                case 0:
                    System.out.println("Nope, I picked Rock");
                    score -= three;
                    break;
                case 1:
                    System.out.println("Yes! Scissors cut Paper");
                    score += five;
                    break;
                case 2:
                    System.out.println("It's a tie! I picked Scissors, too");
                    break;
                default:
                    return;
            }
            
        } else if (user.toLowerCase().equals("rock")) {
            switch (computer) {
                case 0:
                    System.out.println("It's a tie! I picked Rock, too");
                    break;
                case 1:
                    System.out.println("Nope, I picked Paper");
                    score -= three;
                    break;
                case 2:
                    System.out.println("Yes! Rock smashes Scissors");
                    score += five;
                    break;
                default:
                    return;
            }
        } else {
            switch (computer) {
                case 0:
                    System.out.println("Yes! Paper wraps Rock");
                    score += five;
                    break;
                case 1:
                    System.out.println("It's a tie! I picked Paper, too");
                    break;
                case 2:
                    System.out.println("Nope, I picked Scissors");
                    score -= three;
                    break;
                default:
                    return;
            }
        }
        play();
    }  
    
}
