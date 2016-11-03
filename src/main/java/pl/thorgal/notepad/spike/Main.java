package pl.thorgal.notepad.spike;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 */
public class Main extends Application {

	private static final int WINDOW_SIZE = 300;

	/**
	 * Required to start the jar as an executable.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Animation");

		MovingShape movingShape = new MovingShape();

		Group freeFormPanel = new Group(movingShape.getGraphicsNode());

		// Scene is like a layer of the window
		Scene scene = new Scene(freeFormPanel, WINDOW_SIZE, WINDOW_SIZE);
		
		movingShape.startAnimation();

		// Stage is the window itself
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
