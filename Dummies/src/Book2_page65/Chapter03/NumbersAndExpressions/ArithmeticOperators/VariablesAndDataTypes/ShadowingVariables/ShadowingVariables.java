package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.ShadowingVariables;

/* A shadowed variable is a variable that would otherwise be accessible but is temporarily
   made unavailable because a variable with the same name has been declared
   in a more immediate scope.
*/

/**
 * The type Shadowing variables.
 */
public class ShadowingVariables {
	/**
	 * The X.
	 */
	static int x;

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x);
        int x;
        x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowingVariables.x = " + ShadowingVariables.x);
    }
}
