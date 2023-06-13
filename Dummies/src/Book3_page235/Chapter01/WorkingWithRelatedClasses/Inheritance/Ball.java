package Book3_page235.Chapter01.WorkingWithRelatedClasses.Inheritance;

/**
 * The type Ball.
 */
public class Ball {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        SoftBall mySoftBallObject = new SoftBall();
        mySoftBallObject.aBall1();

        BaseBall myBaseBallObject = new BaseBall();
        myBaseBallObject.aBall2();
    }
}
