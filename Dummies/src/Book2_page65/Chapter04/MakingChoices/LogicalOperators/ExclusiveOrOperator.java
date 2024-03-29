package Book2_page65.Chapter04.MakingChoices.LogicalOperators;

/**
 * The type Exclusive or operator.
 */
public class ExclusiveOrOperator {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int switch1 = 0;
        int switch2 = 0;

/*        if ( switch1 == switch2 )
            System.out.println("Trouble! The switches are the same");
        else
            System.out.println("OK, the switches are different.");

 */
        if ((switch1==1)^(switch2==-1))
            System.out.println("OK, the switches are different.");
        else
            System.out.println("Trouble! The switches are the same");
    }
}
