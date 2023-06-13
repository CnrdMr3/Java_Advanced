package Book2_page65.Chapter07.Methods.GuessingGameMethod2;

import java.util.Scanner;

/**
 * The type Guessing game method 2.
 */
public class GuessingGameMethod2 {
	/**
	 * The Sc.
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\nThank you for playing!");
    }

	/**
	 * Play a round.
	 */
	public static void playARound() {
        boolean validInput;
        int number, guess;
        String answer;
        // Pick a random number
        number = getRandomNumber();
        // Get the guess
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess();
        // Check the guess
        if (guess == number)
            System.out.println("You're right!");
        else
            System.out.println("You're wrong!"
                    + " The number was " + number);
    }

	/**
	 * Gets random number.
	 *
	 * @return the random number
	 */
	public static int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }

	/**
	 * Gets guess.
	 *
	 * @return the guess
	 */
	public static int getGuess() {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 and 10. "
                        + "Try again: ");
            } else
                return guess;
        }
    }

	/**
	 * Ask for another round boolean.
	 *
	 * @return the boolean
	 */
	public static boolean askForAnotherRound() {
        while (true) {
            String answer;
            System.out.print("\nPlay again? (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y"))
                return true;
            else if (answer.equalsIgnoreCase("N"))
                return false;
        }
    }
}
