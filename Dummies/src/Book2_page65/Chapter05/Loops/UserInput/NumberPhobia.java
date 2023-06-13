package Book2_page65.Chapter05.Loops.UserInput;

import java.util.Scanner;

/**
 * The type Number phobia.
 */
public class NumberPhobia {
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
        int number = 2;
        String input;
        while (true) {
            System.out.println(number + " ");
            System.out.print
                    ("Do you want to keep counting?"
                            + " (Y or N)");
            input = sc.next();
            if (input.equalsIgnoreCase("N"))
                break;
            number += 2;
        }
        System.out.println("\nWhew! That was close.\n");
    }
}
