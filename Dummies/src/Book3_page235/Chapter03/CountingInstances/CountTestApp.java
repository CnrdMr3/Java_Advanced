package Book3_page235.Chapter03.CountingInstances;

/**
 * The type Count test app.
 */
public class CountTestApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest();
            printCount();
        }
    }

    private static void printCount() {
        System.out.println("There are now "
                + CountTest.getInstanceCount()
                + " instances of the CountTest class"
                + " \n\tand a serious amount of relentless rage!");
    }
}

/**
 * The type Count test.
 */
class CountTest {
    private static int instanceCount = 0;

	/**
	 * Instantiates a new Count test.
	 */
	public CountTest() {
        instanceCount++;
    }

	/**
	 * Gets instance count.
	 *
	 * @return the instance count
	 */
	public static int getInstanceCount() {
        return instanceCount;
    }
}
