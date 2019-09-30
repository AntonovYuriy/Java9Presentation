package com.ra.jokeapp.ui;

import com.ra.jokeserver.JokeServer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

import java.util.ServiceLoader;

public class Controller {

  //  JokeServer kidServer = new KidJokeServer();
  //  JokeServer programmerServer = new ProgrammerJokeServer();

    private ServiceLoader<JokeServer> loader;

    @FXML
    private TextArea jokeTextArea;

    @FXML
    private HBox buttonsArea;

    @FXML
    private void initialize() {
        System.out.println("Init in Controller");
        loader = ServiceLoader.load(JokeServer.class);
        buttonsArea.setSpacing(10);
        loader.forEach(t-> {
            Button b = new Button(t.name());
            b.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    jokeTextArea.setText(t.getJoke());
                }
            });
            buttonsArea.getChildren().add(b);

        });
        Button b = new Button("Clear");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                jokeTextArea.clear();
            }
        });
        buttonsArea.getChildren().add(b);

    }


    public void displayKidJoke(ActionEvent actionEvent) {
   //     jokeTextArea.setText(kidServer.getJoke());

    }

    public void displayProgrammerJoke(ActionEvent actionEvent) {
   //     jokeTextArea.setText(programmerServer.getJoke());
    }

    public void clearJokeArea(ActionEvent actionEvent) {
        jokeTextArea.clear();
    }

}
