package Book5_page475.Chapter01_CountDownApp_page483;

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

        Thread clock = new CountDownClock();

        java.lang.Runnable flood, ignition, liftoff;

        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(6, "Start engines!");
        liftoff = new LaunchEvent(0, "Liftoff!");

        clock.start();

        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
}