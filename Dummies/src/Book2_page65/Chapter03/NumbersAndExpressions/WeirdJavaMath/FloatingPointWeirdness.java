package Book2_page65.Chapter03.NumbersAndExpressions.WeirdJavaMath;

import java.text.NumberFormat;

/**
 * The type Floating point weirdness.
 */
public class FloatingPointWeirdness {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        //Float or Double can't accurately predict 0.1
        float x = 0.1f;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(x));
    }
}
