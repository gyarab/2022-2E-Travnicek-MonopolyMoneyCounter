package com.example.monopoly;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TaxesController extends HelloController implements Initializable {
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
    Label bothCB;
    @FXML
    ChoiceBox<String> swag;
    @FXML
    ChoiceBox<String> quak;
    @FXML
    private final String[] players = {"Duck", "Dog", "Cat", "Penguin"};
    @FXML
    private final String[] value = {"-900$", "-(10% of your worth)"};


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        swag.getItems().addAll(players);
        swag.setValue("Pick A Player");
        quak.getItems().addAll(value);
        quak.setValue("Pick An Option");
        swag.setOnAction(this::getPlayers);
        quak.setOnAction(this::getPlayers);
    }


    public void getPlayers(ActionEvent event) {
        String swag1 = swag.getValue();
        String quak1 = quak.getValue();

            if (swag1.equals("Duck")) {
                if (quak1.equals("-900$")) {
                    duck -= 900;
                } else if (quak1.equals("-(10% of your worth)")) {
                    duck -= (duck/ 10);
                }
            }
            if (swag1.equals("Dog")) {
                if (quak1.equals("-900$")) {
                    dog -= 900;
                } else if (quak1.equals("-(10% of your worth)")) {
                    dog -= (dog / 10);
                }
            }
            if (swag1.equals("Cat")) {
                if (quak1.equals("-900$")) {
                    cat -= 900;
                } else if (quak1.equals("-(10% of your worth)")) {
                    cat -= (cat / 10);
                }
            }
        if (swag1.equals("Penguin")) {
            if (quak1.equals("-900$")) {
                penguin -= 900;
            } else if (quak1.equals("-(10% of your worth)")) {
                penguin -= (penguin / 10);
            }
        }
    }
    @FXML
    protected void isClick() throws IOException {
        if (swag.getSelectionModel().isEmpty() || quak.getSelectionModel().isEmpty()) {
            bothCB.setVisible(true);
        }
        if (!swag.getSelectionModel().isEmpty() && !quak.getSelectionModel().isEmpty()) {
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
}
