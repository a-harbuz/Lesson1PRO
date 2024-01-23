package de.telran.pro011txtFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Taski {
    public static void main(String[] args) {
        String str="* 4: [Стрим 4], 4.8";
    }
//* 4: [Стрим 4], 4.8
//    !!!Прочитайте файл и посчитайте средний рейтинг всех стримов. Запишите результат в новый файл.
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

//    Отфильтруйте стримы, имеющие рейтинг выше 4.5, и запишите их в новый файл.
////* 4: [Стрим 4], 4.8
public void streamMoreOne(String readFrom, String writeTo) {
    try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
         FileWriter writer = new FileWriter(writeTo)) {
         List<String> filt =
                reader.lines()
                        .toList();
////                        .filter(l -> {
////                                    reader.lines()
////                                    .map(str -> str.split(", ")[1])
////                                    .mapToDouble(Double::parseDouble)
////                                            .filter(x-> x>4.5)
////                                            .forEach(x->{});
////                        })
//                        .toArray();
////                .filter(team -> team.getParticipantList().stream()
////                .anyMatch(participant -> (participant.getAge() >= a) && (participant.getAge() <= b)
////                ))
//        //writer.write(filter + "");
//        //stream.collect(Collectors.joining(System.lineSeparator()))
//        //writer.write(Arrays.stream(filt).toString());
        //writer.write(String.valueOf(filt));
        writer.write(filt.toString()+"\n");

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

//* 4: [Стрим 4], 4.8
//Сгруппируйте стримы по названию и запишите количество стримов в каждой группе в новый файл.
    public void streamsCount(String readFrom, String writeTo) {
//        try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
//             FileWriter writer = new FileWriter(writeTo)) {
//            //Map<String, Long> countByStream = streams.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//            Map<String, Double> countByStream = reader.lines()
//                    .map(str -> str.split("\n")[str - 1])
//                    .collect(Collectors.groupingBy(
//                            s -> s.split(":")[1].trim(),  // Группировка по названию стрима
//                            Collectors.counting()          // Подсчет количества стримов в каждой группе
//                    ));
//
//            double average =
//                    reader.lines()
//                            .map(str -> str.split(", ")[1])
//                            .mapToDouble(Double::parseDouble)
//                            .average()
//                            .orElse(0.0);
//            writer.write(average + "");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
//    Отсортируйте стримы по рейтингу от наибольшего к наименьшему и запишите результаты в новый файл.
void sortMaxMin(String readFrom, String writeTo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(readFrom));
             FileWriter writer = new FileWriter(writeTo)) {
//            double average =
//                    reader.lines()
//                            .map(str -> str.split(", ")[1])
//                            .mapToDouble(Double::parseDouble)
//                            .sorted((el1,el2) ->Comparator.comparing(el1-el2))
//                            .orElse(0.0);
//            writer.write(average + "");

            reader.lines()
                    .forEach(x -> {
                        try {
                            writer.append(x+'\n');
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    Найдите стримы с минимальным рейтингом и выведите их в новый файл.
//    Соберите статистику по рейтингам (минимальный, максимальный, средний) и запишите ее в новый файл.
//    Измените названия всех стримов, добавив к ним префикс "Stream-" и запишите обновленные названия в новый файл.
//    Отфильтруйте стримы с рейтингом ниже 4.7 и преобразуйте их названия, добавив в конец "- Low Rated". Запишите результаты в новый файл.
//    Создайте сводку, включающую идентификатор стрима, название и рейтинг, и запишите ее в новый файл в формате "ID: Название - Рейтинг".
//    Соберите все названия стримов в одну длинную строку, разделяя их запятыми, и запишите эту строку в новый файл.
} //End Class
