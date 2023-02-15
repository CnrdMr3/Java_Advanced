package Book07_page709.Chapter01_page_709.UsingJavaWebStart;

public class HtmlFileToLaunchJavaApp {
	/*
	Once you’ve created a JNLP file that describes your Java Web Start application, you
	can create an HTML file that your users can view to launch the application. The
	HTML file should have a link to the JNPL file. The easiest way to provide that link
	is to use a element in the HTML file, as shown in the ClickMe.html file shown
	in Listing 1-3.
	 */

	public static void main(String[] args) {
		// An HTML File That Links to a JNPL File
		String HTML = "<html>\n" +
				" <head>\n\t" +
				" <title>ClickMe (Java Web Start)</title>\n" +
				" </head>\n\t" +
				" <body>\n\t\t" +
				" <h1>ClickMe!</h1>\n\t\t\t" +
				" <a href=ClickMe.jnlp>Run the ClickMe application</a>\n\t\t" +
				" </body>\n" +
				"</html>\n";

		System.out.println(HTML);

		/*
		In Listing 1-3, the element provides the necessary link:
		>> <a href-clickme.jnlp>Run the ClickMe application</a>
		Figure 1-2 shows how the ClickMe.html file appears when displayed in a browser window.
		 */
	}
}
