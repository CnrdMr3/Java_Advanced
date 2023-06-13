package Book5_page475.Chapter01_ThreadsThatWorkTogether_page486;

import java.util.ArrayList;

/**
 * The type Coordinated count down app.
 */
public class CoordinatedCountDownApp {

	/**
	 * The type Count down app.
	 */
	public class CountDownApp {
		/**
		 * Main.
		 *
		 * @param args the args
		 */
		public void main(String[] args) {
            CountDownClock clock = new CountDownClock(20);
            ArrayList<Runnable> events =
                    new ArrayList<Runnable>();
            events.add(new LaunchEvent(16, "Flood the pad!", clock));
            events.add(new LaunchEvent(6,
                    "Start engines!", clock));
            events.add(new LaunchEvent(0,
                    "Liftoff!", clock));
            clock.start();
            for (Runnable e : events)
            new Thread(e).start();
        }
    }

	/**
	 * The interface Time monitor.
	 */
	interface TimeMonitor

    {
	    /**
	     * Gets time.
	     *
	     * @return the time
	     */
	    int getTime ();
    }

	/**
	 * The type Count down clock.
	 */
	class CountDownClock extends Thread
            implements TimeMonitor

    {
        private int t;

	    /**
	     * Instantiates a new Count down clock.
	     *
	     * @param start the start
	     */
	    public CountDownClock( int start)
        {
            this.t = start;
        }

	    /**
	     * Run.
	     */
	    public void run ()
        {
            for (; t >= 0; t--)
            {
                System.out.println("T minus " + t);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
        public int getTime ()
        {
            return t;
        }
    }

	/**
	 * The type Launch event.
	 */
	class LaunchEvent implements Runnable

    {
        private int start;
        private String message;
	    /**
	     * The Tm.
	     */
	    TimeMonitor tm;

	    /**
	     * Instantiates a new Launch event.
	     *
	     * @param start   the start
	     * @param message the message
	     * @param monitor the monitor
	     */
	    public LaunchEvent( int start, String message,
            TimeMonitor monitor)
        {
            this.start = start;
            this.message = message;
            this.tm = monitor;
        }

	    /**
	     * Run.
	     */
	    public void run ()
        {
            boolean eventDone = false;
            while (!eventDone) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                if (tm.getTime() <= start)
                {
                    System.out.println(this.message);
                    eventDone = true;
                }
            }
        }
    }
}
