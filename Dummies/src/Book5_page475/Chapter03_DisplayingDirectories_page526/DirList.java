package Book5_page475.Chapter03_DisplayingDirectories_page526;

import java.io.File;
import java.util.Scanner;


/**
 * The type Dir list.
 */
public class DirList {
	/**
	 * The Sc.
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        System.out.print(
                "Welcome to the Directory Lister");
        do {
            System.out.print("\nEnter a path: ");
            String path = sc.nextLine();

            File dir = new File(path);
            if (!dir.exists() || !dir.isDirectory())
                System.out.println(
                        "\nThat directory doesn't exist.");
            else {
                System.out.println(
                        "\nListing directory tree of:");
                System.out.println(dir.getPath());
                listDirectories(dir, " ");
            }
        } while (

                askAgain());
    }

    private static void listDirectories(
            File dir, String indent) {
        File[] dirs = dir.listFiles();
        for (File f : dirs) {
            if (f.isDirectory()) {
                System.out.println(
                        indent + f.getName());
                listDirectories(f, indent + " ");
            }
        }
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y"))
            return true;
        return false;
    }
}

