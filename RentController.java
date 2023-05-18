package com.example.monopoly;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.monopoly.HelloController.*;
import static java.lang.Integer.parseInt;


public class RentController extends HelloController implements Initializable {
    @FXML
    Label duck1;
    @FXML
    Label dog1;
    @FXML
    Label cat1;
    @FXML
    Label penguin1;
    @FXML
    private Button okaybtn;
    @FXML
    ChoiceBox<String> rentMoney;
    @FXML
    ChoiceBox<String> players;
    @FXML
    private final String[] players1 = {"Duck", "Dog", "Cat", "Penguin" };
    @FXML
    private final String[] rentMoney1 = {"Small House (-25$)", "Big House (-50$)", "Small Hotel (-100$)" , "Big Hotel (-200$)"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        players.getItems().addAll(players1);
        players.setValue("Pick A Player");
        rentMoney.getItems().addAll(rentMoney1);
        rentMoney.setValue("Pick A Building");
        players.setOnAction(this::getPlayers);
        rentMoney.setOnAction(this::getPlayers);
    }
    public void getPlayers(ActionEvent event) {
        String players2 = players.getValue();
        String rent = rentMoney.getValue();


        if (players2.equals("Duck")) {
            if (rent.equals("Small House (-25$)")) {
                duck -= 25;
            } else if (rent.equals("Big House (-50$)")) {
                duck -= 50;
            } else if (rent.equals("Small Hotel (-100$)")) {
                duck -= 100;
            } else if (rent.equals("Big Hotel (-200$)")) {
                duck -= 200;
            }
        }
        if (players2.equals("Dog")) {
            if (rent.equals("Small House (-25$)")) {
                dog -= 25;
            } else if (rent.equals("Big House (-50$)")) {
                dog -= 50;
            } else if (rent.equals("Small Hotel (-100$)")) {
                dog -= 100;
            } else if (rent.equals("Big Hotel (-200$)")) {
                dog -= 200;
            }
        }
        if (players2.equals("Cat")) {
            if (rent.equals("Small House(-25$")) {
                cat -= 25;
            } else if (rent.equals("Big House (-50$)")) {
                cat -= 50;
            } else if (rent.equals("Small Hotel (-100$)")) {
                cat -= 100;
            } else if (rent.equals("Big Hotel (-200$)")) {
                cat -= 200;
            }
        }
        if (players2.equals("Penguin")) {
            if (rent.equals("Small House (-25$)")) {
                penguin -= 25;
            } else if (rent.equals("Big House (-50$)")) {
                penguin -= 50;
            } else if (rent.equals("Small Hotel (-100$)")) {
                penguin -= 100;
            } else if (rent.equals("Big Hotel (-200$)")) {
                penguin -= 200;
            }

        } else {
            return;
        }
    }


    @FXML
    protected void isClicked() throws IOException {
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
