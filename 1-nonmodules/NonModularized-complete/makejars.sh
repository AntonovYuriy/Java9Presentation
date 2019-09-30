#!/usr/bin/env bash
jar -c -f jars/JokeServer.jar  -C out .
jar -c -f jars/JokeServerApp.jar --main-class com.ra.jokeapp.Main -C out  .
