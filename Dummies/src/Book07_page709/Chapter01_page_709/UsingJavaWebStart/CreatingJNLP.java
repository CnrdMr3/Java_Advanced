package Book07_page709.Chapter01_page_709.UsingJavaWebStart;

public class CreatingJNLP {
	/*
	To deploy a Java application via Java Web Start, you must create a JNLP file that
	contains the details needed to locate and run the application. The JNLP file is a
	small XML file that contains information such as the name of the application, a
	URL that points to the application’s JAR file, the vendor who created the application,
	the Java version the application requires, and a URL that can be used to
	download the Java runtime in case it isn’t already installed on the user’s computer.

	JNLP stands for Java Network Launch Protocol, but that won’t be on the test.

	If you aren’t already familiar with the basics of XML, you can learn about XML’s
	syntax requirements in Book 8, Chapter 5.

	Listing 1-2 shows a JNLP file named ClickMe.jnlp that can be used to run the
	ClickMe application from the website www.lowewriter.com. for the ClickMe
	application.
	 */

	public static void main(String[] args) {
		String JNLP = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<jnlp spec=\"1.0+\"\n" +
				" codebase=\"http://www.lowewriter.com/ClickMe\" →3\n" +
				" href=\"ClickMe.jnlp\"> →4\n" +
				" <information>\n" +
				" <title>ClickMe</title> →6\n" +
				" <vendor>LoweWriter</vendor> →7\n" +
				" <offline-allowed/>\n" +
				" </information>\n" +
				" <resources>\n" +
				" <!-- Application Resources -->\n" +
				" <j2se version=\"1.6+\"\n" +
				" href=\"http://www.oracle.com/technetwork/java/javase/downloads\"/>\n" +
				" <jar href=\"ClickMe.jar\" →14\n" +
				" main=\"true\" />\n" +
				" </resources>\n" +
				" <application-desc main-class=\"ClickMe\"> →17\n" +
				" </application-desc>\n" +
				" <update check=\"background\"/>\n" +
				"</jnlp>";

		System.out.println(JNLP);
	}
}
