package de.telran.practice007Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {

    }

    public List<String> filterByLength(List<String> input, int length){
//        for (int i = 0; i < input.size(); i++) {
//            if (input.get(i).length() == length){
//                list1.add = input.get(i)
//            }
//        }
//        return list1;
        return input.stream()
                .filter(s ->s.length() == length)
                .toList();
    }

    public List<String> toUpperCase(List<String> input){
        return input.stream()
                .peek(s ->s.toUpperCase())
                .toList();

    }

    public Optional<String> findFirstStartingWith(List<String> input, char letter){
        //Поиск первой строки, начинающейся на заданную букву.
        return input.stream()
                .filter(s ->s.charAt(0) == letter)
                .findFirst();
    }

    //Соединение строк через запятую.
    public String joinByComma(List<String> input){
        String s = "";
        //return input.stream()
                //.peek()
        return "";
    }


}
