package Book2_page65.Chapter06.SwitchStatements.CreatingCharacterCases;

import java.util.Scanner;

/**
 * The type Commission rate 3.
 */
public class CommissionRate3 {
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
        System.out.println("Enter Sales Class: ");

        double commissionRate;
        String s = sc.next();
        char salesClass = s.charAt(0);
        switch (salesClass)
        {
            case 'A':
            case 'a':
                commissionRate = 0.02;
                break;
            case 'B':
            case 'b':
                commissionRate = 0.035;
                break;
            case 'C':
            case 'c':
                commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }
        System.out.println(commissionRate);
    }
}
