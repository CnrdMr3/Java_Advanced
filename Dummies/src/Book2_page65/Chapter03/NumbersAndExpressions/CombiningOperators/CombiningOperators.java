package Book2_page65.Chapter03.NumbersAndExpressions.CombiningOperators;

/**
 * The type Combining operators.
 */
public class CombiningOperators {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int d1 = a * b / c; // d1 is 4
        int d2 = a * (b / c); // d2 is 0
        System.out.println(d1 + " " + d2);
    }
}
