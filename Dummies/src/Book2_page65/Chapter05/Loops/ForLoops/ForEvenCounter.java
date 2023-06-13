package Book2_page65.Chapter05.Loops.ForLoops;

/**
 * The type For even counter.
 */
public class ForEvenCounter {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {

        for (int number = 2; number <= 20; number += 2)
            System.out.print(number + " ");
        System.out.println();
    }
}