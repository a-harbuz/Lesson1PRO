package de.telran.pro003compareto;

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
        Map<String, User> hashmap2 = new HashMap<>();

    }

}
