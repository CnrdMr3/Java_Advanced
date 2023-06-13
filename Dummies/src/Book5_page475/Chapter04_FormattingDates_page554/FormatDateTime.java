package Book5_page475.Chapter04_FormattingDates_page554;

import java.lang.String;
import java.util.*;
import java.time.*;
import java.time.format.*;

/**
 * The type Format date time.
 */
public class FormatDateTime {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        printDate(now, "YYYY-MM-dd");
        printDate(now, "MM-dd-YYYY");
        printDate(now, "dd MMM YYYY");
        printDate(now, "MMMM d, YYYY");
        printDate(now, "HH:mm");
        printDate(now, "h:mm a");
    }

	/**
	 * Print date.
	 *
	 * @param date    the date
	 * @param pattern the pattern
	 */
	public static void printDate(LocalDateTime date, String pattern) {
        DateTimeFormatter f;
        f = DateTimeFormatter.ofPattern(pattern);
        pattern = (pattern + "              ").substring(0, 14);
        System.out.println(pattern + " " + date.format(f));
    }
}