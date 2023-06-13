package Book2_page65.Chapter08.Exceptions.CatchingExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Get integer.
 */
public class GetInteger {
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
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                System.out.print("That's not "
                        + "an integer. Try again: ");
            }
        }
    }
}
