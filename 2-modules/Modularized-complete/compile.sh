#!/usr/bin/env bash
#javac --module-source-path src -d out $(find . -name '*.java')

javac -d out --module-path lib --module-source-path src -m com.ra.jokeapp
