package com.example.monopoly;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class JailController extends HelloController implements Initializable {
    @FXML
    Label duck1;
    @FXML
    Label dog1;
    @FXML
    Label cat1;
    @FXML
    Label penguin1;
    @FXML
    Label bothCB;
    @FXML
    Button okaybtn;
    @FXML
    ChoiceBox <String> pcbk;
    @FXML
    private final String[] kremova = {"Duck", "Dog", "Cat", "Penguin"};


    @Override
    public void initialize(URL pat, ResourceBundle mat) {
        pcbk.getItems().addAll(kremova);
        pcbk.setValue("Pick A Player");
        pcbk.setOnAction(this::breakOut);
    }
    public void breakOut(ActionEvent event) {
        String cukr = pcbk.getValue();
        if(cukr.equals("Duck")) {
            duck-=50;
        }
        if(cukr.equals("Dog")) {
            dog -=50;
        }
        if(cukr.equals("Cat") ) {
            cat-= 50;
        }
        if(cukr.equals("Penguin") ) {
            penguin -=50;
        } else{
            return;
        }
    }
    @FXML
    protected void onTap() throws IOException {
        if (pcbk.getSelectionModel().isEmpty()) {
            bothCB.setVisible(true);
        }
        if (!pcbk.getSelectionModel().isEmpty()) {
            okaybtn.setOnAction(this::breakOut);
            Stage prison = (Stage) okaybtn.getScene().getWindow();
            prison.close();
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 320);
            stage.setTitle("Monopoly");
            stage.setScene(scene);
            stage.show();
        }
    }

}