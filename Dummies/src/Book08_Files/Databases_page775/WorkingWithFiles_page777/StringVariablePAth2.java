package Book08_Files.Databases_page775.WorkingWithFiles_page777;

import java.io.File;

public class StringVariablePAth2 {
	// The following snippet is a little more selective because it lists only files, not subdirectories,
	// and doesn't list hidden files:
	public static void main(String[] args) {
		String path = new String();
		File dir = new File(path);
		if (dir.isDirectory())
		{
			File[] files = dir.listFiles();
			for (File f : files)
			{
				if (f.isFile() && !f.isHidden())
					System.out.println(f.getName());
			}
			/*
			Directory listings are especially well suited to recursive programming, because
			each File object returned by the listFiles method may be another directory that
			itself has a list of files and directories. For an explanation of recursive programming and an
			example that lists directories recursively, see Book 5, Chapter 4.
			 */
		}
	}
}
