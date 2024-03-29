package Book2_page65.Chapter06.SwitchStatements.IfStatementsInSwitch;

import java.util.Scanner;

/**
 * The type Commission rate 2.
 */
public class CommissionRate2 {
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
        System.out.println("Enter Sales Total: ");

        double commissionRate;
        double salesTotal = sc.nextDouble();
        int salesClass = sc.nextInt();
        switch (salesClass)
        {
            case 1:
                if (salesTotal < 10000.0)
                    commissionRate = 0.01;
                else
                    commissionRate = 0.02;
                break;
            case 2:
                if (salesTotal < 10000.0)
                    commissionRate = 0.025;
                else
                    commissionRate = 0.035;
                break;
            case 3:
                if (salesTotal < 10000.0)
                    commissionRate = 0.04;
                else
                    commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }
        System.out.println(commissionRate);
    }
}
