package Book08_Files.Databases_page775.UsingCommandLineParameters_page784;

import java.io.File;

/**
 * The type List directory.
 */
public class ListDirectory {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			String path = args[0];
			File dir = new File(path);
			if (dir.isDirectory()) {
				File[] files = dir.listFiles();
				for (File f : files) {
					System.out.println(f.getName());
				}
			} else
				System.out.println("Not a directory.");
		}
	}
}
