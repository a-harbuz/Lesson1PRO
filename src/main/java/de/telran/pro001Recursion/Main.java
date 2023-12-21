package de.telran.pro001Recursion;

public class Main {
    public static void main(String[] args) {
        int size = 11;
        recHelper(5);

    }

    public static void recHelper(int index) {
        for (int i = 0; i < index; i++) {

            System.out.println(i);
            recHelper(i + 1);

            System.out.println("Конец одной итерации!");
        }
    }

}
