package Book2_page65.Chapter07.Methods.GuessingGameMethod;

import java.util.Scanner;

/**
 * The type Guessing game method.
 */
public class GuessingGameMethod {
	/**
	 * The Sc.
	 */
	static Scanner sc = new Scanner(System.in);
	/**
	 * The Keep playing.
	 */
	static boolean keepPlaying = true;

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) {
            playARound();
        }
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
        number = (int) (Math.random() * 10) + 1;
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
        // Get the guess
        System.out.print("What do you think it is? ");
        do {
            guess = sc.nextInt();
            validInput = true;
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 "
                        + "and 10. Try again: ");
                validInput = false;
            }
        } while (!validInput);
        // Check the guess
        if (guess == number)
            System.out.println("You're right!");
        else
            System.out.println("You're wrong!"
                    + " The number was " + number);
        // Play again?
        do {
            System.out.print("\nPlay again? (Y or N)");
            answer = sc.next();
            validInput = true;
            if (answer.equalsIgnoreCase("Y")) ;
            else if (answer.equalsIgnoreCase("N"))

                keepPlaying = false;
            else
                validInput = false;
        } while (!validInput);
    }
}
