package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class KendaraanController implements Initializable{


    @FXML
    private Button MobilButton;
    @FXML
    private Button MotorButton;


    @Override
    public void initialize(URL url, ResourceBundle rb) { }

    @FXML
    public void MobilButtonOnAction(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("Mobil.fxml"));
        Scene homePageScene = new Scene(homePage);
        homePageScene.getStylesheets().add("sample/pajak.css");
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.hide();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }

    @FXML
    public void MotorButtonOnAction(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("Motor.fxml"));
        Scene homePageScene = new Scene(homePage);
        homePageScene.getStylesheets().add("sample/pajak.css");
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.hide();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }

    @FXML
    public void backButtonAction(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene homePageScene = new Scene(homePage);
        homePageScene.getStylesheets().add("sample/pajak.css");
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.hide();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }

}
