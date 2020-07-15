package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {
	public HelloWorldApp() {
		System.out.println("2. HelloWorldApp() ������ȣ��");
	}

	@Override
	public void init() throws Exception {
		System.out.println("3. init() ȣ��");
		super.init();
		System.out.println("Inside init() method! Perform necessary initializations here.");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("4. start() ȣ��");
		primaryStage.setTitle("FarenheitGUI");
		Label label = new Label("Fareheit Temperature");
		label.setAlignment(Pos.CENTER);
		Scene scene = new Scene(label, 400, 200);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.out.println("5. stop() ȣ��");
		super.stop();
		System.out.println("Inside stop() method! Destroy resources. Perform Cleanup.");
	}

	public static void main(String[] args) {
		System.out.println("1. main() ȣ��");
		launch(args);
	}
}
