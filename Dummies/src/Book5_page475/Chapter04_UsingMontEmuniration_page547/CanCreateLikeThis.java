package Book5_page475.Chapter04_UsingMontEmuniration_page547;

import java.time.LocalDate;
import java.time.Month;

/**
 * The type Can create like this.
 */
public class CanCreateLikeThis {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.DECEMBER,15);

        System.out.println(date);

        /*
        Interestingly, the Month enumeration has some interesting methods which you
        might find occasionally useful. For example, you can print the number of days in
        December like this:
         */

        System.out.println("December hath "
                + Month.DECEMBER.length(false) + " days.");
    }
}
