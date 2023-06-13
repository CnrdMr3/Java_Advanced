package Book2_page65.Chapter04.MakingChoices.SimpleBooleanExpression;

/**
 * The type Nested if statements example 2.
 */
public class NestedIfStatementsExample2 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int salesClass = 1;
        double salesTotal = 1234.0;
        double commissionRate;

        if (salesTotal < 10000)
        {
            if (salesClass == 1)
                commissionRate = 0.02;
        }
        else
        {
            if (salesClass == 1)
                commissionRate = 0.025;
        }
    }
}
