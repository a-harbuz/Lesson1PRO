package de.telran.pro0015Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        String card = "23423423423432 12/24 234";

        String t1 = "ABC ABSABABABBBCCCABCABCCBAABBCAC";
        String r1 = "ABC"; //что ищим
        Pattern pattern = Pattern.compile(r1);
        Matcher matcher = pattern.matcher(t1);
        System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.group());
        System.out.println(matcher.find());
        System.out.println(matcher.group());
    }
}
