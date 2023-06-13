package Book2_page65.Chapter03.NumbersAndExpressions.FormattingNumbers;

import java.text.NumberFormat;

/**
 * The type Number format class app.
 */
public class NumberFormatClassApp {
	/**
	 * The Cf.
	 */
	static NumberFormat cf =
            NumberFormat.getNumberInstance();

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args)
    {
        printMyAllowance();
        printCostOfPaintBallGun();
    }

	/**
	 * Print my allowance.
	 */
	public static void printMyAllowance()
    {
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance: "
                + cf.format(myAllowance));
    }

	/**
	 * Print cost of paint ball gun.
	 */
	public static void printCostOfPaintBallGun()
    {
        double costOfPaintBallGun = 69.95;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("Cost of Paint Ball Gun: "
                + cf.format(costOfPaintBallGun));
    }
}
