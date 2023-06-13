package Book3_page235.Chapter03.UsingStaticMethods;

/**
 * The type Test class.
 */
public class TestClass {
    private  int x = 5; //Instance variable.

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
       // int y = x;
        String y = "Won't compile, main is static.";
        System.out.println(y);
    }
}
