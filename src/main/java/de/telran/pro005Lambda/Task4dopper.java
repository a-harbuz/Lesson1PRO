package de.telran.pro005Lambda;

public class Task4dopper {
    public static void main(String[] args) {
//        String a = met(new UpperCaseConverter(){
//            @Override
//            public String convert(String s){
//                s.toUpperCase();
//                return s;
//            }
//        }, "asdfgh");


        String a = met(x -> x.toUpperCase(), "asdfgh");
        System.out.println(a);
        // ASDFG
        System.out.println(met(String::toUpperCase, "asdfg"));
        // a s d f g
        System.out.println(met(Dopper::convert, "asdfg"));

    }


    public static String met(UpperCaseConverter uppercaseconverter, String str) {
        return uppercaseconverter.convert(str);
    }
}

//    Создайте функциональный интерфейс UpperCaseConverter с методом convert, который преобразует строку в верхний регистр.
//        Напишите метод, который принимает строку и UpperCaseConverter интерфейс, и преобразует её в верхний регистр.

@FunctionalInterface
interface UpperCaseConverter {
    String convert(String str);
    int hashCode();
}