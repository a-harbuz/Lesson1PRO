package de.telran.pro006Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 11);
        Set<Integer> set1 = new HashSet<>();
        /**
         * сумма всех четных, неповторяющихся элементов больше 5
         */
//        for (int i = 0; i < list1.size(); i++) {
//            set1.add(list1.get(i));
//        }
//
//        int sum=0;
//        for (Integer s:set1){
//            if (s%2==0 && s>5) {
//                sum+=s;
//            }
//        }
//        System.out.println(sum);
        int s = list1.stream()
                .distinct()
                .filter(el -> (el%2==0 && el>5))
                //.reduce((acc,com) -> acc+com)
                .reduce(Integer::sum)
                .get();

        System.out.println(s);

    }



}
