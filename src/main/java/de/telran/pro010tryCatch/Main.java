package de.telran.pro010tryCatch;

public class Main {
    public static void main(String[] args) {
        //Thread.sleep(1500);
        int x=10;
        int y=0;
        try {
            System.out.println(x/y);
        } catch (Exception e){ //ловим, какое именно исключение
            System.out.println("Исключение....");
            //throw new RuntimeException(e);
            throw new RuntimeException("Деление на НОЛЬ!"); // останавливает работу прогр.
            //вываливает ошибку
        }
        System.out.println("Идём Далее....");


    }



}


