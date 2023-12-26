package de.telran.pro005Lambda;

import java.util.Arrays;

public class Task9 {
    private static final int[] myarray = {1,2,3,4,-5};
    public static void main(String[] args) {
        int[] result = met(arr -> {
            for (int i = 0; i < arr.length; i++) {
                arr[i]=arr[i]*-1;

            }
            return arr;
            }, myarray);

        System.out.println(Arrays.toString(result));
    }

    public static int[] met(NumberProcessor numberprocessor, int[] arr){
        return numberprocessor.process(arr);
    }
}

//    Создайте функциональный интерфейс NumberProcessor с методом process, который выполняет операцию над массивом чисел.
//        Напишите метод, который принимает массив чисел и NumberProcessor, и возвращает массив после умножения каждого элемента на -1


@FunctionalInterface
interface NumberProcessor{
    int[] process (int[] arr);
}