package Book2_page65.Chapter07.Methods.MethodsThatReturnValues;

/**
 * The type Using return type to get value.
 */
public class UsingReturnTypeToGetValue {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = getRandomNumber();
        System.out.println("The number is " + number);
    }

	/**
	 * Gets random number.
	 *
	 * @return the random number
	 */
//Method to return value.
    public static int getRandomNumber() {
        int num = (int) (Math.random() * 10) + 1;
        return num;
    }
}
