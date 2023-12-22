package de.telran.pro003compareto;

import java.util.Comparator;

public class User implements Comparable<User> { //добавили возможность сортировки
    // interface Comparable & method compareTo
    private String Name;
    private Integer age;

    public User(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo (User o) { //указали, как именно будем сортировать по умолчанию
        return this.age-o.age;
    }

    //3**Создайте класс User с полями name и age, реализующий Comparable
    //        для сортировки по возрасту



}


