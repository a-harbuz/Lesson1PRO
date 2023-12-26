package de.telran.pro003MapCompareto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task8 {

//    8**Создайте TreeMap<String, Integer> и переберите его, создавая HashMap<Integer, String>,
//    включающий только те записи, где значение больше 50.
    public static void main(String[] args) {
        TreeMap<String, Integer> treemap1 = new TreeMap<>();
        HashMap<Integer, String> hashmap1 = new HashMap<>();

        for (Map.Entry<String, Integer> pair : treemap1.entrySet()) {
            if (pair.getValue()>50) {
                hashmap1.put(pair.getValue(), pair.getKey());
            }
        }
        System.out.println(hashmap1);
    }

}
