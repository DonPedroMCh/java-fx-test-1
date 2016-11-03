package pl.thorgal.mch001;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("MCh0001");
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		
		FlowPane panel1 = new FlowPane(Orientation.HORIZONTAL);
		panel1.getChildren().addAll(b1, b2, b3);
		FlowPane panel2 = new FlowPane(Orientation.HORIZONTAL);
		panel2.getChildren().addAll(b4, b5, b6);
		FlowPane panel3 = new FlowPane(Orientation.HORIZONTAL);
		panel3.getChildren().addAll(b7, b8, b9);
		
		FlowPane panelBig = new FlowPane(Orientation.VERTICAL);
		panelBig.getChildren().addAll(panel1, panel2, panel3);
		
		Scene scene1 = new Scene(panelBig, 400, 400);
		
		primaryStage.setScene(scene1);
		primaryStage.show();
		
	
	
		
		
	}
}
