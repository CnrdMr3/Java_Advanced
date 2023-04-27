package Book08_Files.Databases_page797.WorkingWithFiles_page777;

import java.io.File;

/*
	To delete a file, create a File object for the file and then call the delete method,
	as in this example:
 */
public class DeletingAFile {
	public static void main(String[] args) {
		File f = new File("hits.log");
		if (f.delete())
			System.out.println("File deleted.");
		else
			System.out.println("File not deleted.");
	}

	/* Tip: With some recursive programming, you can create a method that deletes a non-empty directory
	 — but be sure to heed the upcoming warning. The method looks something like this:
	 */
	private static void deleteFile(File dir) {
		File[] files = dir.listFiles();
		for (File f : files) {
			if (f.isDirectory())
				deleteFile(f);
			else
				f.delete();
		}
		dir.delete();
	}
}

// !!! NOTE: If the file is a directory, the directory must be empty to be deleted.

// !!! NOTE: Then, to delete a folder named folder1 along with all its files and subdirectories,
//           call the deleteFile method:

//>>>        deleteFile(new File("folder1");

// !!! WARNING:  This feature is extremely dangerous to add to a program. Don’t use it without first
//               testing it carefully. If you accidentally delete all the files on your hard drive, don’t
//               blame me!
