package Book5_page475.Chapter03_WritingOwnSorting_page530.UsingTheSortMethod;


/**
 * The type Sort.
 */
public class sort {
	/**
	 * Sort.
	 *
	 * @param low  the low
	 * @param high the high
	 */
	public static void sort(int low, int high) {
        if (low >= high)
            return;
        int p = partition(low, high);
        sort(low, p);
        sort(p + 1, high);
    }

    private static int partition(int low, int high) {
        return low;
    }
}