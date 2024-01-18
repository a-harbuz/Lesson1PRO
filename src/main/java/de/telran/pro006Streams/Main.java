package de.telran.pro006Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

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

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
                .filter(x -> x < 90)
                .map(x -> x + 10)
                .limit(3)
                .forEach(System.out::println);

        Map<String, Double> sourceMap = new HashMap<>();
        sourceMap.put("One", 2.0);
        sourceMap.put("Two", 3.0);
        sourceMap.put("Three", 1.0);
        sourceMap.put("Four", 4.0);
        System.out.println(sourceMap);

    }



}
