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
 * The type Add subtract 3.
 */
public class AddSubtract3 extends Application {
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
// Create the Add button
		btnAdd = new Button();
		btnAdd.setText("Add");
		btnAdd.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				iCounter++;
				lbl.setText(Integer.toString(iCounter));
			}
		});
// Create the Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction(new EventHandler<ActionEvent>()

		{

			public void handle(ActionEvent e) {
				iCounter--;
				lbl.setText(Integer.toString(iCounter));
			}
		});
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
}