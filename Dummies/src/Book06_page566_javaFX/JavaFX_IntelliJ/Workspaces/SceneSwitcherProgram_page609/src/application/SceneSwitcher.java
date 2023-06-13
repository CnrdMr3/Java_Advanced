package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * The type Scene switcher.
 */
public class SceneSwitcher extends Application {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * The Click count.
	 */
// class fields for Click-Counter scene
	int iClickCount = 0;
	/**
	 * The Lbl clicks.
	 */
	Label lblClicks;
	/**
	 * The Btn click me.
	 */
	Button btnClickMe;
	/**
	 * The Btn switch to scene 2.
	 */
	Button btnSwitchToScene2;
	/**
	 * The Scene 1.
	 */
	Scene scene1;
	/**
	 * The Counter.
	 */
// class fields for Add-Subtract scene
	int iCounter = 0;
	/**
	 * The Lbl counter.
	 */
	Label lblCounter;
	/**
	 * The Btn add.
	 */
	Button btnAdd;
	/**
	 * The Btn subtract.
	 */
	Button btnSubtract;
	/**
	 * The Btn switch to scene 1.
	 */
	Button btnSwitchToScene1;
	/**
	 * The Scene 2.
	 */
	Scene scene2;
	/**
	 * The Stage.
	 */
// class field for stage
	Stage stage;

	/**
	 * Start.
	 *
	 * @param primaryStage the primary stage
	 */
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		// Build the Click-Counter scene
		lblClicks = new Label();
		lblClicks.setText("You have not clicked the button.");
		btnClickMe = new Button();
		btnClickMe.setText("Click me please!");
		btnClickMe.setOnAction(e -> btnClickMe_Click());
		btnSwitchToScene2 = new Button();
		btnSwitchToScene2.setText("Switch!");
		btnSwitchToScene2.setOnAction(e -> btnSwitchToScene2_Click());
		VBox pane1 = new VBox(10);
		pane1.getChildren().addAll(lblClicks, btnClickMe, btnSwitchToScene2);
		scene1 = new Scene(pane1, 250, 150);
		// Build the Add-Subtract scene
		lblCounter = new Label();
		lblCounter.setText(Integer.toString(iCounter));
		btnAdd = new Button();
		btnAdd.setText("Add");
		btnAdd.setOnAction(e -> btnAdd_Click());
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction(e -> btnSubtract_Click());
		btnSwitchToScene2 = new Button();
		btnSwitchToScene2.setText("Switch!");
		btnSwitchToScene2.setOnAction(e -> btnSwitchToScene1_Click());
		HBox pane2 = new HBox(10);
		pane2.getChildren().addAll(lblCounter, btnAdd, btnSubtract, btnSwitchToScene2);
		scene2 = new Scene(pane2, 300, 75);
		// Set the stage with scene 1 and show the stage
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Scene Switcher");
		primaryStage.show();
	}

	/**
	 * Btn click me click.
	 */
// Event handlers for scene 1
	public void btnClickMe_Click() {
		iClickCount++;
		if (iClickCount == 1) {
			lblClicks.setText("You have clicked once.");
		} else {
			lblClicks.setText("You have clicked " + iClickCount + " times.");
		}
	}

	private void btnSwitchToScene2_Click() {
		stage.setScene(scene2);
	}

	// Event handlers for scene 2
	private void btnAdd_Click() {
		iCounter++;
		lblCounter.setText(Integer.toString(iCounter));
	}

	private void btnSubtract_Click() {
		iCounter--;
		lblCounter.setText(Integer.toString(iCounter));
	}

	private void btnSwitchToScene1_Click() {
		stage.setScene(scene1);
	}
}
