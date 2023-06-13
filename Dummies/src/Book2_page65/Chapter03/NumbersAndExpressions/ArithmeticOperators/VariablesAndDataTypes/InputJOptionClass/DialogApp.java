package Book2_page65.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.InputJOptionClass;

import javax.swing.JOptionPane;

/**
 * The type Dialog app.
 */
public class DialogApp {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog
                ("Enter an integer:");
        int x = Integer.parseInt(s);
        System.out.println("You entered " + x + ".");
    }
}
