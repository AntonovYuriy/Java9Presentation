#!/usr/bin/env bash
javac --source-path src -d out $(find . -name '*.java')

#javac -d out src/com/ra/jokeapp/Main.java \
#src/com/ra/jokeserver/JokeServer.java \
#src/com/ra/jokeserver/internal/Filter.java
