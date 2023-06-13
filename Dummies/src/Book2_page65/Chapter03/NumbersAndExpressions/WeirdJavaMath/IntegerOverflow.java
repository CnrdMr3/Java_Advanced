package Book2_page65.Chapter03.NumbersAndExpressions.WeirdJavaMath;

/**
 * The type Integer overflow.
 */
public class IntegerOverflow {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int a = 1000000000;
        System.out.println(a);
        a += 1000000000;
        System.out.println(a);
        a += 1000000000;
        System.out.println(a);
        a += 1000000000;
        System.out.println(a);
    }
}
