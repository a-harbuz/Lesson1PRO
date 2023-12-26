package de.telran.pro005Lambda;

public class Dopper {
    public static String convert(String str){
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            newstr = newstr + str.charAt(i)+" ";

        }
        return newstr;
    }
}
