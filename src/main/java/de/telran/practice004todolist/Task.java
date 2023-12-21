package de.telran.practice004todolist;

public class Task {
    private String name;
    private String description;
    private boolean isMade;

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public boolean getIsMade() {
        return isMade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsMade(boolean made) {
        isMade = made;
    }

    public Task(String name, String description, boolean isMade){
        this.name = name;
        this.description = description;
        this.isMade = isMade;
    }
    public Task(String name, String description){
        this.name = name;
        this.description = description;
        this.isMade = false;
    }



}
