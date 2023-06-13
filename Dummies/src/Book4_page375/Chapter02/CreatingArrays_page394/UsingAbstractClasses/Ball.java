package Book4_page375.Chapter02.CreatingArrays_page394.UsingAbstractClasses;

/**
 * The type Ball.
 */
public abstract class Ball {
	/**
	 * Hit int.
	 *
	 * @param batSpeed the bat speed
	 * @return the int
	 */
	public abstract int hit(int batSpeed);

    //Ball b = new Ball(); // error: Ball is abstract

    private String userChoice;
	/**
	 * The B.
	 */
	Ball b = BallFactoryInstance.getBall(userChoice);

}
