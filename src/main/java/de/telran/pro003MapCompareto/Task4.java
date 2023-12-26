package de.telran.pro003MapCompareto;

import com.github.javafaker.Faker;

import java.util.*;

public class Task4 {
//    **Создайте TreeMap<User, String> (класс User как в задаче 3), но на
//    этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.
    private final static Faker FAKER = new Faker();
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        TreeMap<User2, String> map = new TreeMap<User2, String>(new MyComparator());
        //Map<User, String> map = new HashMap<>();
        map.put(new User2("Bob", 25),"idAlice");
        map.put(new User2("Alice", 18),"idBob");
        map.put(new User2("Pit", 35),"idCat");
        map.put(new User2("Cat", 32),"idPit");

        System.out.println(map);

    }

    static class MyComparator implements Comparator<User2> {
        @Override
        public int compare (User2 o1, User2 o2) {
            return o1.getName().compareTo(o2.getName());
            //return o1.getAge() - o2.getAge();
        }
    }



}
