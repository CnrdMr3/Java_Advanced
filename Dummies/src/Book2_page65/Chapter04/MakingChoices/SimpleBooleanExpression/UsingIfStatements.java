package Book2_page65.Chapter04.MakingChoices.SimpleBooleanExpression;

/**
 * The type Using if statements.
 */
public class UsingIfStatements {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        //Typical if statement:
        double salesTotal = 0;
        double commissionRate = 10.0;
        if (salesTotal > 10000.0)
            commissionRate = 0.05;
        System.out.println(commissionRate);

        //Block if statement:
       /* double salesTotal1 = 123.45;
        double commission1;
        double commissionRate1 = 20.0;
        if (salesTotal > 10000.0)
        {
            commissionRate1 = 0.05;
            commission1 = salesTotal1 * commissionRate1;
            System.out.println(commissionRate1 + " " + commission1);
        }*/
    }
}
