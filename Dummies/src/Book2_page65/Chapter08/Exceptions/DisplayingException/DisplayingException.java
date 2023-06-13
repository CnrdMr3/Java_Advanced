package Book2_page65.Chapter08.Exceptions.DisplayingException;

//java.lang.ArithmeticException;

/**
 * The type Displaying exception.
 */
public class DisplayingException {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace(System.out);
        }
    }
}
