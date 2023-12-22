package de.telran.pro003compareto;

import java.util.*;

public class Task3 {
//3**Создайте класс User с полями name и age,
// реализующий Comparable для сортировки по возрасту.
//Используйте TreeMap<User, String>
//для хранения информации о пользователях и переберите его, чтобы напечатать имена.
    public static void main(String[] args) {
        Map<User, String> map = new TreeMap<>();
        map.put(new User("Alice", 25),"idAlice");
        map.put(new User("Bob", 18),"idBob");
        map.put(new User("Cat", 35),"idCat");
        map.put(new User("Pit", 32),"idPit");

        for (Map.Entry<User, String> o : map.entrySet()) {
            System.out.println(o.getKey().getAge() + " : " + o.getValue());
        }
    }

}



