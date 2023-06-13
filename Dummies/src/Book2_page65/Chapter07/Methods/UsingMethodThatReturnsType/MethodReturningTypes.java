package Book2_page65.Chapter07.Methods.UsingMethodThatReturnsType;

/**
 * The type Method returning types.
 */
public class MethodReturningTypes {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = getRandomNumber();
        System.out.println("Number is: " + number);
    }

	/**
	 * Gets random number.
	 *
	 * @return the random number
	 */
	public static int getRandomNumber() {
        int num;
        while (true) {
            num = (int) (Math.random() * 20) + 1;
            if (num != 12)
                return num;
        }
    }
}

