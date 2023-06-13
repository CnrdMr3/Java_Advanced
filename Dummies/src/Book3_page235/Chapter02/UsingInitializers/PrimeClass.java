package Book3_page235.Chapter02.UsingInitializers;

import java.util.Scanner;

/**
 * The type Prime class.
 */
public class PrimeClass {
    private Scanner sc = new Scanner(System.in);
	/**
	 * The X.
	 */
	public int x;

    {
        System.out.print(
                "Enter the starting value for x: ");
        x = sc.nextInt();
    }
}
