package Book3_page235.Chapter05.UsingDefaultMethods;

/**
 * The type Test lambda collection.
 */
public class TestLambdaCollection {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Game g = new Game();
        g.play();
        g.quit();
    }
}

/**
 * The interface Playable.
 */
interface Playable {
	/**
	 * Play.
	 */
	void play();

	/**
	 * Quit.
	 */
	default void quit() {
        System.out.println("Sorry, quitting is not allowed.");
    }
}


/**
 * The type Game.
 */
class Game implements Playable {
    public void play() {
        System.out.println("Good luck!");
    }
}

