package de.telran.pro005Lambda;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int pos = 3;
        int newarr[] = met((x)->{
            for (int j = 0; j < pos; j++) {
                int last = x[x.length-1];
                for (int i = x.length-2; i >= 0 ; i--) {
                    x[i+1]=x[i];
                }
                x[0]=last;
            }
            return x;
                }, arr);

        System.out.println(Arrays.toString(newarr));
    }

    public static int[] met(ArrayRotator arrayrotator, int[] arr){
        return arrayrotator.rotate(arr);
    }

}

//
//    Создайте функциональный интерфейс ArrayRotator с методом rotate, который выполняет циклический сдвиг элементов массива.
//    Напишите метод, который принимает массив и ArrayRotator и шаг сдвига, и выполняет сдвиг массива на заданную позицию влево.

@FunctionalInterface
interface ArrayRotator{
    int[] rotate (int[] arr);
}