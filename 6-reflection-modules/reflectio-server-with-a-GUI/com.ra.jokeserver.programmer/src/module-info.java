import com.ra.jokeserver.JokeServer;
import com.ra.jokeserver.programmer.ProgrammerJokeServer;

module com.ra.jokeserver.programmer {
    requires com.ra.jokeserver;

    provides JokeServer with ProgrammerJokeServer;
}