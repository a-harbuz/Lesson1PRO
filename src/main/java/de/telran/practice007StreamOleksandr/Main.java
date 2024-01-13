package de.telran.practice007StreamOleksandr;

import java.util.ArrayList;
import java.util.List;
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
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

}
