package Book2_page65.Chapter05.Loops.InfiniteLoop;

//Avoiding an Infinite Loop, use a 'break':

/**
 * The type Dodecaphobia 2.
 */
public class Dodecaphobia2 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = 2;
        while (true) {
            if (number == 12)
                break;
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
