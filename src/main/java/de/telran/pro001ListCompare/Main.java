package de.telran.pro001ListCompare;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] simpleArr = {1,7,8,6,5,27,4,12,10};
        List<Integer> arrInt = new ArrayList<>(); //List - Collection
        arrInt.add(1);
        arrInt.add(7);
        arrInt.add(8);
        arrInt.add(6);
        arrInt.add(5);
        arrInt.add(27);
        arrInt.add(4);
        arrInt.add(12);
        arrInt.add(10);

        Arrays.sort(simpleArr); // Сортировка простого массива
        ArrayUtils.reverse(simpleArr);
        System.out.println("Простой массив:");
        System.out.println(simpleArr);
        System.out.println(Arrays.toString(simpleArr));

        Collections.sort(arrInt); // Сортировка простого массива Integer
        arrInt.sort(Collections.reverseOrder());
        System.out.println("Лист Интеджеров:");
        System.out.println(arrInt);
//=========================================================================================
        ArrayList<Woman> woman = new ArrayList<Woman>(); //List - Collection - Array of Object
        woman.add(new Woman(18, "Blond"));
        woman.add(new Woman(21,"Black"));
        woman.add(new Woman(5,"Blond"));
        woman.add(new Woman(14,"Black"));
        Woman w1 = new Woman(39,"Black");
        woman.add(w1);
        //System.out.println("Лист Обьектов:");
        //System.out.println(woman);
        //System.out.println(woman.contains(w1)); //поиск эл-та

        //==var1
        System.out.println("==== Var 1 ====");
        //Collections.sort(woman); - без компаратора не работает
        //Comparator.comparing(Woman::getAge);
        //System.out.println(woman);

        //==var2============================================================
        //===>> Сортировка Листа с Обьектами <===
//        Comparator<Woman> compareByHeight = new Comparator<Woman>() {
//            public int compare(Woman o1, Woman o2) {
//                //return o1.age - o2.age;
//                return o1.colorHaare.compareTo(o2.colorHaare);
//            }
//        };
//        Collections.sort(woman, compareByHeight);
//        woman.sort(compareByHeight); //тоже самое
//        System.out.println(woman);

        //==var3============================================================
//        System.out.println("==== Var 3 ====");
//        // Сокращен.вариант с исп.лямбда
//        Collections.sort(woman, Comparator.comparing(Woman::getColorHaare));

        //==var4============================================================
        System.out.println("==== Var 4 ====");
        // Сокращен.вариант с исп.лямбда
        //(final Woman h1, final Woman h2) -> h1.getColorHaare().compareTo(h2.getColorHaare());
        woman.sort(
                (Woman h1, Woman h2) -> h1.getColorHaare().compareTo(h2.getColorHaare())
        );

//        for (Woman s: woman){
//            System.out.println(s);
//        }

        //woman.forEach(Woman::getColorHaare);
        woman.forEach(System.out::println);
        //============================================================

        List<Woman> inventory = Arrays.asList(
                new Woman( 2015, "white"), new Woman(2009, "black"));
        //inventory.add(new Woman( 2016, "white"));
        //Collections.sort(inventory, Comparator.comparing(Woman::getColorHaare));
        inventory.forEach(System.out::println);
//=============================================================================================
        List<String> strL = new ArrayList<>();
        strL.add("One");
        strL.add("Two");
        strL.add("Three");
        System.out.println(strL); // => [One, Two, Three]
        System.out.println(strL.get(2));

        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("One");
        linkedlist.add("Two");
        linkedlist.add("Three");
        System.out.println(linkedlist); // => [One, Two, Three]
        System.out.println(linkedlist.get(2));
    }




}
