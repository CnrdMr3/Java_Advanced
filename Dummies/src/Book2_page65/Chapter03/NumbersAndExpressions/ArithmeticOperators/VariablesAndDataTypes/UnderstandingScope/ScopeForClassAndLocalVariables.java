package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.UnderstandingScope;

/**
 * The type Scope for class and local variables.
 */
public class ScopeForClassAndLocalVariables {
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
        System.out.println("main: x = " + x);
        myMethod();
    }

	/**
	 * My method.
	 */
	public static void myMethod(){
        int y;
        y = 10;
        if(y == x + 5)
        {
            int z;
            z = 15;
            System.out.println("My Method: z = " + z);
        }
        System.out.println("My Method: x = " + x);
        System.out.println("My Method: y = " + y);
    }
}
