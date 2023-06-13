package Book2_page65.Chapter08.Exceptions.CatchingExceptions;

/**
 * The type Divide by zero.
 */
public class DivideByZero {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int a = 5;
        int b = 0; // you know this won't work
        try {
            int c = a / b; // but you try it anyway
        } catch (ArithmeticException c) {
            System.out.println("Oops, you can't "
                    + "divide by zero.");
        }
    }
}
