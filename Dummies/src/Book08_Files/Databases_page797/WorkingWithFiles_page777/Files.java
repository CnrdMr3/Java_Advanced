package Book08_Files.Databases_page797.WorkingWithFiles_page777;

import java.io.File;

/*
You can rename a file by using the renameTo method. This method uses another
File object as a parameter that specifies the file you want to rename the current
file to. It returns a boolean value that indicates whether the file was renamed
successfully.

The following statements change the name of a file named hits.log to
savedhits.log:
 */
public class Files {
	public static void main(String[] args) {
		File f = new File("hits.log");
		if (f.renameTo(new File("savedhits.log")))
			System.out.println("File renamed.");
		else
			System.out.println("File not renamed.");
	}
}
