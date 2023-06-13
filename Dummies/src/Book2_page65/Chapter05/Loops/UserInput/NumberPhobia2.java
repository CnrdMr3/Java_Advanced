package Book2_page65.Chapter05.Loops.UserInput;

import java.util.Scanner;

/**
 * The type Number phobia 2.
 */
public class NumberPhobia2 {
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
        String input = "Y";
        while (input.equalsIgnoreCase("Y")) {
            System.out.println(number + " ");
            System.out.print
                    ("Do you want to keep counting?"
                            + " (Y or N)");
            input = sc.next();
            number += 2;
        }
        System.out.println("\nWhew! That was close.");
    }
}