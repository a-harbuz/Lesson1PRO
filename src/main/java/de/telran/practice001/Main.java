package de.telran.practice001;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
//    Создайте перечисление (enum) для представления дней недели.
//    Напишите метод, который принимает на вход день недели и
//    возвращает следующий за ним день.


    public static void main(String[] args) {
        int[] arr = {2,7,3,4,8,1,0,6};
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,1,3)));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,1,3)));
        System.out.println(Arrays.toString(Arrays.copyOf(arr,4)));
        Arrays.fill(arr, 7);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,1,3)));

        //System.out.println(DayOfWeek());
        DayOfWeek a = DayOfWeek.MONDAY.getNextDay();

        System.out.println(Enum.class.getSuperclass());

    }


}


//Задача: Размеры одежды
//        Создайте перечисление (enum) для представления размеров одежды (XS, S, M, L, XL).
//        Напишите метод, который принимает на вход размер и возвращает true,
//        если размер существует в перечислении, и false в противном случае.
//        Используйте цикл и метод values() для проверки.

