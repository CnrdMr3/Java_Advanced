package Book2_page65.Chapter04.MakingChoices.LogicalOperators;

/**
 * The type Using the and operator.
 */
public class UsingTheAndOperator {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        double salesClass = 1.0;
        double salesTotal = 1000.0;
        double commissionRate;

        if ((salesClass == 1.0) && (salesTotal >= 10000.0)) {
            commissionRate = 0.025;
            System.out.println(commissionRate);
        }
    }
}
