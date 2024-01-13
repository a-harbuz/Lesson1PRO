package de.telran.team001;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();
    private static List<List<Team>> groupTeams = new ArrayList<>();

    public static void main(String[] args) {
//        Pupil p1 = new Pupil(FAKER.name().name(), RANDOM.nextInt(11));
//        Pupil p2 = new Pupil(FAKER.name().name(), RANDOM.nextInt(11));
//
//        TeenAger t1 = new TeenAger(FAKER.name().name(), RANDOM.nextInt(20));
//        TeenAger t2 = new TeenAger(FAKER.name().name(), RANDOM.nextInt(20));
//
//        Adult a1 = new Adult(FAKER.name().name(), RANDOM.nextInt(100));
//        Adult a2 = new Adult(FAKER.name().name(), RANDOM.nextInt(100));
//
//        Team<Pupil> pt1 = new Team<>(FAKER.team().name());
//        Team<Pupil> pt2 = new Team<>(FAKER.team().name());
//
//        Team<TeenAger> tt1 = new Team<>(FAKER.team().name());
//        Team<TeenAger> tt2 = new Team<>(FAKER.team().name());
//
//        pt1.addNewParticipant(p1);
//        pt2.addNewParticipant(p2);
//
//        tt1.addNewParticipant(t1);
//        tt2.addNewParticipant(t2);
//
//        pt1.play(pt2);


        Generator.generateTeams(groupTeams);
        Generator.schowTeams(groupTeams);



    }
}

