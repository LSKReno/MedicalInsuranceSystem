package controller;

/**
 * Created by LSK.Reno on 2018/7/26 15:27.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ComSearchController {
    private Stage ComSearchStage;
    public Stage setComSearchStage(Stage ComSearchStage) {
        this.ComSearchStage = ComSearchStage;
        return ComSearchStage;
    }


    @FXML
    private void initialize(){
    }
    @FXML
    private Button backButton;

    @FXML
    private Button comSearchButton;

    @FXML
    private TextField comSearchField;

    /**
     * 综合查询，按人员编号查询 和 按人员名称查询
     * */
    @FXML
    void comSearch(ActionEvent event) {

    }

    /**返回到上一界面*/
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
//        ComSearchStage.close();
//        Main.getPrimaryStage();
    }
//    public void goToMain(){
//        myController.setStage(MainApp.mainViewID);
//    }

}
