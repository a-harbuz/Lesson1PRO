package de.telran.practice007StreamOleksandr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        String result = list.stream()
                .collect(Collectors.joining("- "));

        System.out.println(result);

//        list1 = list.stream()
//                        .map(x->x+x)
//                        .get();
        System.out.println(list);

        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd", "cee");
//        System.out.println(givenList.stream()
//                .collect(Collectors.partitioningBy(s->s.length()>2)));
//                //только true/false  - т.е. соответствует условию или нет
        System.out.println("partitioningBy:");
        Map<Boolean,List<String>> resultMap1 = givenList.stream()
                .collect(Collectors.partitioningBy(s->s.length()>2));
        System.out.println(resultMap1);

        System.out.println("groupingBy:");
        Map<Boolean,List<String>> resultMap2 = givenList.stream()
                .collect(Collectors.groupingBy(s->s.length()>2));
        System.out.println(resultMap2);

        System.out.println("groupingBy v3:");
        Map<Integer, List<String>> resultMap3 = givenList.stream()
                .collect(Collectors.groupingBy(s->s.length()));
        System.out.println(resultMap3);

        System.out.println("groupingBy v3:");
        Map<Boolean, List<String>> resultMap4 = givenList.stream()
                .collect(Collectors.groupingBy(s-> s.startsWith("c")));
        System.out.println(resultMap4);

        List<String> typesOfSchools = Arrays.asList("Primary", "Secondary", "High", "Primary", "High", "Secondary");
        Map<String, List<String>> groupedByScool = typesOfSchools.stream()
                .collect(Collectors.groupingBy(s -> s));
        System.out.println(groupedByScool);


    }

}
