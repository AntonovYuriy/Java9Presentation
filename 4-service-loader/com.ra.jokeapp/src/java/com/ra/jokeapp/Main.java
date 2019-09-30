package com.ra.jokeapp;

import com.ra.jokeserver.JokeServer;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

//import KidJokeServer;


public class Main {

    public static void main(String[] args) {

        ServiceLoader<JokeServer> loader = ServiceLoader.load(JokeServer.class);
        AtomicInteger integer = new AtomicInteger();
        LinkedHashMap<String, JokeServer> servers = loader.stream().collect(Collectors.toMap(
                (Function<Object, String>) o -> String.valueOf(integer.incrementAndGet()),
                ServiceLoader.Provider::get, (o1, o2) -> o1,
                LinkedHashMap::new));
        //LinkedHashMap<String, JokeServer> servers = new LinkedHashMap<>();

//        servers.put("1",new KidJokeServer());
//        servers.put("2",new ProgrammerJokeServer());

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {

            servers.forEach((k,v) -> System.out.printf("%s: %s\n", k, v.name()));

            System.out.print("(Q to quit) : ");
            choice = scanner.nextLine().trim().toUpperCase();

            if (servers.containsKey(choice)) {
                System.out.println(servers.get(choice).getJoke() + "\n");
            } else if (!choice.equals("Q")) {
                System.out.println("Sorry, try again. ");
            }

        } while (!choice.equals("Q"));

        System.out.println("Thanks! I hope you laughed!!");
    }
}