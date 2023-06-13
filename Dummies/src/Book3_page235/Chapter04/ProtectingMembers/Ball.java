package Book3_page235.Chapter04.ProtectingMembers;

/**
 * The type Ball.
 */
public class Ball {
    private double weight;

	/**
	 * Gets weight.
	 *
	 * @return the weight
	 */
	protected double getWeight()
    {
        return this.weight;
    }

	/**
	 * Sets weight.
	 *
	 * @param weight the weight
	 */
	protected void setWeight(double weight)
    {
        this.weight = weight;
    }
}
