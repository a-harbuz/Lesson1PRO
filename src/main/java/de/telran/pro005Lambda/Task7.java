package de.telran.pro005Lambda;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int num = met(str -> {
            String[] wordArray = str.split(" ");
            //System.out.println(Arrays.toString(wordArray));
            int count = 0;
            for (int i = 0; i < wordArray.length; i++) {
                String word = wordArray[i];
                int gleich=0;
                for (int j = i; j < wordArray.length; j++) {
                    if (j!=i) {
                        if (word.equals(wordArray[j])) gleich=1;
                    }
                }
                if (gleich==0) count++;
            }
            return count;

        }, "Text hier Text not or not to Text be !!!"); //1 2 3 4 5 6 7

        System.out.println(num);
    }

    public static int met(TextAnalyzer textanalyzer, String str){
        return textanalyzer.analyze(str);

    }

}

//    Создайте функциональный интерфейс TextAnalyzer с методом analyze, который принимает текст и анализирует его,
//    возвращая результат анализа.
//    Напишите метод, который принимает строку и TextAnalyzer, и подсчитывает количество уникальных слов в тексте.

@FunctionalInterface
interface TextAnalyzer{
    public int analyze(String str);
}