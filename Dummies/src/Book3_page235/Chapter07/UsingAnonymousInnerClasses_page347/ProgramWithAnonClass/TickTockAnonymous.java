package Book3_page235.Chapter07.UsingAnonymousInnerClasses_page347.ProgramWithAnonClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Tick tock anonymous.
 */
public class TickTockAnonymous {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        TickTockAnonymous t = new TickTockAnonymous();
        t.go();
    }

    private void go() {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000,
                new ActionListener() {
                    private boolean tick = true;

                    public void actionPerformed(
                            ActionEvent event) {
                        if (tick) {
                            System.out.println(tickMessage);
                        } else {
                            System.out.println(tockMessage);
                        }
                        tick = !tick;
                    }
                });
        t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }
}
