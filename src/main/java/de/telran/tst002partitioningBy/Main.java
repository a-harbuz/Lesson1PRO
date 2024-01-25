package de.telran.tst002partitioningBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//import static java.util.stream.Collectors.partitioningBy;

public class Main {
    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd","ee");

        // --- partitioningBy
        System.out.println("partitioningBy: ");
        Map<Boolean, List<String>> resultMap1 = givenList.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 2));
        System.out.println(resultMap1);
        //{false=[a, bb, dd, ee], true=[ccc]}

        List<Integer> listInt = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
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



    }
}
