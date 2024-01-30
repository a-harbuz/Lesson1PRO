package de.telran.pro004LambdaTheory;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,36,15,12,18,14);
        //Найти все четные уникальные и суммировать

//        for (int i = 0; i < ; i++) {
//            if ()
//        }

        int a = list.stream()
                    .distinct() //удаляет повторяющиеся
                    .filter(el -> el % 2 == 0) //взяли только чеtные
                    .reduce(Integer::sum)
                    .get();

    }

}
