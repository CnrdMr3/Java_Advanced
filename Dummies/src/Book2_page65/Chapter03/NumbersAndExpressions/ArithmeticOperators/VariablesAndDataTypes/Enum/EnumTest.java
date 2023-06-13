package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.Enum;

/**
 * The type Enum test.
 */
public class EnumTest {
	/**
	 * The enum Card suit.
	 */
	public enum CardSuit {
		/**
		 * Hearts card suit.
		 */
		HEARTS,
		/**
		 * Spades card suit.
		 */
		SPADES,
		/**
		 * Clubs card suit.
		 */
		CLUBS,
		/**
		 * Diamonds card suit.
		 */
		DIAMONDS}

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEARTS;
        System.out.println("The suit is " + suit);
    }
}
