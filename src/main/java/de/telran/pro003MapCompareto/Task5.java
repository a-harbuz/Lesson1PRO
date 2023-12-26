package de.telran.pro003MapCompareto;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task5 {
    private final static Faker FAKER = new Faker();
    private final static Random RANDOM = new Random();
//    5**Создайте два HashMap<String, User> (класс User как в задаче 3) и
//    объедините их в один, удалив дубликаты пользователей.
    public static void main(String[] args) {
        Map<String, User> hashmap1 = new HashMap<>();
        hashmap1.put("Вася", new User("Вася",2));
        hashmap1.put("Петя", new User("Петя",22));
        hashmap1.put("Гоша", new User("Гоша",12));

        Map<String, User> hashmap2 = new HashMap<>();
        hashmap2.put("Егор", new User("Егор",14));
        hashmap2.put("Максим", new User("Максим",13));
        hashmap2.put("Гоша", new User("Гоша",12));
        hashmap2.put("Гоша", new User("Гоша",13));
        hashmap2.put("Гоша", new User("Гоша",14));
        //одинаковый ключ - перезаписывает значение, остается только последнее.

        //putAll - склейка Мап-ов
        hashmap1.putAll(hashmap2); //дубликаты удаляет сам
        System.out.println(hashmap1);

        System.out.println(hashmap2.get("Гоша"));
        System.out.println(hashmap2.get("Гоша").getAge());
    }

}
