package Book2_page65.Chapter03.NumbersAndExpressions.DividingIntegers;

import java.util.Scanner;

/**
 * The type Marbles app.
 */
public class MarblesApp {
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
        // declarations
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;

        // get the input data
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();

        // calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;

        // print the results
        System.out.println("Give each child " +
                marblesPerChild + " marbles.");
        System.out.println("You will have " +
                marblesLeftOver + " marbles left over.");


    }
}
