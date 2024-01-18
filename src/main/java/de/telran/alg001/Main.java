package de.telran.alg001;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] arr = new int [10];
        // Массив является обьектом ссылочного типа
        // т.е. между методами передаются только ссылки.
        int[] arr = {1, 0, -2, 3, 0, 10, 12, -90};
        //int[] arr1 = arr.clone();

        int[] arr1 = new int[10];
        System.arraycopy(arr, 0, arr1, 0, arr.length);

        System.out.println(Arrays.toString(arr));
        checkArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("  ");
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] checkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i]+1;
        }
        return arr;
    }

}
