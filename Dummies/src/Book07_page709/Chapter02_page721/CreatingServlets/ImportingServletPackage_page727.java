package Book07_page709.Chapter02_page721.CreatingServlets;

public class ImportingServletPackage_page727 {
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
