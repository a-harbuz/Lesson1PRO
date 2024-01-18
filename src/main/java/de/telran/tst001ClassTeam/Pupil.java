package de.telran.tst001ClassTeam;

public class Pupil {
    private String name;
    private int age;

    public Pupil(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
