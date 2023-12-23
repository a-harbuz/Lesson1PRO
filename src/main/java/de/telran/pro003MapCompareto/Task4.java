package de.telran.pro003MapCompareto;

import com.github.javafaker.Faker;

import java.util.*;

public class Task4 {
//    **Создайте TreeMap<User, String> (класс User как в задаче 3), но на
//    этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.
    private final static Faker FAKER = new Faker();
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        //Map<User, String> map = new TreeMap<>();
        Map<User, String> map = new HashMap<>();
        map.put(new User("Bob", 25),"idAlice");
        map.put(new User("Alice", 18),"idBob");
        map.put(new User("Pit", 35),"idCat");
        map.put(new User("Cat", 32),"idPit");

        //System.out.println(map.entrySet());


        List<User> list = new ArrayList<>();
        for (Map.Entry<User, String> o : map.entrySet()) {
            list.add(o.getKey());
            //Collections.sort(o, new NameComparator());
            System.out.println(o.getKey().getAge() + " : " + o.getValue());
        }

        Collections.sort(list,  new NameComparator());

        for (User s : list) {
            System.out.println(s.getName());
        }


    }


    static class NameComparator implements Comparator<User> {
        @Override
        public int compare (User o1, User o2) {
            //return o1.getName().compareTo(o2.getName());
            return o2.getName().compareTo(o1.getName());
        }
    }

//    class UserNameComparator implements Comparator<User2> {
//
//        @Override
//        public int compare(User2 o1, User2 o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    }
}
