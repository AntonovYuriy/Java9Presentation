import com.ra.jokeserver.kid.KidJokeServer;

module com.ra.jokeserver.kid {
    requires com.ra.jokeserver;

    provides com.ra.jokeserver.JokeServer with KidJokeServer;
    exports com.ra.jokeserver.kid;
}