package de.telran.pro014FilePathExample;

import java.io.*;
import java.util.Arrays;

public class MyExample {
    public static void main(String[] args) throws IOException {
        //createFile();
        copyFileUsingFileStreams();
        copyFileUsingPath();
        copyFileUsingRandomAccessFile();
    }

    // Задание 1: Работа с классом File
    public static void createFile() {
        File file = new File("example.txt");
        try {
            boolean created = file.createNewFile();
            if(created) {
                System.out.println("File name: " + file.getName());
                System.out.println("File was created: " + file.getAbsolutePath());
                System.out.println("File size: " + file.length());
                System.out.println("Is directory: -> " + file.isDirectory());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    /**
     * Написать метод, который создает файл с именем
     * "example.txt" в текущей директории, затем считывает
     * этот файл с использованием FileInputStream и записывает
     * его содержимое в новый файл "copy_example.txt" с использованием FileOutputStream.
     */
    public static void copyFileUsingFileStreams() throws IOException {
        File file = new File("example.txt");
        FileWriter fileWriter = new FileWriter("example.txt");
        fileWriter.write("File name: " + file.getName()+"\n");
        fileWriter.write("File was created: " + file.getAbsolutePath()+"\n");
        fileWriter.write("File size: " + file.length()+"\n");
        fileWriter.flush();

        if (file.exists()) {
            try (FileInputStream inputStream = new FileInputStream("example.txt");
                 FileOutputStream outputStream = new FileOutputStream("copy_example.txt")) {
                //outputStream.write(inputStream.read());
//                for (int i = 0; i < file.length(); i++) {
//                    try{
//                        outputStream.write(inputStream.read());
//                    } catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                }
                int b;
                while ((b=inputStream.read())!=-1){
                    outputStream.write(b);
                }

            }
        }
    }

    // Задание 2: Работа с классом Path

    /**
     * Написать метод, который использует Path и Files
     * для копирования файла "example.txt" в новый файл "copy_example_path.txt".
     * Проверить, существует ли файл "example.txt" перед копированием.
     */
    public static void copyFileUsingPath() throws IOException {

    }

    // Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "example.txt"
     * с использованием RandomAccessFile, читает первые 20 байт и записывает
     * их в новый файл "random_access_copy.txt".
     */
    public static void copyFileUsingRandomAccessFile() throws IOException {
        try (RandomAccessFile file1 = new RandomAccessFile("example.txt", "r");
             RandomAccessFile file2 = new RandomAccessFile("random_access_copy.txt", "rw")){
            for (int i = 0; i < 20; i++) {
                file2.write(file1.read());

            }
        }
    }
    //===============================================================================================================
    // Усложненное Задание 1: Работа с классом File

    /**
     * Написать метод, который читает файл "example.txt",
     * подсчитывает количество слов в файле и записывает это количество
     * в новый файл "word_count.txt". Использовать BufferedReader и BufferedWriter
     * для эффективной работы с текстом.
     */
    public static void countWordsInFile() throws IOException { //++
        File file = new File("example.txt");
        try (BufferedReader file1 = new BufferedReader(new FileReader("example.txt"));
             BufferedWriter file2 = new BufferedWriter(new FileWriter("word_count.txt"))) {
            String b;
            int count=0;
            while ((b=file1.readLine())!=null) {
                //System.out.println(Arrays.stream(b.split(" ")).count());
                count+= (int) Arrays.stream(b.split(" ")).count();
            }
            System.out.println(count);
            file2.write(Integer.toString(count));
        }
    }

    // Усложненное Задание 2: Работа с классом Path

    /**
     * Написать метод, который ищет все файлы с расширением ".txt" (.mp3, .pdf)
     * в текущей директории и её поддиректориях. Результаты поиска
     * (пути к файлам) записать в файл "found_files.txt".
     */
    public static void findTxtFilesInDirectory() throws IOException {
        File file = new File("example.txt");
        //.fileWalkTree
    }

    // Усложненное Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "example.txt"
     * с использованием RandomAccessFile, переходит к последнему абзацу
     * в файле и копирует его содержимое в новый файл "last_paragraph.txt".
     */
    public static void copyLastParagraphUsingRandomAccess() throws IOException {

    }
    //===============================================================================================================

}
