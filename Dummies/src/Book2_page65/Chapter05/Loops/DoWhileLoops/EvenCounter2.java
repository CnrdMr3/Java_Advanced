package Book2_page65.Chapter05.Loops.DoWhileLoops;

/**
 * The type Even counter 2.
 */
public class EvenCounter2 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = 2;
        do {
            System.out.print(number + " ");
            number += 2;
        } while (number <= 20);
        System.out.println();
    }
}
