package de.telran.practice006functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//@ Alexander Orlyanskiy
public class Main {
//    2) У нас есть профессия в строительстве - чернорабочий. Он может выполнять любые низкоквалифицированные работы на стройке.
//    На каждый день ему дается список работ, которые он должен выполнить, но не факт что в течении рабочего времени его задание
//    может измениться.
//    Напишите программу рабочего дня профессии, которая позволяет динамический давать ему задание на работу, в любое нужное время.
//    И он их должен выполнять. Применяйте функциональные интерфейсы.
    public static void main(String[] args) {
//        Consumer<String> consumer = (work) -> System.out.println("Иду " + work);
//        consumer.accept("мыть лопату");
//        consumer.accept("копать");
//        consumer.accept("мыть посуду");
//
//        consumer = (work) -> System.out.println("Есть " + work);
//        consumer.accept("борщ");
//        consumer.accept("капусту");
//        consumer.accept("картошку");

        //Consumer<String> consumer = work -> System.out.println("Иду " + work);
        Consumer<String> consumer = System.out::println, work;
        consumer.accept("мыть лопату");
        consumer.accept("копать");
        consumer.accept("мыть посуду");


//        BiConsumer<String, String> biConsumer = (work, wo) -> {
//            if (wo.equals("Кухня")) System.out.println("Готовлю: " + work);
//            if (wo.equals("Стройка")) System.out.println("Иду: " + work);
//            if (wo.equals("Магазин")) System.out.println("Покупаю: " + work);
//        };
//
//
//        biConsumer.accept("Копай", "Стройка");
//        biConsumer.accept("Мой посуду", "Кухня");
//        biConsumer.accept("Сигареты", "Магазин");


    }


}

//@FunctionalInterface
//s