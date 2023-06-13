package Book07_page709.Chapter01_page_709.UsingJavaWebStart;

/**
 * The type Understanding java web start.
 */
public class UnderstandingJavaWebStart {
	/*
	Java Web Start works by providing a web link to a special file called a JNLP file.
	This file contains all the information necessary to download and launch a Java
	application on an end user’s computer. When the user clicks the link to the JNLP
	file, the web server reads the contents of the JNLP file, downloads the Java program,
	and runs it on the user’s computer.

	With Java Web Start, the Java program does not run within the user’s web browser
	environment. Instead, Java Web Start runs the Java Virtual Machine (JVM) locally
	on the user’s computer, and then runs the application within the JVM.

	An older technology called applets allows Java programs to run directly within a
	web browser. Doing so requires the assistance of a browser plugin, which can lead
	to compatibility issues between different plugin versions. Browser manufacturers have
	recently announced that they will no longer include plugins to support
	applets, and Oracle officially deprecated applets in Java 9.

	If the user’s computer does not have the Java runtime installed (or has an
	incorrect version of the runtime), Java Web Start offers to download and install
	the Java  runtime automatically. As a result, even if the user doesn't have Java
	installed, the user can install Java and run the Java application with just a few
	mouse clicks.

	Ordinarily, applications that run via Java Web Start are prevented from performing certain operations that might create security risks for the user, such as reading
	and writing files on the user’s file system or accessing the user’s local network.
	You can configure Java Web Start security features to allow these types of activity,
	but doing so is beyond the scope of this book. For more information, search the
	web for Java Web Start.

	The general process for setting up an application to run with Java Web Start is as
	follows:
	 */

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		String one = "1. Create a JAR file that contains the Java application you want to run via\n\t" +
				"Java Web Start.";

		String two = "2. Create a JNLP file that specifies the necessary information to enable the\n\t\t" +
				"program to run from Java Web Start.";
		/*
		Among other things, the JNLP file must contain the location of the application’s
		JAR file. For the application illustrated in this chapter, we’ll name the JNLP file
		clickme.jnlp.

		For more information about creating a JNLP file, see the next section.
		 */

		String three = "3. Create an HTML file that contains a link to the JNLP file.";
		/*
		The HTML file will be displayed in the user’s browser. When the user clicks the
		link to the JNLP file, the application defined in the JNLP file is run. For this
		chapter, the HTML file will be named clickme.html.
		 */

		String four = "4. Copy the JAR, JNLP, and HTML files to the appropriate folders on the\n\t\t\t\t" +
				"web server.";
		/*
		You can use any FTP client (such as FileZilla) to upload the files to your web
		server, or you can use your web host’s file management utilities to upload the
		files. In most cases, the JAR, JNLP, and HTML file will all reside in the same
		folder on the web server. However, it is possible to save each of the files to a
		different folder.
		 */

		System.out.println(one + "\n\t" + two + "\n\t\t" + three + "\n\t\t\t" + four);
	}
}
