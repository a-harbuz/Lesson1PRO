package de.telran.pro0015Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String str = "ewfwef wefwefwef
//                wefwqefwqef wfwefwef
//                        ewfewqwefwef wefwefwe
//                                wfwefwef";

        String t1 = "ABC ABSABABABBBCCCABCABCCBAABBCAC";
        String r1 = "ABC"; //что ищим
        Pattern pattern = Pattern.compile(r1);
        Matcher matcher = pattern.matcher(t1);

        while (matcher.find()) {
            //System.out.println(matcher.start()+":"+ matcher.end());
            System.out.println(matcher.group());
        }
    }
}
