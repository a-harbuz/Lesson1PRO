package de.telran.pro011txtFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class Taski {
    public static void main(String[] args) {
        String str="* 4: [Стрим 4], 4.8";
        System.out.println(str.split(", ")[1]);
        System.out.println(str.split(": ")[1].split(", ")[0]);
    }

//* 4: [Стрим 4], 4.8
//    !!!Прочитайте файл и посчитайте средний рейтинг всех стримов. Запишите результат в новый файл.++
private void readAndWrite(String readFrom, String writeTo) {
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
}

//    Отфильтруйте стримы, имеющие рейтинг выше 4.5, и запишите их в новый файл.++
////* 4: [Стрим 4], 4.8
public void streamMoreOne(String readFrom, String writeTo) {
    try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
         FileWriter writer = new FileWriter(writeTo)) {
//                //v1
//                reader.lines()
//                        .filter(s-> {
//                            if (Double.parseDouble(s.split(", ")[1])>4.5) return true;
//                            return false;
//                        })
//                        .forEach(System.out::println);

                //v2
                reader.lines()
                        .map(str -> str.split(", ")[1])
                        .mapToDouble(Double::parseDouble)
                        .filter(d->d>4.5)
                        .forEach(x->{
                            try {
                                writer.append(String.valueOf(x)).append("\n");
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

//* 4: [Стрим 4], 4.8
//Сгруппируйте стримы по названию и запишите количество стримов в каждой группе в новый файл.++
    public void streamsCount(String readFrom, String writeTo) {
        //str.split(": ")[1].split(", ")[0]
        try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
             FileWriter writer = new FileWriter(writeTo)) {
            //Map<String, Long> countByStream = streams.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
            Map<String, Long> countByStream = reader.lines()
                            .map(str -> str.split(": ")[1].split(", ")[0])
                            .collect(Collectors.groupingBy(x->x,
                            Collectors.counting()));

            countByStream.entrySet().stream()
                    .forEach(x-> {
                try {
                    writer.write(x.getKey()+"="+x.getValue()+"\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            //writer.newLine();

            System.out.println(countByStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
//    Отсортируйте стримы по рейтингу от наибольшего к наименьшему и запишите результаты в новый файл.++
    //как взять название, но отсортировать по значению? (сделано!)
    public void sortMaxMin(String readFrom, String writeTo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
             FileWriter writer = new FileWriter(writeTo)) {
                    reader.lines()
//                          .map(str -> str.split(", ")[1])
//                          .sorted(Comparator.reverseOrder())
                            .sorted((o1,o2)-> {
                                String str1=o1.split(", ")[1];
                                String str2=o2.split(", ")[1];
                                return str2.compareTo(str1);
                            })

                            .forEach(str1 -> {
                                try {
                                    writer.write(str1+"\n");
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    Найдите стримы с минимальным рейтингом и выведите их в новый файл.
    public void streamsMinRating(String readFrom, String writeTo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
             FileWriter writer = new FileWriter(writeTo)) {
//            reader.lines()
//              .filter(x->
//                    .map(str -> str.split(", ")[1])
//                    //.mapToDouble(Double::parseDouble)
//                    .sorted(Comparator.reverseOrder())
//                    //.forEach(System.out::println);
//                    .forEach(str1 -> {
//                        try {
//                            writer.write(str1+"\n");
//                        } catch (IOException e) {
//                            throw new RuntimeException(e);
//                        }
//                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    Соберите статистику по рейтингам (минимальный, максимальный, средний) и запишите ее в новый файл.
//    Измените названия всех стримов, добавив к ним префикс "Stream-" и запишите обновленные названия в новый файл.
//    Отфильтруйте стримы с рейтингом ниже 4.7 и преобразуйте их названия, добавив в конец "- Low Rated". Запишите результаты в новый файл.
//    Создайте сводку, включающую идентификатор стрима, название и рейтинг, и запишите ее в новый файл в формате "ID: Название - Рейтинг".
//    Соберите все названия стримов в одну длинную строку, разделяя их запятыми, и запишите эту строку в новый файл.
} //End Class
