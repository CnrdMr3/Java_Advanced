package Book5_page475.Chapter04_ComparingDates_page552;

import java.time.LocalDate;

/**
 * The type Is equal.
 */
public class isEqual {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {

        if (LocalDate.now().isEqual(LocalDate.now()))
            System.out.println("All is right in the universe.");

        if (LocalDate.now().getDayOfMonth() < 5)
            System.out.println("It is not yet the 15th.");
    }
}
