package Book4_page375.Chapter02.Chess_page408;

import java.util.Scanner;

/**
 * The type Moves.
 */
public class Moves extends Chess {
	/**
	 * The Sc.
	 */
	static Scanner sc = new Scanner(System.in);
	/**
	 * The constant moves.
	 */
// the following static array represents the 8
    // possible moves a knight can make
    // this is an 8 x 2 array
    static int[][] moves = {
            {-2, +1},
            {-1, +2},
            {+1, +2},
            {+2, +1},
            {+2, -1},
            {+1, -2},
            {-1, -2},
            {-2, -1}
    };
}
