package de.telran.tst001;

public class TeenAger {
    private String name;
    private int age;

    public TeenAger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TeenAger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
