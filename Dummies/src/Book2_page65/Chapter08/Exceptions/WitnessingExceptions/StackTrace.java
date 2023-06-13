package Book2_page65.Chapter08.Exceptions.WitnessingExceptions;

//This is GuessingGame3, but if the user entered "Five" instead of "5".

import java.util.Scanner;

/**
 * The type Stack trace.
 */
public class StackTrace {
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
            playARound(1, getRandomNumber(7, 12));
        } while (askForAnotherRound("Try again?"));
        System.out.println("\nThank you for playing!");
    }

	/**
	 * Play a round.
	 *
	 * @param min the min
	 * @param max the max
	 */
	public static void playARound(int min, int max) {
        boolean validInput;
        int number, guess;
        String answer;
        // Pick a random number
        number = getRandomNumber(min, max);
        // Get the guess
        System.out.println("\nI'm thinking of a number "
                + "between " + min + " and " + max + ".");
        System.out.print("What do you think it is? ");
        guess = getGuess(min, max);
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
	 * @param min the min
	 * @param max the max
	 * @return the random number
	 */
	public static int getRandomNumber(int min, int max) {
        return (int) (Math.random()
                * (max - min + 1)) + min;
    }

	/**
	 * Gets guess.
	 *
	 * @param min the min
	 * @param max the max
	 * @return the guess
	 */
	public static int getGuess(int min, int max) {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < min) || (guess > max)) {
                System.out.print("I said, between "
                        + min + " and " + max
                        + ". Try again: ");
            } else
                return guess;
        }
    }

	/**
	 * Ask for another round boolean.
	 *
	 * @param prompt the prompt
	 * @return the boolean
	 */
	public static boolean askForAnotherRound(String prompt) {
        while (true) {
            String answer;
            System.out.print("\n" + prompt + " (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y"))
                return true;
            else if (answer.equalsIgnoreCase("N"))
                return false;
        }
    }
}
