package Book07_page709.Chapter01_page_709.UsingJavaWebStart;


/*
Looking at a Simple JavaFX Program:

    The JavaFX application used to illustrate Java Web Start is called ClickMe. When
    run, it simply displays the dialog box shown in Figure 1-1. As you can see, the
    dialog box contains a button labeled "Click me please!", When the user clicks the
    button, the button’s label changes to "You clicked me!" If the user clicks again,
    the button reverts to "Click me please!" and the process repeats until the user
    closes the program by clicking the Close button (the X in the upper-right corner
    of the window).

    The operation of this program is explained in detail in Chapter 1 of Book 6. You
    don’t really need to know anything about how the ClickMe program works to
    deploy via Java Web Start, but for reference the source code for the program is
    shown in Listing  1-1. The code shown in this listing should be saved to a file
    named ClickMe.java. If you want to know more about the program before you
    learn how to deploy it using Java Web Start, please refer to Book 6, Chapter 1.
 */

/*
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

import java.util.Objects;

public class ClickMe extends Application {
	public static void main(String[] args) {
		launch(args);
		System.out.println("Done");
	}

	 Button btn;

	@Override
	public void start(Stage primaryStage) {
		// Create the button
		btn = new Button();
		btn.setText("Click me please!");
		btn.setOnAction(e -> buttonClick());
		// Add the button to a layout pane
		BorderPane pane = new BorderPane();
		pane.setCenter(btn);
		// Add the layout pane to a scene
		Scene scene = new Scene(pane, 300, 250);
		// Add the scene to the stage, set the title
		// and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("The Click Me App");
		primaryStage.show();
	}

	public void buttonClick() {
		if (Objects.equals(btn.getText(), "Click me please!")) {
			btn.setText("You clicked me!");
		} else {
			btn.setText("Click me please!");
		}
	}
}
*/
/*
The ClickMe.java source file can be compiled to a Java Class file by
using the following command from a command prompt:

> javac ClickMe.java

The class file can then be used to create an executable JAR file using this command:

> jar cf ClickMe.jar *.class

After the JAR file has been created, you’re ready to configure Java Web Start to
launch the ClickMe program from a web page.
 */