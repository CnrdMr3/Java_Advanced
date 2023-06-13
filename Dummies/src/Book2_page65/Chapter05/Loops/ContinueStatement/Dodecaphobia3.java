package Book2_page65.Chapter05.Loops.ContinueStatement;

/**
 * The type Dodecaphobia 3.
 */
public class Dodecaphobia3 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = 0;
        while (number < 20) {
            number += 2;
            if (number == 12)
                continue;
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

//Instead of stopping the loop like the 'break',
//the 'continue' statement just iterates over 12.