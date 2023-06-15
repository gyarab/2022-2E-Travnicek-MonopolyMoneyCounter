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
    Label bothCB;
    @FXML
    ChoiceBox<String> figures;
    @FXML
    private final String[] figures1 = {"Duck", "Dog", "Cat", "Penguin"};
    @FXML
    ChoiceBox <String> cards;
    @FXML
    private final String[] cards1 = {"Advance to Go/Illinois Avenue/St. Charles Place (+200$)", "Speeding fine (-15$)",
            "Chairman of the Board (-150$)","Your building loan matures (+150$)", "Take a trip to Reading Railroad, if it is over Go (+200$)"};


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        figures.getItems().addAll(figures1);
        figures.setValue("Pick A Player");
        cards.getItems().addAll(cards1);
        cards.setValue("Pick A Card");
        figures.setOnAction(this::getPlayers);
        cards.setOnAction(this::getPlayers);
    }
    public void getPlayers(ActionEvent e) {
        String kolecko = figures.getValue();
        String cards2 = cards.getValue();

        if(kolecko.equals("Duck")) {
            if(cards2.equals("Advance to Go/Illinois Avenue/St. Charles Place (+200$)")) {
                duck+=200;
            } else if(cards2.equals("Speeding fine (-15$)")){
                duck-=15;
            } else if(cards2.equals("Chairman of the Board (-150$)")) {
                duck-=150;
                dog+=50;
                cat+=50;
                penguin+=50;
            } else if(cards2.equals("Your building loan matures (+150$)")) {
                duck+=150;
            } else if(cards2.equals("Take a trip to Reading Railroad, if it is over Go (+200$)")) {
                duck+=200;
            }
        }
        if(kolecko.equals("Cat")) {
            if(cards2.equals("Advance to Go/Illinois Avenue/St. Charles Place (+200$)")) {
                cat+=200;
            } else if(cards2.equals("Speeding fine (-15$)")){
                cat-=15;
            } else if(cards2.equals("Chairman of the Board (-150$)")) {
                cat-=150;
                dog+=50;
                duck+=50;
                penguin+=50;
            } else if(cards2.equals("Your building loan matures (+150$)")) {
                cat+=150;
            } else if(cards2.equals("Take a trip to Reading Railroad, if it is over Go (+200$)")) {
                cat+=200;
            }
        }
        if(kolecko.equals("Dog")) {
            if(cards2.equals("Advance to Go/Illinois Avenue/St. Charles Place (+200$)")) {
                dog+=200;
            } else if(cards2.equals("Speeding fine (-15$)")){
                dog-=15;
            } else if(cards2.equals("Chairman of the Board (-150$)")) {
                dog-=150;
                cat+=50;
                duck+=50;
                penguin+=50;
            } else if(cards2.equals("Your building loan matures (+150$)")) {
                dog+=150;
            } else if(cards2.equals("Take a trip to Reading Railroad, if it is over Go (+200$)")) {
                dog+=200;
            }
        }
        if(kolecko.equals("Penguin")) {
            if(cards2.equals("Advance to Go/Illinois Avenue/St. Charles Place (+200$)")) {
                penguin+=200;
            } else if(cards2.equals("Speeding fine (-15$)")){
                penguin-=15;
            } else if(cards2.equals("Chairman of the Board (-150$)")) {
                penguin-=150;
                cat+=50;
                duck+=50;
                dog+=50;
            } else if(cards2.equals("Your building loan matures (+150$)")) {
                penguin+=150;
            } else if(cards2.equals("Take a trip to Reading Railroad, if it is over Go (+200$)")) {
                penguin+=200;
            }
        }
    }
    @FXML
    protected void kdyzKlykne() throws IOException {
        if (figures.getSelectionModel().isEmpty() || cards.getSelectionModel().isEmpty()) {
            bothCB.setVisible(true);
        }
        if (!figures.getSelectionModel().isEmpty() && !cards.getSelectionModel().isEmpty()) {
            okaybtn.setOnAction(this::getPlayers);
            Stage steidz = (Stage) okaybtn.getScene().getWindow();
            steidz.close();
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 320);
            stage.setTitle("Monopoly");
            stage.setScene(scene);
            stage.show();
        }
    }
}
