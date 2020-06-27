package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStages) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        root.getStylesheets().add("sample/pajak.css");
        primaryStages.setTitle("Pajak Bruh");
        primaryStages.setScene(new Scene(root, 575, 400));
        primaryStages.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
