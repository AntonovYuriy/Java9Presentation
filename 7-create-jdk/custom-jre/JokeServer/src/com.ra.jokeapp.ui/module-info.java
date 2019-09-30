import com.ra.jokeserver.JokeServer;

module com.ra.jokeapp.ui {

    requires com.ra.jokeserver;
    requires com.ra.jokeserver.kid;
    requires com.ra.jokeserver.programmer;

    requires javafx.controls;
    requires javafx.fxml;

    uses JokeServer;

    opens com.ra.jokeapp.ui to javafx.graphics, javafx.fxml;

}
