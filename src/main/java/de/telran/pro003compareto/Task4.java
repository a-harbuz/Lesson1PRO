package de.telran.pro003compareto;

import java.util.*;

public class Task4 {
//    **Создайте TreeMap<User, String> (класс User как в задаче 3), но на
//    этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.

    public static void main(String[] args) {
        Map<User2, String> map = new TreeMap<>();
//        map.put(new User2("Alice", 25),"idAlice");
//        map.put(new User2("Bob", 18),"idBob");
//        map.put(new User2("Cat", 35),"idCat");
//        map.put(new User2("Pit", 32),"idPit");

        //System.out.println(map.entrySet());
        //Collections.sort(, new NameComparator());

//        for (Map.Entry<User, String> o : map.entrySet()) {
//            Collections.sort(o, new NameComparator());
//            //System.out.println(o.getKey().getAge() + " : " + o.getValue());
//        }

    }


//    static class NameComparator implements Comparator<User> {
//        @Override
//        public int compare (User o1, User o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    }

//    class UserNameComparator implements Comparator<User2> {
//
//        @Override
//        public int compare(User2 o1, User2 o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    }
}
