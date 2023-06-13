package Book2_page65.Chapter03.NumbersAndExpressions.WeirdJavaMath;

/**
 * The type Na n.
 */
public class NaN {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        double x = Math.sqrt(-50); // Not a number
        double y = x;
        if (x == y)
            System.out.println("x equals y");
    }
}
