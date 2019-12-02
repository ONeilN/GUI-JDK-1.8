package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../../resources/sample.fxml"));
        primaryStage.setScene(new Scene(root, 1600, 830));
        primaryStage.setMaxWidth(1600);
        primaryStage.setMaxHeight(830);
        primaryStage.setMinWidth(1600);
        primaryStage.setMinHeight(830);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
