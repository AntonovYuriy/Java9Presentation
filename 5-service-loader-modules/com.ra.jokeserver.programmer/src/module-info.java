import com.ra.jokeserver.JokeServer;

module com.ra.jokeserver.programmer {
    requires com.ra.jokeserver;
    requires java.sql;

  //  exports com.ra.jokeserver.programmer;

    provides JokeServer
            with com.ra.jokeserver.programmer.ProgrammerJokeServer;

}