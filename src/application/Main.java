package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			root.getChildren().add(new Label("Mohammad's label (CHANGE BY MOHAMMAD TEST)"));
			root.getChildren().add(new Label("Mingyu's another label"));
			root.getChildren().add(new Label("Mingyu's label"));
			Scene scene = new Scene(root,400,400);
			root.getChildren().add(new Label("Mohammad's branch"));
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Mingyu He's Project");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
