package de.telran.pro004LambdaTheory;

public class Shablon {
    public static String ref(String s, int i) {
        System.out.println(s);
        System.out.println(i+1);
        return s+i;
    }

    public static void main(String[] args) {
        System.out.println(ref("SSS>", 999));
    }
}
