package Book2_page65.Chapter05.Loops.BreakingOutOfALoop;

/**
 * The type Dodecaphobia.
 */
public class Dodecaphobia {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = 2;
        while (number <= 20) {
            if (number == 12)
                break;
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}

// When a break statement is executed
// in a while loop, the loop ends immediately.