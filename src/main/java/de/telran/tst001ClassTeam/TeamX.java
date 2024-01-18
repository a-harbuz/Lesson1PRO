package de.telran.tst001ClassTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeamX<T> {
    private String teamName;
    private List<T> participantList = new ArrayList<>();

    public TeamX(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<T> getParticipantList() {
        return participantList;
    }
//===========================================================

    public void addNewParticipant(T obj) {
        participantList.add(obj);
    }
//===========================================================

    public void play(TeamX<T> secondTeam) {
        String winner;
        int randomDigit = new Random().nextInt(2);

        if(randomDigit == 0) {
            winner = this.teamName;
        } else {
            winner = secondTeam.teamName;
        }
        System.out.println("WINNER: " + winner + "!!!!!");
    }

    @Override
    public String toString() {
        return "TeamX{" +
                "teamName='" + teamName + '\'' +
                ", participantList=" + participantList +
                '}';
    }
}
