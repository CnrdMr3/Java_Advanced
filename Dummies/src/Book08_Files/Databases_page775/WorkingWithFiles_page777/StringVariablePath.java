package Book08_Files.Databases_page775.WorkingWithFiles_page777;

import java.io.File;

public class StringVariablePath {
	/*
	The following code snippet lists the name of every file in a directory whose path name
	 is stored in the String variable path:
	 */

	public static void main(String[] args) {
		// List of EVERY file in a directory:
		String path = new String();
		File dir = new File(path);
		if (dir.isDirectory())
		{
			File[] files = dir.listFiles();
			for (File f : files)
				System.out.println(f.getName());
		}
	}
}
