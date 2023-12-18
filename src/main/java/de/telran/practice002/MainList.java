package de.telran.practice002;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int capacity = 10_000_000;
    public static Random random = new Random();
    private static List<Integer> list = new LinkedList<>();
    //private static List<Integer> list = new ArrayList<>(capacity);
    public static void main(String[] args) {
        //List<Integer> list = List.of(1,12,13);

        //list.remove(1); //ImmutableCollections
        //list.set(1,11); //ImmutableCollections

        //List<Integer> list = new ArrayList<>(capacity);

        for (int i = 0; i < capacity; i++) {
            list.add(random.nextInt(500));

//            for (int j = 0; j < 1; j++) {
//                //list.add(1, random.nextInt(500));
//                list.add(1, 500);
//
//            }

        }

        for (int i = 0; i < capacity; i++) {
            list.add(1, 500);
        }

    }
}
