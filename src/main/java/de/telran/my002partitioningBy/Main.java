package de.telran.my002partitioningBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//import static java.util.stream.Collectors.partitioningBy;

public class Main {
    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd","ee");

        // --- partitioningBy //use predicate
        System.out.println("partitioningBy: ");
        Map<Boolean, List<String>> resultMap1 = givenList.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 2));
        System.out.println(resultMap1);
        //{false=[a, bb, dd, ee], true=[ccc]}

        List<Integer> listInt = Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,11);
        // --- partitioningBy
        System.out.println("partitioningBy: ");
        Map<Boolean, List<Integer>> resultMap2 = listInt.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(resultMap2);

        Map<Boolean, List<Integer>> resultMap3 = listInt.stream()
                .collect(Collectors.partitioningBy(n -> n > 5));
        System.out.println(resultMap3);

        List<Book> booksList = new ArrayList<>();
        booksList.add(new Book("old"));
        booksList.add(new Book("new"));
        booksList.add(new Book("old"));
        booksList.add(new Book("old"));
        booksList.add(new Book("new"));
        Map<Boolean, List<Book>> resultMap4 = booksList.stream()
                .collect(Collectors.partitioningBy(b -> b.getState().equals("old")));
        System.out.println(resultMap4);

        //==========================================================
        System.out.println("RAZNOE...=>>");
        //int c = (int) listInt.stream().count();
        System.out.println(listInt.stream()
                //.anyMatch(x->x==10)
                //.reduce(0,(a,b)->a+b)
                //.reduce(1,(a,b)->a*b)
                //.filter(x->x>=8).toList()

                //.filter(x->x>=8)
                //.collect(Collectors.toSet())
                //.collect(Collectors.toMap(Integer::toString, Collectors.counting()))

                //.collect(Collectors.minBy((a,b)->b-a))
                //.min((a,b)->b-a))
                //.orElse(0)

                .collect(Collectors.averagingInt(Integer::intValue))
                //.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))

        );
        //System.out.println(listInt.get(10).toString());
        //int xx = Integer.valueOf("50");
        int xx = Integer.parseInt("50");
        System.out.println(xx);
    }
}
