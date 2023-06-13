package Book5_page475.Chapter01_RunnableInterface_page480;

import java.lang.Thread;

/**
 * The type Count down app.
 */
public class CountDownApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        CountDownClock clock = new CountDownClock();
        java.lang.Runnable flood, ignition, liftoff;
        flood = new LaunchEvent();
        ignition = new LaunchEvent();
        liftoff = new LaunchEvent();
        clock.start();
        new Thread(String.valueOf(flood)).start();
        new Thread(String.valueOf(ignition)).start();
        new Thread(String.valueOf(liftoff)).start();
    }
}

