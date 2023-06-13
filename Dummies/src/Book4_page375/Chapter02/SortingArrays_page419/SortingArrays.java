package Book4_page375.Chapter02.SortingArrays_page419;

import java.util.Arrays;

/**
 * The type Sorting arrays.
 */
public class SortingArrays {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++)
            lotto[i] = (int)(Math.random() * 100) + 1;
        Arrays.sort(lotto);

        System.out.println(lotto);
    }
}
