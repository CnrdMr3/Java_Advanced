package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.Strings.InitializingVariables;

/* This code won't compile.

public class testApp
{
 public static void main(String[] args)
 {
 int i;
 System.out.println("The value of i is " + i);
 }
}

!You must initialize local variables before you use them.

 */

/**
 * The type Test app.
 */
public class TestApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
    int i;
    i = 5;

    System.out.println("The value of i is " + i);
  }
}
