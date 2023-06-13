package Book2_page65.Chapter05.Loops.ForLoops.BreakingAndContinuingForLoops;

/**
 * The type For dodecaphobia.
 */
public class ForDodecaphobia {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        for (int number = 2; number <=20; number += 2) {
            if (number == 12)
                break;
            System.out.print(number + " ");
        }
        System.out.println();
    }
}