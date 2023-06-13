package Book2_page65.Chapter06.SwitchStatements.IntentionallyLeavingOutBreakInSwitch;

import java.util.Scanner;

/**
 * The type Car wash app 2.
 */
public class CarWashApp2
{
	/**
	 * The Sc.
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        System.out.println
                ("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        char p = s.charAt(0);
        String details = "";
        switch (p)
        {
            case 'E':
            case 'e':
                details = packageE() + packageD() + packageC()
                        + packageB() + packageA();
                break;
            case 'D':
            case 'd':
                details = packageD() + packageC()
                        + packageB() + packageA();
                break;
            case 'C':
            case 'c':
                details = packageC() + packageB()
                        + packageA();
                break;
            case 'B':
            case 'b':
                details = packageB() + packageA();
                break;
            case 'A':
            case 'a':
                details = packageA();
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }

	/**
	 * Package a string.
	 *
	 * @return the string
	 */
	public static String packageA()
    {
        return "\tWash, vacuum, and hand dry.\n";
    }

	/**
	 * Package b string.
	 *
	 * @return the string
	 */
	public static String packageB() {
        return "\tWax, plus ... \n";
    }

	/**
	 * Package c string.
	 *
	 * @return the string
	 */
	public static String packageC()
    {
        return "\tLeather/Vinyl Treatment, plus ... \n";
    }

	/**
	 * Package d string.
	 *
	 * @return the string
	 */
	public static String packageD()
    {
        return "\tTire Treatment, plus ... \n";
    }

	/**
	 * Package e string.
	 *
	 * @return the string
	 */
	public static String packageE()
    {
        return "\tNew Car Scent, plus ... \n";
    }
}

//Error fixed for app1.
