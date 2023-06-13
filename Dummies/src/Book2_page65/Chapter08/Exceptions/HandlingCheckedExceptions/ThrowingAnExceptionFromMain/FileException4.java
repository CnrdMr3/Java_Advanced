package Book2_page65.Chapter08.Exceptions.HandlingCheckedExceptions.ThrowingAnExceptionFromMain;

import java.io.FileNotFoundException;

/**
 * The type File exception 4.
 */
public class FileException4 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 * @throws FileNotFoundException the file not found exception
	 */
	public static void main(String[] args)
            throws FileNotFoundException
    {
        openFile4("C:\test.txt");
    }

    private static void openFile4(String s) {
    }
}
