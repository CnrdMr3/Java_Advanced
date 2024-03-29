package Book2_page65.Chapter05.Loops.ValidatingInputFromUser;

import java.util.Scanner;

/**
 * The type Get a bet 3.
 */
public class GetABet3 {
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
        int bank = 1000; // assume the user has $1,000
        int bet; // the bet entered by the user
        boolean validBet; // indicates if bet is valid
        System.out.println
                ("You can bet between 1 and " + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            validBet = true;
            if ( (bet <= 0) || (bet > bank) ) {
                validBet = false;
                System.out.println
                        ("What, are you crazy?");
            }
        } while (!validBet);
        System.out.println("Your money's good here.");
    }
}

//Use a boolean value to avoid repeating the do-while statement.