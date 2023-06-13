package Book2_page65.Chapter05.Loops.ForLoops.OmittingExpression;

import java.util.Scanner;

/**
 * The type Omitting three expressions.
 */
public class OmittingThreeExpressions {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where should I start? ");
        int a = sc.nextInt();
        for ( ; a >= 0; a--)
            System.out.println(a);
        for(;;)
            System.out.println("Oops");
    }
}

//This creates an Infinite Loop.