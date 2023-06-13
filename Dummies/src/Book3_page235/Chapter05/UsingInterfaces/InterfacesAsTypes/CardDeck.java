package Book3_page235.Chapter05.UsingInterfaces.InterfacesAsTypes;

/**
 * The type Card deck.
 */
public class CardDeck implements Dealable{
	/**
	 * The D.
	 */
	Dealable d = new CardDeck();

	/**
	 * Deal.
	 *
	 * @param cards the cards
	 */
	@Override
    public void deal(int cards) {

    }
}
