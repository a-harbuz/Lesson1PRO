package de.telran.team001;

import java.util.*;

public class Handler {
    private static List<List<Team>> groupTeams = new ArrayList<>(); // All Commands
    private static Map<Team, Double> resultGames = new HashMap<>(); // All Results

    public static void generate(){
        Generator.generateTeams(groupTeams);
        //Generator.schowTeams(groupTeams);
    }
    public static void play(){
        //Commands play in each Group
        for (List<Team> teamsList: groupTeams) {
            playInGroup(teamsList);
            //Sort Map by Value
//            resultGames.entrySet().stream()
//                    .sorted(Map.Entry.<Team, Double>comparingByValue().reversed())
//                    .forEach(System.out::println);
            //showMap();
            //System.out.println(resultGames.entrySet());
        }


    }
    public static void playInGroup(List<Team> teamsList){
        //plays in one Group
        for (int i = 0; i < teamsList.size(); i++) {
            double result = 0;
            for (int j = i; j < teamsList.size(); j++) {
                if (i!=j) {
                    //System.out.println(i+" :  "+j); // 3*300 strok
                    result+=teamsList.get(i).play(teamsList.get(j));
                }
            }
            resultGames.put(teamsList.get(i),result);
        }
    }

    public static void showMap(){
        for (Map.Entry<Team,Double> m : resultGames.entrySet()){
            System.out.println(m.getKey().getTeamName() + " : " + m.getValue());
        }
    }

    //Найти команду с максимальными баллами:
    public Team<?> teamMax(){
        Team<?> prevTeam = null;
        double prevValue = 0;
        for (Map.Entry<Team,Double> m : resultGames.entrySet()){
            prevTeam = m.getKey();
            if (m.getValue() > prevValue) {
                prevValue =  m.getValue();
                prevTeam = m.getKey();
            }
        }
        System.out.println(prevTeam.getTeamName() + " : " + prevValue);
        return prevTeam;
    }

    //Подсчет общего количества баллов:
    public double sumValue(){
        double sum = 0;
        for (Map.Entry<Team,Double> m : resultGames.entrySet()){
            sum+=m.getValue();
        }
        return sum;
    }

} // End of Class
