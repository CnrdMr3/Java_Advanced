package Book4_page375.Chapter02.EnhancedForLoop_page400;

/**
 * The type Days.
 */
public class Days {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday",
                "Friday", "Saturday"};
        for (String day : days) {
            System.out.println(day);
        }
    }
}
