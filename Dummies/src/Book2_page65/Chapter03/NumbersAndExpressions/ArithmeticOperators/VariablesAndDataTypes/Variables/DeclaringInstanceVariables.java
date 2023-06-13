package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.Variables;

/**
 * The type Declaring instance variables.
 */
public class DeclaringInstanceVariables {
	/**
	 * The Hello message.
	 */
	static String helloMessage; // error -- should use static keyword

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args)
    {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage); // will not compile
    }
}
