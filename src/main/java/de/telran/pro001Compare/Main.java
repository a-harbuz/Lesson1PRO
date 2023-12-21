package de.telran.pro001Compare;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] simpleArr = {1,7,8,6,5,27,4,12,10};
        List<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(7);
        arrInt.add(8);
        arrInt.add(6);
        arrInt.add(5);
        arrInt.add(27);
        arrInt.add(4);
        arrInt.add(12);
        arrInt.add(10);

        Arrays.sort(simpleArr);
        System.out.println(Arrays.toString(simpleArr));

        Collections.sort(arrInt);
        arrInt.sort(Collections.reverseOrder());
        System.out.println(arrInt);

        ArrayList<Woman> woman = new ArrayList<Woman>();
        woman.add(new Woman(18, "Blond"));
        woman.add(new Woman(21,"Black"));
        woman.add(new Woman(5,"Blond"));
        woman.add(new Woman(14,"Black"));
        woman.add(new Woman(39,"Black"));
        //==var1
        //Collections.sort(woman);
        System.out.println(woman);
        //==var2============================================================
//        Comparator<Woman> compareByHeight = new Comparator<Woman>() {
//            public int compare(Woman o1, Woman o2) {
//                //return o1.age - o2.age;
//                return o1.colorHaare.compareTo(o2.colorHaare);
//            }
//        };
        //Collections.sort(woman, compareByHeight);

        //==var3============================================================
//        System.out.println("==== Var 3 ====");
//        Collections.sort(woman, Comparator.comparing(Woman::getColorHaare));

        //==var4============================================================
        System.out.println("==== Var 4 ====");
        //with Lambda
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

    }

}
