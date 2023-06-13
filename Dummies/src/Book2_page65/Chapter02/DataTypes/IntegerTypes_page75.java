package Book2_page65.Chapter02.DataTypes;

/**
 * The type Integer types page 75.
 */
public class IntegerTypes_page75 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int xInt;
        long yLong;
        yLong = 32;
        xInt = (int) yLong;

        System.out.println(yLong + "" + xInt);

        long xLong1 = 58473882;
        long xLong2 = 58_473_882;

        System.out.println(xLong1 + "" + xLong2);

    }
}
