package Book5_page475.Chapter01_ExtendingThreads_page478;

/**
 * The type Count down app.
 */
public class CountDownApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Thread clock = new CountDownClock();
        clock.start();
    }
}
