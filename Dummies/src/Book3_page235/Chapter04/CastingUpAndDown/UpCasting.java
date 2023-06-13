package Book3_page235.Chapter04.CastingUpAndDown;

/**
 * The type Up casting.
 */
public class UpCasting {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Ball x = new Ball();
        SoftBall a = new SoftBall();
        BaseBall b = new BaseBall();
        b.hit(b);
        a.hit(a);
        b.toss(b);
        Ball y = new BaseBall();
        y.toss((BaseBall) y);
    }
}
