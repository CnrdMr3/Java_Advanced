package Book2_page65.Chapter03.NumbersAndExpressions.RandomNumbers;

/**
 * The type Creating random numbers.
 */
public class CreatingRandomNumbers {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int low = 0;
        int high = 10;
        int rnd = (int)(Math.random() * (high - low + 1)) + low;
        System.out.println(rnd);
    }
}
