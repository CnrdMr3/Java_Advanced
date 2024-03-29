package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.ConvertingAndCastingNumericData;

/**
 * The type Type casting.
 */
public class TypeCasting {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {

        //Converting a double to an int will cause data loss ( 3.1314 wil return 3 )

        double pi = 3.1314;
        int iPi;
        iPi = (int) pi;
        System.out.println(pi + " " + iPi);

        double price = 9.99;
        int iPrice = (int) price;
        System.out.println(price + " " + iPrice);
    }
}
