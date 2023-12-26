package de.telran.pro005Lambda;

public class Main {
    public static void main(String[] args) {

        //met((s) -> s.length(), "ABSDGGFJ");
        met(String::length, "ABSDGGFJ");
    }

    public static void met(StringLength stringlength, String str){
        System.out.println(stringlength.getLength(str));
    }


}

//    Создайте функциональный интерфейс StringLength с методом getLength, который принимает строку
//    и возвращает её длину.
//    Напишите метод, который принимает строку и StringLength интерфейс и выводит длину строки.


@FunctionalInterface
interface StringLength {
    int getLength(String str);
    int hashCode();
}
