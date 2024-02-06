package de.telran.pro0015Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    private static boolean isIpCorrect(String ip) {
        //String ipReg = "[^255.]";
        String ipReg = "0+";
        //String ipReg = "((25[0-5]|2[0-4]\\\\d | [01]?\\\\d?\\\\d)(\\\\.)){3}";
        Pattern pattern = Pattern.compile(ipReg);
        Matcher matcher = pattern.matcher(ip);
        System.out.println(matcher.find());
        return false;
        //return matcher.find();
    }

    public static void main(String[] args) {
        String ip1 = "255.255.255.0";
        String ip2 = "200.5.25.111";
        //System.out.println(isIpCorrect(ip1));
        //System.out.println(isIpCorrect(ip2));
        isIpCorrect(ip1);
        isIpCorrect(ip2);
    }
}
