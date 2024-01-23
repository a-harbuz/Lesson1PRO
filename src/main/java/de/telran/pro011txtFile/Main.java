package de.telran.pro011txtFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    //File txt Read and Write
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

//        try {
//            FileReader reader = new FileReader("prog.txt")
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException();
//        } finally {

        try (FileReader reader = new FileReader("C:\\JAVA\\Lesson1PRO\\src\\main\\java\\de\\telran\\proCourseJava.txt")) {
          //авто-закрытие
            int c;
            while ((c = reader.read())!=-1) {
                //читает один char
                //-1 если файл закончился
                System.out.println((char) c);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ///
//        String text = "Olga -> A Flushable...";
//        System.out.println();
//        try (FileWriter writer = new FileWriter("123456.txt") {
//            //авто-закрытие, авто создание файла, если его нет
//            String s;
//
//
//            System.out.println();
//            System.out.println("DONE write!");
//
//
//        } catch (Exception e) {
//
//        }





    }
} // End Class
