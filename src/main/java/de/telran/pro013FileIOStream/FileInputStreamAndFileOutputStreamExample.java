package de.telran.pro013FileIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamAndFileOutputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream reader = new FileInputStream("javaSource.png");
             FileOutputStream writer = new FileOutputStream("javaCopy1.png")) {
            int sy;

            while ((sy = reader.read()) != -1) {
                writer.write(sy);
            }

            System.out.println("***DONE!***");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
