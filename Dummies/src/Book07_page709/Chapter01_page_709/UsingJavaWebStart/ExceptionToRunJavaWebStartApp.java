package Book07_page709.Chapter01_page_709.UsingJavaWebStart;

/**
 * The type Exception to run java web start app.
 */
public class ExceptionToRunJavaWebStartApp {
	/*
	In some cases, Java’s security settings may prevent a Java Web Start application
	from running. If that happens, the user can correct the problem by adding the URL
	of the application to the Java Exception Site List. Here are the steps for doing that
	on a Windows computer:
	 */

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		String one = "1. Open the Java Control Panel.\n\t" +
					 "The easiest way to do that is to press the Start button, type java, press Enter,\n\t" +
					 "and then click Configure Java.\n\t" +
					 "Figure 1-5 shows the Java Control Panel for Java 9 (previous versions are similar).\n\n";

		String two = "2. Click the Web Settings tab.\n\t" +
					 "Because you’re changing a security setting, you might think you’d need to click\n\t" +
					 "the Security tab. But the Exception Site List is found on the Web Settings tab, as\n\t" +
					 "shown in Figure 1-6.\n\n";

		String three = "3. Click Add.\n\t" +
					   "This pops up a text entry box in which you can enter a URL.\n\n";

		String four = "4. Type the URL of the web site you want to add and press Enter.\n\t" +
				"In this example, type http://www.lowewriter.com. The URL will be added to\n\t" +
				"the exception list.\n\n";

		String five = "5. Click OK to close the Java Control Panel.\n\t" +
				"You should now be able to run the application via Java Web Start.";

		System.out.println(one + " " + two + " " + three + " " + four + " " + five);
	}
}
