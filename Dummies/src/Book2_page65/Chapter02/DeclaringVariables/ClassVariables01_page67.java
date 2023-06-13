package Book2_page65.Chapter02.DeclaringVariables;

/**
 * The type Class variables 01 page 67.
 */
// Example 01
// Declaring class variable at beginning of class
public class ClassVariables01_page67 {

	/**
	 * The Hello message.
	 */
	static String helloMessage;

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage);
    }
}
