package sample;import javafx.application.Application;import javafx.event.ActionEvent;import javafx.fxml.FXML;import javafx.fxml.FXMLLoader;import javafx.scene.Parent;import javafx.scene.Scene;import javafx.stage.Stage;import java.awt.*;public class Main extends Application {    private static int W= 600;    private static int H = 350;    private static String TITLE = "Simple Project";    @Override    public void start(Stage primaryStage) throws Exception{        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));        primaryStage.setTitle(TITLE);        primaryStage.setScene(new Scene(root, W, H));        primaryStage.show();    }    public static void main(String[] args) {        launch(args);    }}