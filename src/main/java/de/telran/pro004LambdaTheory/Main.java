package de.telran.pro004LambdaTheory;

import java.util.Comparator;
//import pro001ListCompare;

public class Main {
    public static void main(String[] args) {
//        met(new Inter() {
//                //реализация метода
//                @Override
//                public void get() {
//                    System.out.println("123");
//                }
//            }
//        );

        //met(() -> System.out.println("123")); //без входным аргументов
        met((ap) -> System.out.println(ap), "123"); //с одним входным аргументом

        //======================================================================
        //met1((str,num)-> str+num, "JJJJ", 888);
        System.out.println(met1((str,num)-> str+num, "JJJJ ", 888));

        //======================================================================

        // Если метод реализации(функция обработки) уже где-то был написан заранее
        //System.out.println(met1((str,num)-> Shablon.ref(str,num), "JJJJ ", 999));
        System.out.println(met1(Shablon::ref, "(i+1)=>", 10));



    } //End Main ========================================================================


    public static void met(Inter inter, String s){
        // Реализация , параметры
        System.out.println("1");
        inter.get(s);
    }

    public static String met1(Inter1 inter, String s, int num){
        // Реализация , параметры
        //System.out.println("1");
        return inter.get1(s, num);
    }


}



@FunctionalInterface
interface Inter {
    void get(String str); //signatura
    int hashCode();
}


@FunctionalInterface
interface Inter1 {
    String get1(String str, int num); //signatura
    int hashCode();
}


//    // * 16. Вывести книги сортированные по году издания в каждой библиотеке
//    public static void printBooksSortedByIssueYear(Library[] libraries) {
//        int countLibrary = 1;
//        for (Library library : libraries) { // перебираем библиотеки
//            // Сортируем массив книг ==>> Arrays.sort(массив, компаратор)
//            Arrays.sort(library.getBooks(), Comparator.comparing(Book::getYear));
//
//            //выводм массив книг
//            System.out.println("Library № " + countLibrary + " " + Arrays.toString(library.getBooks()));
//            countLibrary += 1;
//        }
//    }