package com.example.monopoly;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import static com.example.monopoly.HelloController.*;


public class HelloApplication extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 320);
        primaryStage.setTitle("Monopoly");
        primaryStage.setScene(scene);
        primaryStage.show();
    }



       public static void main(String[] args) {
            launch();
        }


}
