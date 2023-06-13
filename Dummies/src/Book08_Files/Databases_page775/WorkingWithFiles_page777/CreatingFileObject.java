package Book08_Files.Databases_page775.WorkingWithFiles_page777;

import java.io.File;

/**
 * The type Creating file object.
 */
public class CreatingFileObject {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		/*
		To create a File object, you call the File constructor,
		passing a string representing the filename as a parameter. Here’s an example:
		 */

		File f = new File("hits.log");

		/*
		Here the file’s name is hits.log, and it lives in the current directory,
		which usually is the directory from which the Java Virtual Machine (JVM) was started.
		If you don’t want the file to live in the current directory, you can supply a complete
		pathname in the parameter string. You’re now entering one of the few
		areas of Java that becomes system-dependent, however, because the way you
		write pathname depends on the operating system you’re using. The pathname
		c:\logs\hits.log is valid for Windows systems, for example, but not on Unix or
		Macintosh systems, which don’t use drive letters and use forward slashes instead
		of backslashes to separate directories.
		If you hard-code pathname as string literals, the backslash character is the
		escape character for Java strings. Thus, you must code two backslashes to get one
		backslash in the pathname. You must code the path c:\logs\hits.log like this:
		 */

		// REMEMBER:
		String path = "c:\\logs\\hits.log";
	}
}
