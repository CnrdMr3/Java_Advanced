package Book5_page475.Chapter01_ExtendingThreads_page478;

import java.lang.Thread;

/**
 * The type Count down clock.
 */
public class CountDownClock extends Thread {
	/**
	 * Run.
	 */
	public void run() {
        for (int t = 10; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}
