package com.example.monopoly;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

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
    ChoiceBox<String> swag;
    @FXML
    ChoiceBox<String> quak;
    @FXML
    private final String[] players = {"Duck", "Dog", "Cat", "Penguin"};
    @FXML
    private final String[] value = {"900$", "10% of your worth"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        swag.getItems().addAll(players);
        quak.getItems().addAll(value);
        swag.setOnAction(this::getPlayers);
        quak.setOnAction(this::getPlayers);
    }

    public void getPlayers(ActionEvent event) {
        String swag1 = swag.getValue();
        String quak1 = quak.getValue();

            if (swag1 == "Duck") {
                if (quak1 == "900$") {
                    duck -= 900;
                } else if (quak1 == "10% of your worth") {
                    duck -= (duck/ 10);
                }
            }
            if (swag1 == "Dog") {
                if (quak1 == "900$") {
                    dog -= 900;
                } else if (quak1 == "10% of your worth") {
                    dog -= (dog / 10);
                }
            }
            if (swag1 == "Cat") {
                if (quak1 == "900$") {
                    cat -= 900;
                } else if (quak1 == "10% of your worth") {
                    cat -= (cat / 10);
                }
            }
        if (swag1 == "Penguin") {
            if (quak1 == "900$") {
                penguin -= 900;
            } else if (quak1 == "10% of your worth") {
                penguin -= (penguin / 10);
            }
        }
    }
    @FXML
    protected void isClick(){
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
