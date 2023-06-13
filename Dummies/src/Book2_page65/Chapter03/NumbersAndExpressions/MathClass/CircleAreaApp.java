package Book2_page65.Chapter03.NumbersAndExpressions.MathClass;

import java.util.Scanner;

/**
 * The type Circle area app.
 */
public class CircleAreaApp {
	/**
	 * The Sc.
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args)
    {
        System.out.println(
                "Welcome to the circle area calculator.");
        System.out.print("Enter the radius of your circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * (r * r);
        System.out.println("The area is " + area);
    }
}
