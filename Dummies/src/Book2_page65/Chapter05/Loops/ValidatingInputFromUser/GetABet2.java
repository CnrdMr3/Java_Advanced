package Book2_page65.Chapter05.Loops.ValidatingInputFromUser;

import java.util.Scanner;

/**
 * The type Get a bet 2.
 */
public class GetABet2 {
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
        System.out.println
                ("You can bet between 1 and " + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            if ( (bet <= 0) || (bet > bank) )
                System.out.println
                        ("What, are you crazy?");
        } while ( (bet <= 0) || (bet > bank) );
        System.out.println("Your money's good here.");
    }
}

//Use if-statement and || to print a second line.