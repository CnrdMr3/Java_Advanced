package Book2_page65.Chapter04.MakingChoices.LogicalOperators;

/**
 * The type Using or operators.
 */
public class UsingOrOperators {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        double salesTotal = 1000.0;
        int salesClass = 1;
        double commissionRate;

        // if ((salesTotal < 1000.0) | (salesClass == 3))
        //    commissionRate = 0.0;

        // Rather use ||

        if ((salesTotal < 1000.0) || (salesClass == 3))
            commissionRate = 0.0;
    }
}
