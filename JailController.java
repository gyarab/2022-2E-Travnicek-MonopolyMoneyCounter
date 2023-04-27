package com.example.monopoly;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class JailController extends HelloController implements Initializable {
    @FXML
    Button duck1;
    @FXML
    Button dog1;
    @FXML
    Button cat1;
    @FXML
    Button penguin1;
    @FXML
    Button okaybtn;
    @FXML
    ChoiceBox <String> pcbk;
    @FXML
    private final String[] kremova = {"Duck", "Dog", "Cat", "Penguin"};

    @Override
    public void initialize(URL pat, ResourceBundle mat) {
        pcbk.getItems().addAll(kremova);
        pcbk.setOnAction(this::breakOut);
    }
    public void breakOut(ActionEvent event) {
        String cukr = pcbk.getValue();
        if(cukr == "Duck") {
            duck-=50;
        }
        if(cukr == "Dog") {
            dog -=50;
        }
        if(cukr == "Cat") {
            cat-= 50;
        }
        if(cukr == "Penguin") {
            penguin -=50;
        } else{
            return;
        }
    }
    @FXML
    protected void onTap() {
        okaybtn.setOnAction(this::breakOut);
        if(duck1 != null) {
            duck1.setText("Duck's money: " + duck + "$");
        } else if(dog1 != null) {
            dog1.setText("Dog's money: " + dog + "$");
        }else if(cat1 != null) {
            cat1.setText("Cat's money: " + cat + "$");
        } else if(penguin1 != null) {
            penguin1.setText("Penguin's money: " + penguin + "$");
        }
        Stage prison = (Stage) okaybtn.getScene().getWindow();
        prison.close();
    }
}