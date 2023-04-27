package com.example.monopoly;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.monopoly.HelloController.*;
import static java.lang.Integer.parseInt;


public class RentController extends HelloController implements Initializable {
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
    ChoiceBox<String> rentMoney;
    @FXML
    ChoiceBox<String> players;
    @FXML
    private final String[] players1 = {"Duck", "Dog", "Cat", "Penguin" };
    @FXML
    private final String[] rentMoney1 = {"25$", "50$", "100$" , "200$"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        players.getItems().addAll(players1);
        rentMoney.getItems().addAll(rentMoney1);
        players.setOnAction(this::getPlayers);
        rentMoney.setOnAction(this::getPlayers);
    }
    public void getPlayers(ActionEvent event) {
        String players2 = players.getValue();
        String rent = rentMoney.getValue();


        if (players2 == "Duck") {
            if (rent == "25$") {
                duck -= 25;
            } else if (rent == "50$") {
                duck -= 50;
            } else if (rent == "100$") {
                duck -= 100;
            } else if (rent == "200$") {
                duck -= 200;
            }
        }
        if (players2 == "Dog") {
            if (rent == "25$") {
                dog -= 25;
            } else if (rent == "50$") {
                dog -= 50;
            } else if (rent == "100$") {
                dog -= 100;
            } else if (rent == "200$") {
                dog -= 200;
            }
        }
        if (players2 == "Cat") {
            if (rent == "25$") {
                cat -= 25;
            } else if (rent == "50$") {
                cat -= 50;
            } else if (rent == "100$") {
                cat -= 100;
            } else if (rent == "200$") {
                cat -= 200;
            }
        }
        if (players2 == "Penguin") {
            if (rent == "25$") {
                penguin -= 25;
            } else if (rent == "50$") {
                penguin -= 50;
            } else if (rent == "100$") {
                penguin -= 100;
            } else if (rent == "200$") {
                penguin -= 200;
            }

        } else {
            return;
        }
    }


    @FXML
    protected void isClicked(){
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
