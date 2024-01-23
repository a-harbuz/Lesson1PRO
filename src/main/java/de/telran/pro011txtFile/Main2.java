package de.telran.pro011txtFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(
                "C:\\JAVA\\Lesson1PRO\\src\\main\\java\\de\\telran\\proCourseJava.txt"))) {
            //авто-закрытие
            int c;
            //reader.lines().map...


        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
