package Book2_page65.Chapter05.Loops.InfiniteLoop;

/**
 * The type Count forever.
 */
public class CountForever {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = 2;
        while (true) {
            System.out.print(number + " ");
            number += 2;
        }
    }
}

//Infinite Loop = specify true for the while expression.
