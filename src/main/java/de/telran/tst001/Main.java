package de.telran.tst001;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Main {
    private static List<Pupil> teamsPupil = new ArrayList<>();
    private static List<TeenAger> teamsTeenAger = new ArrayList<>();
    private static List<Adult> teamsAdult = new ArrayList<>();
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        List<TeamX> teamsList = new ArrayList<>();

        Pupil p1 = new Pupil(FAKER.name().name(), RANDOM.nextInt(11));
        Pupil p2 = new Pupil(FAKER.name().name(), RANDOM.nextInt(11));

        TeenAger t1 = new TeenAger(FAKER.name().name(), RANDOM.nextInt(20));
        TeenAger t2 = new TeenAger(FAKER.name().name(), RANDOM.nextInt(20));

        Adult a1 = new Adult(FAKER.name().name(), RANDOM.nextInt(100));
        Adult a2 = new Adult(FAKER.name().name(), RANDOM.nextInt(100));

        TeamX team1 = new TeamX(FAKER.team().name());
        TeamX team2 = new TeamX(FAKER.team().name());

        team1.addNewParticipant(p1);
        team1.addNewParticipant(p2);

        team2.addNewParticipant(t1);
        team2.addNewParticipant(t2);
        //pt1.play(pt2);

        //Add Team to List
        teamsList.add(team1);
        teamsList.add(team2);
        //Print List of Teams
        System.out.println("Команда №1:" + teamsList.get(0).getTeamName());
        //System.out.println(teamsList.get(0).getTeamName());
        //System.out.println(teamsList.get(0).getParticipantList().get(0));
        for (Object s: teamsList.get(0).getParticipantList()) {
            System.out.println(s);
        }

        System.out.println("Команда №2:" + teamsList.get(1).getTeamName());
        for (Object s: teamsList.get(1).getParticipantList()) {
            System.out.println(s);
        }

    }

}
