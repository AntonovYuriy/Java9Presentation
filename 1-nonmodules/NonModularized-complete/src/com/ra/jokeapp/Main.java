package com.ra.jokeapp;

import com.ra.jokeserver.JokeServer;

public class Main {

    public static void main(String[] args) {
        String filter = args[0];
        final int NUM_JOKES = 20;

        JokeServer s = new JokeServer();

        System.out.printf("Displaying %d random jokes from %s\n", NUM_JOKES, s.name());
        System.out.println("-------------------------------------------");
        for (int i = 0; i < NUM_JOKES; i++) {
            System.out.println(s.getJoke(filter) + "\n");
        }

    }
}