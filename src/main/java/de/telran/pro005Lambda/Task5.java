package de.telran.pro005Lambda;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
//    Создайте функциональный интерфейс Logger с методом log, который принимает строку и выводит её в консоль.
//    Напишите метод, который использует Logger для логирования различных сообщений.
    private static final ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        logger((s) -> System.out.println(s), list, "dran");
        logger((s) -> System.out.println(s), list, "apfel");
        logger((s) -> System.out.println(s), list, "orang");
        logger((s) -> System.out.println(s.length()), list, "berry");
    }

    public static void logger(Logger logger, ArrayList list, String str) {
        list.add(str);
        System.out.println(list);
        logger.log(str);
    }
}

@FunctionalInterface
interface Logger {
    void log(String str);
}

