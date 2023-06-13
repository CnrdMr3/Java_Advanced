package Book3_page235.Chapter04.ThisAndSuperInSubclasses;

/**
 * The type Ball.
 */
public class Ball {
    private int velocity;

	/**
	 * Sets velocity.
	 *
	 * @param velocity the velocity
	 */
	public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

	/**
	 * Hit.
	 */
	public void hit() {
        System.out.println("You hit it a mile!");
    }
}

/**
 * The type Base ball.
 */
class BaseBall extends Ball {
    public void hit() {
        System.out.println("You tore the cover off!");
        super.hit();
    }
}

