package de.telran.pro003compareto;

import java.util.Comparator;

public class User2 {
    // interface Comparable & method compareTo
    private String name;
    private Integer age;

    public User2(String name, Integer age) {
        name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}



