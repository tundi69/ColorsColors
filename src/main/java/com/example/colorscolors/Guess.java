package com.example.colorscolors;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class Guess extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Guess.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 540);
        stage.setTitle("Let's play!");
        stage.setScene(scene);
        stage.show();
        // set the proper behavior on closing the application
        Controller controller = fxmlLoader.getController();

        stage.setOnCloseRequest((new EventHandler<WindowEvent>() {
           public void handle(WindowEvent we) {
                controller.changeVisibilityFalse();
            }
        }));
    }

    public static void main(String[] args) {
        launch();
    }

}