package pl.thorgal.notepad.spike;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class ButtonHandler implements EventHandler<ActionEvent> {

	private final TextField outputField;

	public ButtonHandler(TextField outputField) {
		this.outputField = outputField;
	}

	@Override
	public void handle(ActionEvent event) {
		outputField.appendText("New word\n");
	}

}
