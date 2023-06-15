package com.example.monopoly;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ConcurrentModificationException;
import java.util.ResourceBundle;


public class HelloController extends HelloApplication implements Initializable {
    @FXML
    protected static int duck = 1500;
    @FXML
    protected static int dog = 1500;
    @FXML
    protected static int penguin = 1500;
    @FXML
    protected static int cat = 1500;
    @FXML
    public Label duck1 = new Label();
    @FXML
    public Label dog1 = new Label();
    @FXML
    public Label cat1 = new Label();
    @FXML
    public Label penguin1 = new Label();
    @FXML
    protected Button buyNewLandbtn;
    @FXML
    protected Button rentbtn;
    @FXML
    protected Button improvbtn;
    @FXML
    protected Button roundbtn;
    @FXML
    protected Button jailbtn;
    @FXML
    protected Button chancebtn;

    @FXML
    public void money() {
        if (duck > 0) {
            duck1.setText("          Duck's money: " + duck + "$");
        } else {
            duck1.setText("          Duck's money: 0$");
        }
        if (dog > 0) {
            dog1.setText("          Dog's money: " + dog + "$");
        } else {
            dog1.setText("          Dog's money: 0$");
        }
        if (cat > 0) {
            cat1.setText("          Cat's money: " + cat + "$");
        } else {
            cat1.setText("          Cat's money: 0$");
        }
        if (penguin > 0) {
            penguin1.setText("       Penguin's money: " + penguin + "$");
        } else {
            penguin1.setText("       Penguin's money: 0$");
        }
    }

    @FXML
    public void konec() {
        if (duck <= 0 && dog <= 0 && cat <= 0) {
            System.out.println("Penguin wins!");
        }
        if (dog <= 0 && cat <= 0 && penguin <= 0) {
            System.out.println("Duck wins!");
        }
        if (duck <= 0 && cat <= 0 && penguin <= 0) {
            System.out.println("Dog wins!");
        }
        if (duck <= 0 && dog <= 0 && penguin <= 0) {
            System.out.println("Cat wins!");
        }
    }
            @FXML
            protected void nitro () throws Exception {
                FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("nitro.fxml"));
                Stage Nitro = new Stage();
                money();
                konec();
                Nitro.initModality(Modality.APPLICATION_MODAL);
                Scene scene2 = new Scene(fxmlLoader2.load(), 600, 400);
                Nitro.setScene(scene2);
                Nitro.show();
                Stage stage = (Stage) buyNewLandbtn.getScene().getWindow();
                stage.close();

            }
            @FXML
            protected void rentie () throws Exception {
                FXMLLoader fxmlLoader3 = new FXMLLoader(HelloApplication.class.getResource("rentie.fxml"));
                final Stage Rentie = new Stage();
                money();
                konec();
                Rentie.initModality(Modality.APPLICATION_MODAL);
                Scene scene3 = new Scene(fxmlLoader3.load(), 600, 400);
                Rentie.setScene(scene3);
                Rentie.show();
                Stage stage = (Stage) rentbtn.getScene().getWindow();
                stage.close();
            }
            @FXML
            protected void taxes () throws Exception {
                FXMLLoader fxmlLoader4 = new FXMLLoader(HelloApplication.class.getResource("taxes.fxml"));
                final Stage Taxes = new Stage();
                money();
                konec();
                Taxes.initModality(Modality.APPLICATION_MODAL);
                Scene scene4 = new Scene(fxmlLoader4.load(), 600, 400);
                Taxes.setScene(scene4);
                Taxes.show();
                Stage stage = (Stage) improvbtn.getScene().getWindow();
                stage.close();
            }
            @FXML
            protected void round () throws Exception {
                FXMLLoader fxmlLoader5 = new FXMLLoader(HelloApplication.class.getResource("round.fxml"));
                final Stage Round = new Stage();
                money();
                konec();
                Round.initModality(Modality.APPLICATION_MODAL);
                Scene scene5 = new Scene(fxmlLoader5.load(), 600, 400);
                Round.setScene(scene5);
                Round.show();
                Stage stage = (Stage) roundbtn.getScene().getWindow();
                stage.close();
            }
            @FXML
            protected void jail () throws Exception {
                FXMLLoader fxmlLoader6 = new FXMLLoader(HelloApplication.class.getResource("jail.fxml"));
                final Stage Jail = new Stage();
                money();
                konec();
                Jail.initModality(Modality.APPLICATION_MODAL);
                Scene scene6 = new Scene(fxmlLoader6.load(), 600, 400);
                Jail.setScene(scene6);
                Jail.show();
                Stage stage = (Stage) jailbtn.getScene().getWindow();
                stage.close();
            }
            @FXML
            protected void plusMinus () throws Exception {
                FXMLLoader fxmlLoader7 = new FXMLLoader(HelloApplication.class.getResource("plusMinus.fxml"));
                final Stage PlusMinus = new Stage();
                money();
                konec();
                PlusMinus.initModality(Modality.APPLICATION_MODAL);
                Scene scene6 = new Scene(fxmlLoader7.load(), 600, 400);
                PlusMinus.setScene(scene6);
                PlusMinus.show();
                Stage stage = (Stage) chancebtn.getScene().getWindow();
                stage.close();
            }

            @Override
            public void initialize (URL url, ResourceBundle resourceBundle){
                money();
            }
        }
