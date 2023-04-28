package Book08_Files.Databases_page797.WorkingWithFiles_page777;

/*
Command-line parameters are useful in Java programs that work with files as a
way to pass path names to the program. Here’s a program that lists all the files in
a directory passed to the program as a parameter:
*/

import java.io.*;
public class ListDirectory
{
	public static void main(String[] args)
	{
		if (args.length > 0)
		{
			String path = args[0];
			File dir = new File(path);
			if (dir.isDirectory())
			{
				File[] files = dir.listFiles();
			//	assert files != null;
				for (File f : files)
				{
					System.out.println(f.getName());
				}
			}
			else
				System.out.println("Not a directory.");
		}
	}
}
