package Book06_page566_javaFX.JavaFX_IntelliJ.Workspaces.ClickCounter_page578.src.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * The type Click counter.
 */
public class ClickCounter extends Application {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * The Btn.
	 */
	Button btn;
	/**
	 * The Lbl.
	 */
	Label lbl;
	/**
	 * The Click count.
	 */
	int iClickCount = 0;

	/**
	 * Start.
	 *
	 * @param primaryStage the primary stage
	 */
	@Override
	public void start(Stage primaryStage) {
		// Create the button
		btn = new Button();
		btn.setText("Click Me!");
		btn.setOnAction(e -> buttonClick());
		// Create the Label
		lbl = new Label();
		lbl.setText("Click the button!");
		// Add the label and the button to a layout pane
		BorderPane pane = new BorderPane();
		pane.setTop(lbl);
		pane.setCenter(btn);
		// Add the layout pane to a scene
		Scene scene = new Scene(pane, 450, 350);
		// Add the scene to the stage, set the title
		// and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click Counter");
		primaryStage.show();
	}

	/**
	 * Button click.
	 */
	public void buttonClick() {
		iClickCount++;
		if (iClickCount == 1) {
			lbl.setText("That is 1 click.");
		} else {
			lbl.setText("That is " + iClickCount + " clicks.");
		}
	}
}
