package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.Strings.InitializingVariables;

/**
 * The type Vars with initializers.
 */
public class VarsWithInitializers {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
    // In each case, the variable is both declared and initialized in a single statement.
    int x = 5;
    String lastName = "Lowe";
    double radius = 15.4;

    System.out.println(x + " " + lastName + " " + radius);
    // When you declare more than one variable in a single statement, each variable can
    // have its own initializer.
    int z = 5, y = 10;
    System.out.println(z + " " + y);
    }
}
