package pl.thorgal.notepad.spike;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class MovingShape {
	private final Circle shape;
	
	/**
	 * constructor
	 */
	public MovingShape() {
		shape = new Circle(25, Color.RED);
		shape.setCenterX(25);
		shape.setCenterY(150);
	}

	public void startAnimation() {
		final Timeline timeline = new Timeline();
		timeline.setCycleCount(Timeline.INDEFINITE);
		
		final KeyValue kv = new KeyValue(shape.centerXProperty(), 275);
		final KeyFrame kf = new KeyFrame(Duration.millis(5000), kv);
		
		timeline.getKeyFrames().add(kf);
		timeline.play();
	}

	public Node getGraphicsNode() {
		return shape;
	}

}
