package Book5_page475.Chapter03_UsingRecursion_page523.NonRecursiveFactorial_page524;

/**
 * The type Non recursive factorial.
 */
public class NonRecursiveFactorial {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int n = 5;
        long fact;
        fact = factorial(n);
        System.out.println("The factorial of "+ n + " is "
                + fact + ".");
    }
    private static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }
}
