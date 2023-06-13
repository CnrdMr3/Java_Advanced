package Book3_page235.Chapter08.WorkingWithPackages.ImportingClassesAndPackages_page354.util;

import java.util.Scanner;

/**
 * The type Console.
 */
public class Console
{
	/**
	 * The Sc.
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * Ask yor n boolean.
	 *
	 * @param prompt the prompt
	 * @return the boolean
	 */
	public static boolean askYorN(String prompt)
    {
        while (true)
        {
            String answer;
            System.out.print("\n" + prompt
                    + " (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y"))
                return true;
            else if (answer.equalsIgnoreCase("N"))
                return false;
        }
    }
}