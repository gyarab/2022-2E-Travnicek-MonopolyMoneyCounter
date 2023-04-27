package com.example.monopoly;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ConcurrentModificationException;


public class HelloController extends HelloApplication{
    @FXML
    protected static int duck = 1500;
    @FXML
    protected static int dog = 1500;
    @FXML
    protected static int penguin = 1500;
    @FXML
    protected static int cat = 1500;
    @FXML
    protected  Button duck1;
    @FXML
    protected  Button dog1;
    @FXML
    protected  Button cat1;
    @FXML
    protected  Button penguin1;
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
        if(duck1 != null) {
            duck1.setText("Duck's money: " + duck + "$");
        }
        if(dog1 != null) {
            dog1.setText("Dog's money: " + dog + "$");
        }
        if(cat1 != null) {
            cat1.setText("Cat's money: " + cat + "$");
        }
        if(penguin1 != null) {
            penguin1.setText("Penguin's money: " + penguin + "$");
        }
    }
    @FXML
    public void konec() {
        if (duck<=0 && dog <= 0 && cat <= 0) {
            System.out.println("Penguin wins!");
        }
        if(dog<=0 && cat<=0 && penguin<=0) {
            System.out.println("Duck wins!");
        }
        if(duck<=0 && cat<=0 && penguin<=0) {
            System.out.println("Dog wins!");
        }
        if(duck<=0 && dog<=0 && penguin<=0) {
            System.out.println("Cat wins!");
        }
    }

    @FXML
    protected void nitro() throws Exception {
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("nitro.fxml"));
        final Stage Nitro = new Stage();
        money();
        Nitro.initModality(Modality.APPLICATION_MODAL);
        Scene scene2 = new Scene(fxmlLoader2.load(), 600, 400);
        Nitro.setScene(scene2);
        Nitro.show();


    }
    @FXML
    protected void rentie() throws Exception {
        FXMLLoader fxmlLoader3 = new FXMLLoader(HelloApplication.class.getResource("rentie.fxml"));
        final Stage Rentie = new Stage();
        money();
        Rentie.initModality(Modality.APPLICATION_MODAL);
        Scene scene3 = new Scene(fxmlLoader3.load(), 600, 400);
        Rentie.setScene(scene3);
        Rentie.show();
    }
    @FXML
    protected void taxes() throws Exception {
        FXMLLoader fxmlLoader4 = new FXMLLoader(HelloApplication.class.getResource("taxes.fxml"));
        final Stage Taxes = new Stage();
        money();
        Taxes.initModality(Modality.APPLICATION_MODAL);
        Scene scene4 = new Scene(fxmlLoader4.load(), 600, 400);
        Taxes.setScene(scene4);
        Taxes.show();
    }
    @FXML
    protected void round() throws Exception {
        FXMLLoader fxmlLoader5 = new FXMLLoader(HelloApplication.class.getResource("round.fxml"));
        final Stage Round = new Stage();
        money();
        Round.initModality(Modality.APPLICATION_MODAL);
        Scene scene5 = new Scene(fxmlLoader5.load(), 600, 400);
        Round.setScene(scene5);
        Round.show();
    }
    @FXML
    protected void  jail() throws Exception {
        FXMLLoader fxmlLoader6 = new FXMLLoader(HelloApplication.class.getResource("jail.fxml"));
        final Stage Jail = new Stage();
        money();
        Jail.initModality(Modality.APPLICATION_MODAL);
        Scene scene6 = new Scene(fxmlLoader6.load(), 600, 400);
        Jail.setScene(scene6);
        Jail.show();
    }
    @FXML
    protected void plusMinus() throws Exception {
        FXMLLoader fxmlLoader7 = new FXMLLoader(HelloApplication.class.getResource("plusMinus.fxml"));
        final Stage PlusMinus = new Stage();
        money();
        PlusMinus.initModality(Modality.APPLICATION_MODAL);
        Scene scene6 = new Scene(fxmlLoader7.load(), 600, 400);
        PlusMinus.setScene(scene6);
        PlusMinus.show();
    }
}