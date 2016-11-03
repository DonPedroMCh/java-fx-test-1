package pl.thorgal.mch001;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 */
public class MainExample extends Application {

	private TextField outputField;

	/**
	 * Required to start the jar as an executable.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Notepad");

		// This element shows text on screen
		outputField = new TextField();
		outputField.setPrefSize(300, 150);
		
		// First button uses a separate class to define its logic
		Button addWordButton = new Button("Add");
		ButtonHandler1 customHandler = new ButtonHandler1(outputField);
		addWordButton.setOnAction(customHandler );
		
		// Second button is created and defined 'inline'
		Button addWordButtonInline = new Button("Add2");
		addWordButtonInline.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				outputField.appendText("New word\n");
			}
		});

		// Panels are different than buttons and fields; they make up sections of the window
		FlowPane panel = new FlowPane(Orientation.VERTICAL);
		panel.getChildren().addAll(addWordButton, addWordButtonInline, outputField);

		// Scene is like a layer of the window
		Scene scene = new Scene(panel, 300, 250);
		
		// Stage is the window itself
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
