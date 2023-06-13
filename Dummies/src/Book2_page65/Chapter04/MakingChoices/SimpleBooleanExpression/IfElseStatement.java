package Book2_page65.Chapter04.MakingChoices.SimpleBooleanExpression;

/**
 * The type If else statement.
 */
public class IfElseStatement {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        double salesTotal = 123.0;
        double commissionRate;
        if (salesTotal <= 10000.0)
            commissionRate = 0.02;
        else
            commissionRate = 0.05;
    }
}

/* Block:
double commissionRate;
if (salesTotal <= 10000.0)
{
 commissionRate = 0.02;
 level1Count++;
}
else
{
 commissionRate = 0.05;
 level2Count++;
}
 */