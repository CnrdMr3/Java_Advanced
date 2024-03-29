package Book2_page65.Chapter03.NumbersAndExpressions.FormattingNumbers;

import java.text.NumberFormat;

/**
 * The type Formatting numbers.
 */
public class FormattingNumbers {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        double salesTax = 2.425;
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println(cf.format(salesTax));

        //Formatting to 3 decimals
        double x = 19923.3288;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(3);
        nf.setMaximumFractionDigits(3);
        System.out.println(nf.format(x));

        //Percentage Format
        double grade = .92;
        NumberFormat pf = NumberFormat.getPercentInstance();
        System.out.println(pf.format(grade));
    }
}
