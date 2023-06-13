
package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * The type Add subtract 2.
 */
public class AddSubtract2 extends Application {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}


	/**
	 * The Btn add.
	 */
	Button btnAdd;
	/**
	 * The Btn subtract.
	 */
	Button btnSubtract;
	/**
	 * The Lbl.
	 */
	Label lbl;
	/**
	 * The Counter.
	 */
	int iCounter = 0;

	/**
	 * Start.
	 *
	 * @param primaryStage the primary stage
	 */
	@Override
	public void start(Stage primaryStage) {
// Create a ClickHandler instance
		ClickHandler ch = new ClickHandler();
// Create the Add button
		btnAdd = new Button();
		btnAdd.setText("Add");
		btnAdd.setOnAction(ch);
// Create the Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction(ch);
// Create the Label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));
// Add the buttons and label to an HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
// Add the layout pane to a scene
		Scene scene = new Scene(pane, 450, 350);
// Add the scene to the stage, set the title
// and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();
	}

	private class ClickHandler implements EventHandler<ActionEvent> {
		/**
		 * Handle.
		 *
		 * @param e the e
		 */
		@Override
		public void handle(ActionEvent e) {
			if (e.getSource() == btnAdd) {
				iCounter++;
			} else {
				if (e.getSource() == btnSubtract) {
					iCounter--;
				}
			}
			lbl.setText(Integer.toString(iCounter));
		}
	}
}
