package controller;

import Data.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Created by LSK.Reno on 2018/7/26.
 */

public class Main extends Application {

    static private Stage primaryStage;

    /**all the controller can call this method.
     * @return get the primaryStage.
     */

    //准备开始运行程序的初始化
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Welcome To Medical System");
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root, 818.4, 399.6);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(this.getClass().getResource("Login.css").toExternalForm());
        primaryStage.show();
    }
    //得到初始的菜单界面
    public static Stage getPrimaryStage() {
        return primaryStage;
    }
    public static Stage getStage() {
        return primaryStage;
    }

    //运行程序
    public static void main(String[] args) {
        launch(args);
    }

}





























