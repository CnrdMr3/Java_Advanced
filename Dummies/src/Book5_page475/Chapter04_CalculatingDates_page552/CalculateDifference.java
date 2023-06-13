package Book5_page475.Chapter04_CalculatingDates_page552;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * The type Calculate difference.
 */
public class CalculateDifference {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2022-11-10");
        LocalDate date2 = LocalDate.parse("2022-12-15");
        System.out.println(date1.until(date2, ChronoUnit.DAYS));

    }
}
