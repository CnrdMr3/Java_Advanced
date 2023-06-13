package Book2_page65.Chapter08.Exceptions.HandlingExceptionsWithPreemptiveStrike;

import java.util.Scanner;

/**
 * The type Get integer 2.
 */
public class GetInteger2 {
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
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered " + i);
    }

	/**
	 * Get an integer int.
	 *
	 * @return the int
	 */
	public static int GetAnInteger() {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("That's not "
                    + "an integer. Try again: ");
        }
        return sc.nextInt();
    }
}
