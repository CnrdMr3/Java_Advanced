
package Book06_page566_javaFX.JavaFX_IntelliJ.Workspaces.AddSubtract1.src.application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * The type Add subtract 1.
 */
public class AddSubtract1 extends Application implements EventHandler<ActionEvent> {

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
		btnAdd.setOnAction(this);
// Create the Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction(this);
// Create the Label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));
// Add the buttons and label to an HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll( btnAdd,lbl, btnSubtract);  // -> Moved lbl to between btnAdd and btnSubtract, looks better.
// Add the layout pane to a scene
		Scene scene = new Scene(pane, 500, 375); // -> Larger pane dimensions (Box is bigger)
// Add the scene to the stage, set the title
// and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();
	}

	/**
	 * Handle.
	 *
	 * @param actionEvent the action event
	 */
	@Override
	public void handle(ActionEvent actionEvent) {
		
	}
}
