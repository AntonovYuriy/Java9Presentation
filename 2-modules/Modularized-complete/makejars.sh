#!/usr/bin/env bash
jar -c -f jars/JokeServer.jar  -C out/com.ra.jokeserver .
jar -c -f jars/JokeServerApp.jar --main-class com.ra.jokeapp.Main -C out/com.ra.jokeapp  .
