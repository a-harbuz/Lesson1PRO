package de.telran.pro012SerializeObject;

import java.io.*;
import java.io.FileOutputStream;

public class FileWRexample {
    public static void main(String[] args) {
        String readFrom ="";
        String writeTo ="";
//        try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
//             FileWriter writer = new FileWriter(writeTo)) {
//        // only поток Char
//
//        }


//        try (FileInputStream reader = new FileInputStream(new FileReader(readFrom));
//             FileOutputStream writer = new FileOutputStream(writeTo)) {
//        // поток байтов
//
//        }

        Template template = new Template();
        System.out.println("P1:"+template.getParam1());
        System.out.println("P2:"+template.getParam2());
        System.out.println("P3:"+template.getParam3());
        /// сериализация обьекта (сохранение поля,методы)
        // состояния - поля, методы.

        String fileObj ="objTempl.ser"; //Path
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream(fileObj)
            );
            objectOutputStream.writeObject(template);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Обьект template должен записаться в файл
        //нужно  научить его это делать
    }
}


//поток байтов или поток Char