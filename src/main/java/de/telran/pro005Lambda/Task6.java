package de.telran.pro005Lambda;

import java.util.Arrays;

public class Task6 {


    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,12,14};
//        int[] arr2 = met(new ArrayTransformer() {
//            @Override
//            public int[] transform(int[] arr){
//                for (int i = 0; i < arr.length; i++) {
//                    arr[i] = arr[i]*arr[i];
//                }
//                return arr;
//            }
//        }, arr);
//        System.out.println(Arrays.toString(arr2));

//        int[] arr2 = met((x)->{
//            for (int i = 0; i < x.length; i++) {
//                x[i] = x[i]*x[i];
//            }
//            return x;
//        }, arr);

        System.out.println(Arrays.toString(
                met((x) -> {
                for (int i = 0; i < x.length; i++) {
                    x[i] = x[i]*x[i];
                }
                return x;
                }, arr)));

        //var2.
        System.out.println(Arrays.toString(metB(arr)));
    }



    public static int[] met(ArrayTransformer arraytransformer, int[] arr){
        return arraytransformer.transform(arr);
    }

    public static int[] metB(int[] arr){
        ArrayTransformer arraytransformer = new ArrayTransformer() {
            @Override
            public int[] transform(int[] x) {
                for (int i = 0; i < x.length; i++) {
                    x[i] = x[i]*x[i];
                }
                return x;
            }
        };
        return arraytransformer.transform(arr);
    }

}

//    Создайте функциональный интерфейс ArrayTransformer с методом transform, который принимает массив
//        целых чисел и выполняет операцию возведения каждого элемента в квадрат.
//        Напишите метод, который принимает массив и ArrayTransformer, и изменяет массив, возведя каждый его элемент в квадрат.

@FunctionalInterface
interface ArrayTransformer {
    int[] transform(int[] arr);
}