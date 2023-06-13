package Book3_page235.Chapter07.UsingLambdaExpresssions_page351;

/**
 * The type Lambda ball.
 */
public class LambdaBall {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Ball b = () -> {
            System.out.print("You hit it!");
        };
        b.hit();
    }

	/**
	 * The interface Ball.
	 */
	interface Ball {
		/**
		 * Hit.
		 */
		void hit();
    }
}
