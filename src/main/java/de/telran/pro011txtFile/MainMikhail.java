package de.telran.pro011txtFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainMikhail {
    /**
     * Прочитайте файл и посчитайте средний рейтинг всех стримов.
     * Запишите результат в новый файл.
     * <p>
     * 4: [Стрим 4], 4.8
     */

    private void readAndWrite(String readFrom, String writeTo) {
        //ЧТЕНИЕ ПОТОКА СТРОК И ИХ ОБАБОТКА
        try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
             FileWriter writer = new FileWriter(writeTo)) {
            double average =
                    reader.lines()
                            .map(str -> str.split(", ")[1])
                            .mapToDouble(Double::parseDouble)
                            .average()
                            .orElse(0.0);
            writer.write(average + "");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //ЗАПИСТЬ ПОТОКА СТРОК В ФАЙЛ
//        reader.lines()
//                .forEach(x -> {
//                    try {
//                        writer.append(x+'\n');
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                });

    }
}

//ЗАПИСТЬ ПОТОКА СТРОК В ФАЙЛ
//        reader.lines()
//                .forEach(x -> {
//                    try {
//                        writer.append(x+'\n');
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                });
