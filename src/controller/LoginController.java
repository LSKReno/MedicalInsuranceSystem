package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;

/**
 * Created by LSK.Reno on 2018/7/25.
 */
public class LoginController {

    @FXML
    private Label welcome_text;

    @FXML
    private TextField accountField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signInButton;

    @FXML
    private Text errormessage;

    @FXML
    void signIn(ActionEvent event) {
        if (accountField.getText().equals("Admin") && passwordField.getText().equals("123")) {
            Stage primaryStage = Main.getStage();
            try {
                primaryStage.setTitle("Menu");
                Scene scene = new Scene(FXMLLoader.load(getClass().getResource("MenuController.fxml")));
                primaryStage.setScene(scene);
                scene.getStylesheets().add(this.getClass().getResource("Menu.css").toExternalForm());

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            errormessage.setText("wrong password or account!");
        }
    }

}







































