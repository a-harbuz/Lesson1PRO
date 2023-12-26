package de.telran.pro002Map;

import java.util.*;

public class Main {
    // Using - MAP
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"P");
        map.put(2,"Q");
        map.put(3,"R");
        map.put(4,"U");
        map.put(5,"B");
        map.put(6,"C");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("PQWER","POWER");
        map2.put("PQWER","POWER");
        map2.put("qweqwe","Q");
        map2.put("asdasd","R");
        map2.put("asdassd","U");
        map2.put("asdasdf","B");
        map2.put("zxc","cxz");
        map2.put("PQWER","POWERXX");
        pairKZ(map2);
        System.out.println(map2);
        for (HashMap.Entry<String, String> pairs : map2.entrySet()) {
            System.out.println(pairs.getKey() + " : " + pairs.getValue());
        }
        System.out.println("Пары в Мапе расположены хаотично!!!");
        //System.out.println(map2.get("PQWER")); - взять значение по ключу
    }

    //HashMap<String, String>: Найдите количество пар ключ-значение, где длина ключа равна длине значения.
    private static int findMapPairs(Map<String, String> map) {
        int count = 0;
        for (Map.Entry<String, String> pairs : map.entrySet()) {
            if (pairs.getKey().length() == pairs.getValue().length()) {
                count++;
            }
        }
        return count;

    }

    //HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам,
    // начинающимся на букву 'A'.
    private static int sumAynach (HashMap<String, Integer> map) {
        int sum = 0;

        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            if (pairs.getKey().startsWith("A")) {
                sum += pairs.getValue();
            }
        }
        return sum;
    }


//    HashMap<Integer, List<String>>: Для каждого ключа выведите все строки из соответствующего списка,
//        которые начинаются с гласной буквы.
    private static void strForKey (HashMap<Integer, List<String>> map) {
        int sum = 0;

        for (Map.Entry<Integer, List<String>> pairs : map.entrySet()) {
            for (String s: pairs.getValue()){
                switch (s.toUpperCase().charAt(0)){
                    case 'A', 'E', 'O', 'I' -> System.out.println(s);
                }
            }
        }
    }

    //HashMap<Integer, Integer>: Найдите ключ с максимальным значением и
    // выведите эту пару.
    private static void keyMaxZach (HashMap<Integer, Integer> map) {
        int maxValue = Integer.MIN_VALUE;
        int tempKey = 0;
        for (Map.Entry<Integer, Integer> pairs : map.entrySet()) {
            if (pairs.getValue() > maxValue) {
                maxValue = pairs.getValue();
                tempKey = pairs.getKey();
            }
        }
        System.out.println(tempKey + " : " + maxValue);
    }

//        HashMap<String, String>: Определите, содержит ли HashMap такую пару ключ-значение, где ключ является обратной строкой
//        значения (например, ключ "abc", значение "cba").
    private static void pairKZ (HashMap<String, String> map) {
        int count = 0;
        for (Map.Entry<String, String> pairs : map.entrySet()) {
            //new StringBuilder(str).reverse().toString();
            boolean b = (pairs.getValue().contentEquals(new StringBuilder(pairs.getKey()).reverse()));
            if (b) {
                count++;
            }
        }
        if (count>0) System.out.println("Содержит!");
        else System.out.println("Не Содержит!");
    }

//
//        HashMap<String, Integer>: Переберите HashMap и преобразуйте его в HashMap<String, String>,
//        где каждое значение - это строковое представление исходного числа, умноженного на 2.
    private static HashMap<String, String> pereborXX (HashMap<String, Integer> map) {
        HashMap<String, String> newmap = new HashMap<>();
        for (HashMap.Entry<String, Integer> pairs : map.entrySet()) {
            Integer valInt = pairs.getValue()*2;
            newmap.put(pairs.getKey(), valInt.toString());
        }
        return newmap;
    }
//
//        HashMap<Integer, List<String>>: Создайте второй HashMap<Integer, Integer>,
//        где каждый ключ - это ключ из исходного HashMap, а значение - общее количество символов
//        во всех строках списка этого ключа.
    private static HashMap<Integer, Integer> hashmapOneTwo (HashMap<Integer, List<String>> map) {
        HashMap<Integer, Integer> newmap = new HashMap<>();
        for (Map.Entry<Integer, List<String>> pairs : map.entrySet()) {
            List<String> nlist = pairs.getValue();
            int value = 0;
            for (String s : nlist) {
                value+=s.length();
            }

            newmap.put(pairs.getKey(), value);
        }
        return newmap;
    }

//
//        HashMap<Integer, Integer>: Найдите все пары ключ-значение, где ключ минус значение является простым числом.//
//         //++

//        HashMap<String, String>: Определите, можно ли преобразовать HashMap в List<String>,
//        где каждый элемент - это конкатенация ключа и значения, так, чтобы все элементы списка были уникальными.
          //++ все эл-ты будут уникальны, Хэшмапа хранит только уникальные ключи
//
//        HashMap<String, Integer> и HashMap<Integer, List<String>>: Для каждого ключа в HashMap<String, Integer>
//        найдите соответствующие строки в HashMap<Integer, List<String>>,
//        где ключ во втором HashMap - это значение из первого, и выведите их.
    private static void hashmapFindStr (HashMap<String, Integer> map1, HashMap<Integer, List<String>> map2) {
        for (Map.Entry<String, Integer> pairs : map1.entrySet()) {
            for (HashMap.Entry<Integer, List<String>> inpairs : map2.entrySet()){
                if (inpairs.getKey().equals(pairs.getValue())) {
                    System.out.println(inpairs.getValue());
                }
            }
        }
    }


} // End of Class


