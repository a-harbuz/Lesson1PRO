package de.telran.pro009flatMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abcd", "sadasdas");
        List<String> charOfString = list.stream()
                .flatMap(str->Arrays.stream(str.split("")))
                .toList();

        System.out.println(charOfString);

        List<List<Integer>> listlist = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6),
                Arrays.asList(7,8),
                Arrays.asList(9,11)
        );
        listlist.stream()
                //.flatMap(el->el.stream())
                .flatMap(Collection::stream)
                .filter(el -> el%2==0)
                .forEach(System.out::println);



        List<Integer> listA = Arrays.asList(1,2,3,4,5,6);
        List<Integer> listB = Arrays.asList(6,7,8,9,10,11);

        List<Integer> result = listA.stream()
                .flatMap(elA->
                        listB.stream().map(elB->elB+elA))
                .toList();

//        List<Integer> result1 = listA.stream()
//                .flatMap(elA-> new pro009flatMap.get(elA))
//                .toList();


        List<Integer> listC = Arrays.asList(1,2,3,4,5,6);
        List<Double> listD = Arrays.asList(16.0,17.0,18.0,19.0,110.0,111.0);

        //concat streamA+streamB
        Stream.concat(listC.stream(),listD.stream())
                .forEach(System.out::println);

        //concat = склеивает стримы
    }

    public Stream<Integer> get(Integer el) {
        return null;
    }


}
