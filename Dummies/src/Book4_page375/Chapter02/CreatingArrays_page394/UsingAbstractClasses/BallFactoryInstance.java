package Book4_page375.Chapter02.CreatingArrays_page394.UsingAbstractClasses;

/**
 * The type Ball factory instance.
 */
abstract class BallFactoryInstance extends Ball {
	/**
	 * Gets ball.
	 *
	 * @param s the s
	 * @return the ball
	 */
	public static Ball getBall(String s) {
        if (s.equalsIgnoreCase("BaseBall"))
            return new BaseBall();
        if (s.equalsIgnoreCase("SoftBall"))
            return new SoftBall();
        return null;
    }
}
