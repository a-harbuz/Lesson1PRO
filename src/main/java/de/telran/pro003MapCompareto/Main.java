package de.telran.pro003MapCompareto;

//import java.util.Map;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Alice", 25);
        map.put("Bobbbbbb", 30);
        map.put("Charlie", 35);
        //newMapNameAge(map);
        System.out.println(map);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(25,"Alice");
        map1.put(30,"Bob");
        map1.put(120,"Charlie");
        newMapFilter(map1);

    }


//**Создайте HashMap<String, Integer>, заполните его парами
//"имя-возраст". Используйте цикл for-each для удвоения возраста каждого человека.
    public static void newMapNameAge (Map<String, Integer> map){

        for (Map.Entry<String, Integer> pairs : map.entrySet()){
            pairs.setValue(pairs.getValue()*2);
        }

        System.out.println(map);
    }

//***Создайте HashMap<Integer, String>, представляющий
//"ID-имя пользователя". Используйте цикл для фильтрации
//    пользователей с ID больше 100 и копируйте их в TreeMap.
public static void newMapFilter (Map<Integer, String> map){
    Map<Integer, String> treemap = new TreeMap<Integer, String>();
    for (Map.Entry<Integer, String> pairs : map.entrySet()){
        if (pairs.getKey()>100) {
            treemap.put(pairs.getKey(),pairs.getValue());
        }
    }

    System.out.println(treemap);
}





}

