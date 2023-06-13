package Book2_page65.Chapter07.Methods.ScopingOutParameters;

/**
 * The type Parameter scope.
 */
public class ParameterScope {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int min = 10;
        int max = 100;
        int number = getRandomNumber(min, max);
        System.out.println(number);
    }

	/**
	 * Gets random number.
	 *
	 * @param min the min
	 * @param max the max
	 * @return the random number
	 */
	public static int getRandomNumber(int min, int max) {
        return (int) (Math.random()
                * (max - min + 1)) + min;
    }
}
