package de.telran.pro003MapCompareto;

import java.util.Comparator;

public class User2{
    // interface Comparable & method compareTo
    private String name;
    private Integer age;

    public User2(String name, Integer age) {
        this.name = name;
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

//    @Override
//    public int compare(User2 o1, User2 o2) {
//        //return o1.getName().compareTo(o2.getName());
//        return o2.getName().compareTo(o1.getName());
//        //return 0;
//    }


    @Override
    public String toString() {
        return "\nUser2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



