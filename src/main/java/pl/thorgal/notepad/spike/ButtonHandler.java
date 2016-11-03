package pl.thorgal.notepad.spike;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ButtonHandler implements EventHandler<ActionEvent> {

	private final Timeline timeline;

	public ButtonHandler(Timeline timeline) {
		this.timeline = timeline;
	}

	@Override
	public void handle(ActionEvent event) {
		// cokolwiek
	}

}