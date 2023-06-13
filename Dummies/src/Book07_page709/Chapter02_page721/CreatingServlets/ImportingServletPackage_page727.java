package Book07_page709.Chapter02_page721.CreatingServlets;

/**
 * The type Importing servlet package page 727.
 */
public class ImportingServletPackage_page727 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		/*
		Most servlets need access to at least three packages:
		 1. javax.servlet, javax.
		 2. servlet.http
		 3. java.io
		 As a result, you usually start with these import statements:
		 */

		String String1 = "import java.io.*;";
		String String2 = "import javax.servlet.*;";
		String String3 = "import javax.servlet.http.*;";

		System.out.println(String1 + String2 + String3);
	}
}
