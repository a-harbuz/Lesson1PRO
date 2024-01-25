package de.telran;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
        Random random = new Random();
        random.ints(10,0,101).forEach(System.out::println);

    }
}

//Либо заходите в Settings -> Appearance&Behavior->System Settings -> Project Opening.
//Тут выбираете значение по умолчанию. Открывать в том же окне или в`
//  v4 2новом окне.

//    Ну и извращения. Почитайте про instanceof pro-java.ru/java-dlya-nachinayushhix/… и в
//    Job.doStuff() будет достаточно 1 аргумента. И вообще так не делается.
//    Делается интерфейс IAnimal (Cat и Dog его имплементируют) и список создаётся именно
//    с этим интерфейсом.
// https://pro-java.ru/java-dlya-nachinayushhix/primenenie-operatora-instanceof-v-java/

//    public void processCollection(Collection<? extends T> c) {
//        // В этом методе вы можете использовать элементы коллекции c,
//        // но только в контексте T или его подтипов.
//        for (T item : c) {
//            // Ваш код обработки элемента
//        }
//    }
//? extends T: Это ограничение сверху (wildcard) и используется для указания,
// что коллекция может содержать объекты типа T или его подтипы.
//Здесь ? представляет неизвестный тип (wildcard), а extends T гарантирует,
// что этот неизвестный тип является подтипом T.
