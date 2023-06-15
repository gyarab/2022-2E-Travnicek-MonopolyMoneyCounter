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
import static com.example.monopoly.HelloController.*;

public class NitroController extends HelloController implements Initializable{
    @FXML
    Label duck1 = new Label();
    @FXML
    Label dog1 = new Label();
    @FXML
    Label cat1 = new Label();
    @FXML
    Label penguin1 = new Label();
    @FXML
    private Button okaybtn;
    @FXML
    Label bothCB;
    @FXML
    ChoiceBox<String> koleno1;
    @FXML
    private final String[] players = {"Duck", "Dog", "Cat", "Penguin"};
    @FXML
    ChoiceBox<String> koleno2;
    @FXML
    private final String[] value = {"1-10 (-50$)", "11-20 (-100$)", "21-30 (-150$)", "31-40 (-200$)"};



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        koleno1.getItems().addAll(players);
        koleno1.setValue("Pick A Player");
        koleno2.getItems().addAll(value);
        koleno2.setValue("Pick A Land");
        koleno1.setOnAction(this::getPlayers);
        koleno2.setOnAction(this::getPlayers);
    }

    public void getPlayers(ActionEvent event) {
        String players = koleno1.getValue();
        String value = koleno2.getValue();

        if(players.equals("Duck")) {
            if(value.equals("1-10 (-50$)")){
                duck -= 50;
            } else if(value.equals("11-20 (-100$)")){
                duck-=100;
            } else if(value.equals("21-30 (-150$)")){
                duck-=150;
            }else if(value.equals("31-40 (-200$)")){
                duck-=200;
            }

        }
        if(players.equals("Dog")) {
            if(value.equals("1-10 (-50$)")){
                dog -= 50;
            } else if(value.equals("11-20 (-100$)")){
                dog-=100;
            } else if(value.equals("21-30 (-150$)")){
                dog-=150;
            }else if(value.equals("31-40 (-200$)")){
                dog-=200;
            }
        }
        if(players.equals("Cat")) {
            if(value.equals("1-10 (-50$)")){
                cat -= 50;
            } else if(value.equals("11-20 (-100$)")){
                cat-=100;
            } else if(value.equals("21-30 (-150$)")){
                cat-=150;
            }else if(value.equals("31-40 (-200$)")){
                cat-=200;
            }
        }
        if(players.equals("Penguin")) {
            if(value.equals("1-10 (-50$)")){
                penguin -= 50;
            } else if(value.equals("11-20 (-100$)")){
                penguin-=100;
            } else if(value.equals("21-30 (-150$)")){
                penguin-=150;
            }else if(value.equals("31-40 (-200$)")){
                penguin-=200;
            }
        }
    }

    @FXML
    protected void onClick() throws IOException {
        if (koleno1.getSelectionModel().isEmpty() || koleno2.getSelectionModel().isEmpty()) {
            bothCB.setVisible(true);
        }
        if (! koleno1.getSelectionModel().isEmpty() && ! koleno2.getSelectionModel().isEmpty()) {
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
