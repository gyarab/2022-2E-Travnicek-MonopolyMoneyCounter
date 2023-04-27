package com.example.monopoly;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

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
            bolek.setOnAction(this::getPlayers);
    }
    public void getPlayers(ActionEvent event) {
        String bolek2 = bolek.getValue();
        if(bolek2 == "Duck") {
            duck += 200;
        }
        if(bolek2 == "Dog") {
            dog += 200;
        }
        if(bolek2 == "Cat") {
            cat += 200;
        }
        if(bolek2 == "Penguin") {
            penguin += 200;
        }
        else {
            return;
        }
    }
    @FXML
    protected void onClicked() {
        okaybtn.setOnAction(this::getPlayers);
        if(duck1 != null) {
            duck1.setText("Duck's money: " + duck + "$");
        } else if(dog1 != null) {
            dog1.setText("Dog's money: " + dog + "$");
        }else if(cat1 != null) {
            cat1.setText("Cat's money: " + cat + "$");
        } else if(penguin1 != null) {
            penguin1.setText("Penguin's money: " + penguin + "$");
        }
        Stage stage = (Stage) okaybtn.getScene().getWindow();
        stage.close();
    }
}