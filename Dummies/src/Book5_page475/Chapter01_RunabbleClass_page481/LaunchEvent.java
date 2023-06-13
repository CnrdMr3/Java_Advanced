package Book5_page475.Chapter01_RunabbleClass_page481;

/**
 * The type Launch event.
 */
public class LaunchEvent implements java.lang.Runnable {
    private int start;
    private String message;

	/**
	 * Instantiates a new Launch event.
	 *
	 * @param start   the start
	 * @param message the message
	 */
	public LaunchEvent(int start, String message) {
        this.start = start;
        this.message = message;
    }

	/**
	 * Run.
	 */
	public void run() {
        try {
            Thread.sleep(20000 - (start * 1000));
        } catch (InterruptedException e) {
        }
        System.out.println(message);
    }
}
