package de.telran.team001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Handler {
    private static List<List<Team>> groupTeams = new ArrayList<>(); // All Commands
    private Map<Team, Integer> resultGames = new HashMap<>(); // All Results

    public static void generate(){
        Generator.generateTeams(groupTeams);
        Generator.schowTeams(groupTeams);
    }
    public static void play(){
        for (List<Team> teamsList: groupTeams) {
            playInGroup(teamsList);
        }
    }
    public static void playInGroup(List<Team> teamsList){
        for (int i = 0; i < teamsList.size(); i++) {
            for (int j = i; j < teamsList.size(); j++) {
                System.out.println( teamsList.get(i).play(teamsList.get(j)) );
            }
        }
    }



} // End of Class
