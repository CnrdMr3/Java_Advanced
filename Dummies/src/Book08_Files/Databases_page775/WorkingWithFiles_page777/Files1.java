package Book08_Files.Databases_page775.WorkingWithFiles_page777;

import java.io.File;

/*
Depending on the capabilities of the operating system, the renameTo method can
also move a file from one directory to another. This code moves the file hits.log
from the folder logs to the folder savedlogs:
 */
public class Files1 {
	public static void main(String[] args) {
		File f = new File("logs\\hits.log");
		if (f.renameTo(new File("savedlogs\\hits.log")))
			System.out.println("File moved.");
		else
			System.out.println("File not moved.");
	}
}

// Tip: Always test the return value of the renameTo method to make sure that the file was
//      renamed successfully.