package Book2_page65.Chapter02.DeclaringLocalVariables;

/**
 * The type Error.
 */
public class Error {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {

        //Add String for helloMessage:

        String helloMessage;
        helloMessage = "Hello, World!"; // error -- helloMessage
        System.out.println(helloMessage); // is not yet declared
    }
}
