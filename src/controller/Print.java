package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by LSK.Reno on 2018/8/1 17:50.
 */
public class Print {

    @FXML
    private Button backBUtton;

    @FXML
    void back(ActionEvent event) {
        Stage primaryStage = Main.getStage();
        try {
            primaryStage.setTitle("Menu");
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("MenuController.fxml")));
            primaryStage.setScene(scene);
            scene.getStylesheets().add(this.getClass().getResource("Menu.css").toExternalForm());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
