package Book2_page65.Chapter07.Methods.UsingPassByValue;

/**
 * The type Change parameters.
 */
public class ChangeParameters {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int number = 1;
        tryToChangeNumber(number);
        System.out.println(number);
    }

	/**
	 * Try to change number.
	 *
	 * @param i the
	 */
	public static void tryToChangeNumber(int i) {
        i = 2;
    }
}
