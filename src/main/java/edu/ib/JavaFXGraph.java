package edu.ib;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFXGraph extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        // GitHubTest Next attempt

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/graph.fxml"));
        Scene scene= new Scene(root,800,600);
        stage.setScene(scene);
        stage.show();

    }
}
