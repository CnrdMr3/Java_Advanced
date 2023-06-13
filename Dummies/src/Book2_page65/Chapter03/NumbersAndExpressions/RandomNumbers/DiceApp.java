package Book2_page65.Chapter03.NumbersAndExpressions.RandomNumbers;

/**
 * The type Dice app.
 */
public class DiceApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args)
    {
        int roll;
        String msg = "Here are 100 random rolls of the dice:";
        System.out.println(msg);
        for (int i=0; i<100; i++)
        {
            roll = randomInt(1, 6);
            System.out.print(roll + " ");
        }
        System.out.println();
    }

	/**
	 * Random int int.
	 *
	 * @param low  the low
	 * @param high the high
	 * @return the int
	 */
	public static int randomInt(int low, int high) {
        int result = (int) (Math.random()
                * (high - low + 1)) + low;
        return result;
    }
}
