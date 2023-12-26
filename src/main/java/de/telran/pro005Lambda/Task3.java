package de.telran.pro005Lambda;

import java.util.Optional;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(met((num1, num2)-> {
//          Optional<Double> i = num2 == 0 ? Optional.of((double) 0) : Optional.of((double) (num1 / num2));
//          return i;
            if (num2==0) return Optional.empty();
            else return Optional.of((double)num1/num2);
        }, 10,0));

        //передаю в метод met2 ф-ю реализации и ее параметры
        System.out.println(met2((num1, num2)-> num1*num2, 5,10));
        System.out.println(Task3.chekZero(40,2));

        //System.out.println(Task3::chekZero, 5,10));

    } // End main()


    public static Optional<Double> met(SafeDivision safedivision, int num1, int num2) {
        return safedivision.divide(num1, num2);
    }

    public static double met2(Fi2 fi2, int num1, int num2) {
        return fi2.multiply(num1, num2);
    }

    public static String chekZero( int num1, int num2){
        //Уже есть реализация !!! (написанная)
        if (num2==0) return "Zerro";
        else return Integer.toString(num1/num2);
    }

}


//    Создайте функциональный интерфейс SafeDivision с методом divide,
//    который безопасно делит два числа и возвращает Optional<Double>.
//    Реализуйте метод, который делит два числа с использованием SafeDivision,
//    обрабатывая случай деления на ноль.

@FunctionalInterface
interface SafeDivision {
    Optional<Double> divide(int num1, int num2);
    int hashCode();
}

@FunctionalInterface
interface Fi2 {
    double multiply(int num1, int num2);
    int hashCode();
}