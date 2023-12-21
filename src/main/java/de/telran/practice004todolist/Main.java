package de.telran.practice004todolist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int sizeArr = 1_000_000;
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //System.out.println("Add ArrayList");
        double start = System.currentTimeMillis();
        for (int i = 0; i < sizeArr; i++) {
            list1.add(i);
        }
        double end = System.currentTimeMillis();
        System.out.println("Add ArrayList,Time:" + (end-start));


        //System.out.println("Add LinkedList");
        start = System.currentTimeMillis();
        for (int i = 0; i < sizeArr; i++) {
            list2.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Add LinkedList, Time:" + (end-start));

        //Remove in Zenter !!!
        start = System.currentTimeMillis();
        for (int i = list1.size()-1000; i >=1000; i--) {
            list1.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Remove ArrayList, Time:" + (end-start));

        start = System.currentTimeMillis();
        for (int i = list1.size()-1000; i >=1000; i--) {
            list2.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Remove LinkedList, Time:" + (end-start));



        //Add inside
        start = System.currentTimeMillis();
        for (int i = 1000; i < sizeArr-1000; i++) {
            list1.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Add ArrayList,Time:" + (end-start));


        //System.out.println("Add LinkedList");
        start = System.currentTimeMillis();
        for (int i = 1000; i < sizeArr-1000; i++) {
            list2.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Add LinkedList, Time:" + (end-start));

    }




}
