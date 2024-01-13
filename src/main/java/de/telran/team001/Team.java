package de.telran.team001;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String teamName;
    private List<T> participantList = new ArrayList<>();
    private GroupTeams group;

    public Team(String teamName, GroupTeams group) {
        this.teamName = teamName;
        this.group = group;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<T> getParticipantList() {
        return participantList;
    }

    public GroupTeams getGroup() {
        return group;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setParticipantList(List<T> participantList) {
        this.participantList = participantList;
    }

    public void addNewParticipant(T participant) {
        participantList.add(participant);
    }

    public void play(Team<T> secondTeam) {
        String winner;
        int randomDigit = new Random().nextInt(2);

        if(randomDigit == 0) {
            winner = this.teamName;
        } else {
            winner = secondTeam.teamName;
        }
        System.out.println("WINNER: " + winner + "!!!!!");
    }


}
