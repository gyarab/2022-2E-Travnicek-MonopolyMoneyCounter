package com.example.monopoly;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import static com.example.monopoly.HelloController.*;

public class NitroController extends HelloController implements Initializable{
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
    ChoiceBox<String> koleno1;
    @FXML
    private final String[] players = {"Duck", "Dog", "Cat", "Penguin"};
    @FXML
    ChoiceBox<String> koleno2;
    @FXML
    private final String[] value = {"1-10", "11-20", "21-30", "31-40"};



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        koleno1.getItems().addAll(players);
        koleno2.getItems().addAll(value);
        koleno1.setOnAction(this::getPlayers);
        koleno2.setOnAction(this::getPlayers);
    }

    public void getPlayers(ActionEvent event) {
        String players = koleno1.getValue();
        String value = koleno2.getValue();

        if(players=="Duck") {
            if(value=="1-10"){
                duck -= 50;
            } else if(value=="11-20"){
                duck-=100;
            } else if(value=="21-30"){
                duck-=150;
            } else if(value=="31-40"){
                duck-=200;
            }
        }
        if(players=="Dog") {
            if(value=="1-10"){
                dog -= 50;
            } else if(value=="11-20"){
                dog-=100;
            } else if(value=="21-30"){
                dog-=150;
            }else if(value=="31-40"){
                dog-=200;
            }
        }
        if(players=="Cat") {
            if(value=="1-10"){
                cat -= 50;
            } else if(value=="11-20"){
                cat-=100;
            } else if(value=="21-30"){
                cat-=150;
            }else if(value=="31-40"){
                cat-=200;
            }
        }
        if(players=="Penguin") {
            if(value=="1-10"){
                penguin -= 50;
            } else if(value=="11-20"){
                penguin-=100;
            } else if(value=="21-30"){
                penguin-=150;
            }else if(value=="31-40"){
                penguin-=200;
            }

        } else {
            return;
        }
    }
    @FXML
    protected void onClick() {
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
