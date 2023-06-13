package Book4_page375.Chapter02.ArraysWithMethods_page401;

/**
 * The type Get days of week.
 */
public class GetDaysOfWeek {
	/**
	 * Get days of week string [ ].
	 *
	 * @return the string [ ]
	 */
	public static String[] getDaysOfWeek() {
        String[] days = {"Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday",
                "Friday", "Saturday"};
        return days;
    }

	/**
	 * Print string array.
	 *
	 * @param strings the strings
	 */
	public static void printStringArray(String[] strings) {
        for (String s : strings)
            System.out.println(s);

        String[] days = getDaysOfWeek();
        printStringArray(days);

    }
}
