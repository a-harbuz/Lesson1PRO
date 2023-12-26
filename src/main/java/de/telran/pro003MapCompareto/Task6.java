package de.telran.pro003MapCompareto;

import java.util.HashMap;
import java.util.Map;

public class Task6 {

//    6**Создайте HashMap<Integer, String> и перепишите его в TreeMap<String, Integer>,
//    инвертируя ключи и значения.
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap1 = new HashMap<>();
        hashmap1.put(2, "Вася");
        hashmap1.put(22, "Петя");
        hashmap1.put(12, "Гоша");

        HashMap<String, Integer> treemap1 = new HashMap<>();

        for (Map.Entry<Integer, String> o : hashmap1.entrySet()) {
            treemap1.put(o.getValue(), o.getKey());
        }

        System.out.println(treemap1);

        }

}
