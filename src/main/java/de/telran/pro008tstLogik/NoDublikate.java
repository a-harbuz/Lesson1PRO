package de.telran.pro008tstLogik;

import java.util.ArrayList;
import java.util.List;

public class NoDublikate {
//    public static List<int[][]> attack() {
//
//    }
    public static List<Integer> noDublicate(List<Integer> list){
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = (i+1); j < list.size(); j++) {
                if (list.get(i)==list.get(j)){
                    list.remove(j);
                    j--;
                    System.out.println(list);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); //124152
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(2);
        System.out.println(noDublicate(list)); //1,2,4,5
    }

}

