package com.ra.jokeapp.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final File f = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        System.out.println("Classpath is " + f.getAbsolutePath());
        Parent root = FXMLLoader.load(getClass().getResource("JokeGUI.fxml"));
        primaryStage.setTitle("Tell me a Joke");
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }}
