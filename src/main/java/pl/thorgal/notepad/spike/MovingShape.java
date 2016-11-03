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
	private final Timeline timeline;
	
	/**
	 * constructor
	 */
	public MovingShape(Timeline timeline) {
		this.timeline = timeline;
		
		shape = new Circle(25, Color.RED);
		shape.setCenterX(25);
		shape.setCenterY(150);
	}

	public void startAnimation() {
		timeline.setCycleCount(Timeline.INDEFINITE);
		
		KeyValue kv = new KeyValue(shape.centerXProperty(), 275);
		KeyValue kv2 = new KeyValue(shape.centerYProperty(), 275);
		KeyFrame kf = new KeyFrame(Duration.millis(5000), kv, kv2);
		
		timeline.getKeyFrames().add(kf);
		timeline.play();
	}

	public Node getGraphicsNode() {
		return shape;
	}

}
