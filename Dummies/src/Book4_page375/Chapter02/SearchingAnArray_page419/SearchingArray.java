package Book4_page375.Chapter02.SearchingAnArray_page419;

import java.util.Arrays;

/**
 * The type Searching array.
 */
public class SearchingArray {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
      /*  int lucky = 13x;
        int foundAt = -1;
        for (int i = 0; i < lotto.length; i++)
            if (lotto[i] == lucky)
                foundAt = i;
        if (foundAt > -1)
            System.out.print("My number came up!");
        else
            System.out.print("I'm not lucky today.");
       */

        // Short method:
        int lucky = 13;
        int[] lotto = new int[0];
        int foundAt = Arrays.binarySearch(lotto, lucky);
        if (foundAt > -1)
            System.out.print("My number came up!");
        else
            System.out.print("I'm not lucky today.");
        System.out.println(lotto);
        System.out.println(lucky);
    }
}
