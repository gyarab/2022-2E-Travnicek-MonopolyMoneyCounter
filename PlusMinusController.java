package com.example.monopoly;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PlusMinusController extends HelloController implements Initializable {

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
    ChoiceBox<String> figures;
    @FXML
    private final String[] figures1 = {"Duck", "Dog", "Cat", "Penguin"};
    @FXML
    ChoiceBox <String> cards;
    @FXML
    private final String[] cards1 = {"Advance to Go/Illinois Avenue/St. Charles Place", "Speeding fine",
            "Chairman of the Board","Your building loan matures", "Take a trip to Reading Railroad, if it is over Go"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        figures.getItems().addAll(figures1);
        cards.getItems().addAll(cards1);
        //figures.setOnAction(this::getPlayers);
        //cards.setOnAction(this::getPlayers);
    }
    public void getPlayers(ActionEvent e) {
        String kolecko = figures.getValue();
        String cards2 = cards.getValue();

        if(kolecko == "Duck") {
            if(cards2 == "Advance to Go/Illinois Avenue/St. Charles Place") {
                duck+=200;
            } else if(cards2 == "Speeding fine"){
                duck-=15;
            } else if(cards2 == "Chairman of the Board") {
                duck-=150;
                dog+=50;
                cat+=50;
                penguin+=50;
            } else if(cards2 == "Your building loan matures") {
                duck+=150;
            } else if(cards2 == "Take a trip to Reading Railroad, if it is over Go") {
                duck+=200;
            }
        }
        if(kolecko == "Cat") {
            if(cards2 == "Advance to Go/Illinois Avenue/St. Charles Place") {
                cat+=200;
            } else if(cards2 == "Speeding fine"){
                cat-=15;
            } else if(cards2 == "Chairman of the Board") {
                cat-=150;
                dog+=50;
                duck+=50;
                penguin+=50;
            } else if(cards2 == "Your building loan matures") {
                cat+=150;
            } else if(cards2 == "Take a trip to Reading Railroad, if it is over Go") {
                cat+=200;
            }
        }
        if(kolecko == "Dog") {
            if(cards2 == "Advance to Go/Illinois Avenue/St. Charles Place") {
                dog+=200;
            } else if(cards2 == "Speeding fine"){
                dog-=15;
            } else if(cards2 == "Chairman of the Board") {
                dog-=150;
                cat+=50;
                duck+=50;
                penguin+=50;
            } else if(cards2 == "Your building loan matures") {
                dog+=150;
            } else if(cards2 == "Take a trip to Reading Railroad, if it is over Go") {
                dog+=200;
            }
        }
        if(kolecko == "Penguin") {
            if(cards2 == "Advance to Go/Illinois Avenue/St. Charles Place") {
                penguin+=200;
            } else if(cards2 == "Speeding fine"){
                penguin-=15;
            } else if(cards2 == "Chairman of the Board") {
                penguin-=150;
                cat+=50;
                duck+=50;
                dog+=50;
            } else if(cards2 == "Your building loan matures") {
                penguin+=150;
            } else if(cards2 == "Take a trip to Reading Railroad, if it is over Go") {
                penguin+=200;
            }
        }
    }
    @FXML
    protected void kdyzKlykne() {
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
        Stage steidz = (Stage) okaybtn.getScene().getWindow();
        steidz.close();
    }
}
