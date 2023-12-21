package de.telran.practice005iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        removElements(list);
        System.out.println(list);

        removElementsList(list);
        System.out.println(list);

        removElementsRightToLeft(list);
        System.out.println(list);
    }

    public static void removElements(List<Integer> list){
        //Удалить все чётные с пом.итератора
        Iterator<Integer> iterator = list.iterator();
            while(iterator.hasNext()) {
                int temp = iterator.next();
                //System.out.println(temp);
                if (temp % 2 == 0) {
                    iterator.remove();
                }
            };
    }

    public static void removElementsList(List<Integer> list){
        //Удалить все чётные с пом.итератора
        for (Integer temp: list) {
            if (temp % 2 == 0) {
                list.remove(temp);
            }

        }
    }


    public static void removElementsRightToLeft(List<Integer> list){
        //Удалить все чётные с пом.итератора
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()) {
            int temp = iterator.previous();
            System.out.println(temp);
            //if (temp % 2 == 0) {
            //    iterator.remove();
            //}
        };
    }

}
