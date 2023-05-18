package com.example.monopoly;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RoundController extends HelloController implements Initializable {
    @FXML
    Button duck1;
    @FXML
    Button dog1;
    @FXML
    Button cat1;
    @FXML
    Button penguin1;
    @FXML
    private Button okaybtn;
    @FXML
    ChoiceBox<String> bolek;
    @FXML
    private final String[] lolek = {"Duck", "Dog", "Cat", "Penguin"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
            bolek.getItems().addAll(lolek);
            bolek.setValue("Pick A Player");
            bolek.setOnAction(this::getPlayers);
    }
    public void getPlayers(ActionEvent event) {
        String bolek2 = bolek.getValue();
        if(bolek2.equals("Duck")) {
            duck += 200;
        }
        if(bolek2.equals("Dog")) {
            dog += 200;
        }
        if(bolek2.equals("Cat")) {
            cat += 200;
        }
        if(bolek2.equals("Penguin")) {
            penguin += 200;
        }
        else {
            return;
        }
    }
    @FXML
    protected void onClicked() throws IOException {
        okaybtn.setOnAction(this::getPlayers);
        Stage stage = (Stage) okaybtn.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 320);
        stage1.setTitle("Monopoly");
        stage1.setScene(scene);
        stage1.show();
    }
}