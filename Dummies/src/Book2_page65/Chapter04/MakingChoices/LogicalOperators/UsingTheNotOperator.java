package Book2_page65.Chapter04.MakingChoices.LogicalOperators;

/**
 * The type Using the not operator.
 */
public class UsingTheNotOperator {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        //The Not operator reverses the value of a boolean expression.
        boolean yes = true;

        if(yes == false){
            System.out.println("true");
        } else {
            if(yes != false){
                System.out.println("false");
            }
        }

    }
}
