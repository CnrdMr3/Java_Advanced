package Book2_page65.Chapter07.Methods.DeclaringParameters;

/**
 * The type Declaring parameters.
 */
public class DeclaringParameters {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = getRandomNumber(10, 100);
        System.out.println("Number is: " + number);
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
