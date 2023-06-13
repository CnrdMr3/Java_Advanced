package Book5_page475.Chapter02_RegularExpressions_page506;

import java.util.regex.*;
import java.util.Scanner;

/**
 * The type Regular expressions test.
 */
public final class RegularExpressionsTest {
	/**
	 * The R.
	 */
	static String r, /**
	 * The S.
	 */
	s;
	/**
	 * The Pattern.
	 */
	static Pattern pattern;
	/**
	 * The Matcher.
	 */
	static Matcher matcher;
	/**
	 * The Match.
	 */
	static boolean match, /**
	 * The Valid regex.
	 */
	validRegex, /**
	 * The Done matching.
	 */
	doneMatching;
    private static Scanner sc =
            new Scanner(System.in);

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        System.out.println("Welcome to the "
                + "Regex Tester\n");
        do {
            do {
                System.out.print("\nEnter regex: ");
                r = sc.nextLine();
                validRegex = true;
                try {
                    pattern = Pattern.compile(r);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    validRegex = false;
                }
            } while (!validRegex);
            doneMatching = false;
            while (!doneMatching) {
                System.out.print("Enter string: ");
                s = sc.nextLine();
                if (s.length() == 0)
                    doneMatching = true;
                else {
                    matcher = pattern.matcher(s);
                    if (matcher.matches())
                        System.out.println("Match.");

                    else
                        System.out.println(
                                "Does not match.");
                }
            }
        } while (askAgain());
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y"))
            return true;
        return false;
    }
}
