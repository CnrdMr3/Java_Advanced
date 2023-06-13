package Book2_page65.Chapter05.Loops.BasicWhileLoop;

/**
 * The type Even counter.
 */
public class EvenCounter {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = 2;
        while (number <= 20) {
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
