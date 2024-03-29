package Book2_page65.Chapter07.Methods.MethodsThatTakeParameters;

/**
 * The type Method with parameters.
 */
public class MethodWithParameters {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = getRandomNumber(1, 10);
        System.out.println("Number is: " + number);
    }

	/**
	 * Gets random number.
	 *
	 * @param i  the
	 * @param i1 the 1
	 * @return the random number
	 */
	public static int getRandomNumber(int i, int i1) {
        int num;
        while (true) {
            num = (int) (Math.random() * 10) + 1;
            if (num != 6)
                return num;
        }
    }
}

