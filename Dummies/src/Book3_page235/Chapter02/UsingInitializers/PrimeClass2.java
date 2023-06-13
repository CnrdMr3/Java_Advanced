package Book3_page235.Chapter02.UsingInitializers;

import java.util.Scanner;

/**
 * The type Prime class 2.
 */
public class PrimeClass2 {
    private Scanner sc = new Scanner(System.in);
	/**
	 * The X.
	 */
	public int x = getX();

    private int getX() {
        System.out.print("Enter the starting value "
                + "for x: ");
        return sc.nextInt();
    }
}
