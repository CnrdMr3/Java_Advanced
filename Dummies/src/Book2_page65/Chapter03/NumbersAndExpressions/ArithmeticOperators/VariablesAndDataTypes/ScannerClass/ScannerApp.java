package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.ScannerClass;

import java.util.Scanner;
// When using other packages in 'java.util.' use 'java.util.*;

/**
 * The type Scanner app.
 */
public class ScannerApp {
	/**
	 * The Sc.
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        System.out.println("You entered " + x + ".");
    }
}
