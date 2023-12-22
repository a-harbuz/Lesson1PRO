package de.telran.pro003compareto;

//import java.util.Map;
import javax.xml.namespace.QName;
import java.text.spi.CollatorProvider;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        //newMapNameAge(map);

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

//3**Создайте класс User с полями name и age, реализующий Comparable
//    для сортировки по возрасту. Используйте TreeMap<User, String>
//    для хранения информации о пользователях и переберите его, чтобы напечатать имена.

public class User implements Comparable<User> {
      String Name;
      Integer age;

    public User(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return this.age-o.age;
    }

    public static void newMapFilter (Map<Integer, String> map) {
//        User user1 = new User("Alice", 25);
//        TreeMap<User,String> originaMap = new TreeMap<>();
//        originaMap.put(new User("Alice",25),null);
//        //for
    }
}



}

