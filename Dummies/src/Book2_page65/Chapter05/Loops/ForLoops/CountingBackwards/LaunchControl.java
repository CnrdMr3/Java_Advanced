package Book2_page65.Chapter05.Loops.ForLoops.CountingBackwards;

/**
 * The type Launch control.
 */
public class LaunchControl {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        System.out.print
                ("We are go for launch in T minus ");

        for (int count = 10; count >= 0; count--) {
            if (count == 8)
                System.out.println
                        ("Ignition sequence start!");
            else
                System.out.println(count + "...");
        }
        System.out.println("All engines running!");
        System.out.println("Liftoff! We have a liftoff!");
    }
}

//Variation of Counting backwards with a for-loop.
