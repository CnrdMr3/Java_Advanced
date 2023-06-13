package Book2_page65.Chapter08.Exceptions.HandlingCheckedExceptions.CatchingFileNotFoundError;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * The type File exception 2.
 */
public class FileException2 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        openFile("C:\test.txt");
    }

	/**
	 * Open file.
	 *
	 * @param name the name
	 */
	public static void openFile(String name) {
        try {
            FileInputStream f =
                    new FileInputStream(name);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
