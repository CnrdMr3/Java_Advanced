package Book3_page235.Chapter04.Polymorphism;

/**
 * The type Tic tac toe app.
 */
public class TicTacToeApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new BetterPlayer();
        playTheGame(p1, p2);
    }

	/**
	 * Play the game.
	 *
	 * @param p1 the p 1
	 * @param p2 the p 2
	 */
	public static  void playTheGame(Player p1, Player p2) {
        p1.move();
        p2.move();
    }
}
