package de.telran.pro011txtFile;

public class TaskiRun {
    public static void main(String[] args) {
        String path = "C:\\JAVA\\Lesson1PRO\\src\\main\\java\\de\\telran\\pro011txtFile\\";
        Taski taski = new Taski();

        //taski.streamMoreOne(path+"f.txt", path+"w.txt");
        //taski.streamsCount(path+"f.txt", path+"w.txt");
        taski.sortMaxMin(path+"f.txt", path+"w.txt");
    }
}
