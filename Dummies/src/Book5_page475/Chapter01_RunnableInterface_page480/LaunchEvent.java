package Book5_page475.Chapter01_RunnableInterface_page480;

import java.util.ArrayList;

/**
 * The type Launch event.
 */
public class LaunchEvent extends Runnable {
	/**
	 * Instantiates a new Launch event.
	 */
	public LaunchEvent() {
    }

	/**
	 * Instantiates a new Launch event.
	 *
	 * @param i the
	 * @param s the s
	 */
	public LaunchEvent(int i, String s) {
        super();
    }

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Thread clock = new CountDownClock();
        ArrayList<java.lang.Runnable> events = new ArrayList<>();
        events.add(new LaunchEvent());
        events.add(new LaunchEvent());
        events.add(new LaunchEvent());
        clock.start();
        for (int i = 0; i < 3; i++) {
            new Thread(events.get(i)).start();
        }

    }

	/**
	 * Run.
	 */
	@Override
    public void run() {

    }
}