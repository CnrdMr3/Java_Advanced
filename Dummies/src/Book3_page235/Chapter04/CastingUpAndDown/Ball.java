package Book3_page235.Chapter04.CastingUpAndDown;

/**
 * The type Ball.
 */
public class Ball {
	/**
	 * Hit.
	 *
	 * @param x the x
	 */
	public void hit(Ball x){
        System.out.println(x.getClass().getSimpleName() + " I'm being hit.");
    }

	/**
	 * Toss.
	 *
	 * @param b the b
	 */
	public void toss(BaseBall b) {
        System.out.println("I am a baseball being thrown.");
    }
}
