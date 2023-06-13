package Book2_page65.Chapter08.Exceptions.ThrowingOwnExceptions;

/**
 * The type My exception.
 */
public class MyException {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        try {
            doSomething(true);
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

	/**
	 * Do something.
	 *
	 * @param t the t
	 * @throws Exception the exception
	 */
	public static void doSomething(boolean t)
            throws Exception {
        if (t)
            throw new Exception();
    }
}
