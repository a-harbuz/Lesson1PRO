package de.telran.pro005Lambda;

public class Task2 {
    public static void main(String[] args) {
        //math((a,b)-> a+b, 10,12);
        //math((a,b)-> Integer.sum(a,b), 10,12);
        math(Integer::sum, 10,12);


        math((a,b)-> a-b, 10,12);
        math((a,b)-> a*b, 10,12);
        math((a,b)-> a/b, 20,10);

        math(Math::addExact, 10,12); // summ
        math(Math::max, 10,12); //
    }

    public static void math(NumberOperation numberoperation, int num1, int num2){
        System.out.println(numberoperation.operate(num1,num2));
    }

}

//    Создайте функциональный интерфейс NumberOperation с методом operate,
//    который принимает два целых числа и возвращает целое число.
//        Напишите методы для выполнения базовых арифметических операций
//        (сложение, вычитание, умножение, деление) с использованием этого интерфейса.

@FunctionalInterface
interface NumberOperation {
    int operate(int num1, int num2);
    int hashCode();
}