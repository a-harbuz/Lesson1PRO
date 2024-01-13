package de.telran.team001;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    //private static final Faker FAKER = new Faker();
    //private static final Random RANDOM = new Random();
    //private static List<List<Team>> groupTeams = new ArrayList<>();

    public static void main(String[] args) {

        Handler.generate();
        Handler.play();

    }

}

