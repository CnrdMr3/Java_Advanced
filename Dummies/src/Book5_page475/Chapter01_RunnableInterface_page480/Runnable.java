package Book5_page475.Chapter01_RunnableInterface_page480;

/**
 * The type Runnable.
 */
class Runnable extends Thread {
	/**
	 * Create runnable runnable.
	 *
	 * @return the runnable
	 */
	public static Runnable createRunnable() {
        return null;
    }

	/**
	 * Run.
	 */
	public void run() {
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}

