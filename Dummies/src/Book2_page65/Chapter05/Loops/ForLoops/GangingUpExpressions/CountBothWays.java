package Book2_page65.Chapter05.Loops.ForLoops.GangingUpExpressions;

/**
 * The type Count both ways.
 */
public class CountBothWays {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int a, b;

        for(a = 1, b = 10; a <= 10; a++, b--)
            System.out.println(a + " " + b);
    }
}
