package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.Strings;

/**
 * The type Combining strings.
 */
public class CombiningStrings {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        String hello = "Hello";
        String world = "World!";
        String helloWorld = hello + world;
        System.out.println(hello + " " + world + " " + helloWorld);

        // Example of different concat:
        String hello2 = "Hello";
        String world2 = "World!";
        String greeting = hello2 + "," + world2;
        System.out.println(hello2 + " " + world2 + " " + greeting);
    }
}
