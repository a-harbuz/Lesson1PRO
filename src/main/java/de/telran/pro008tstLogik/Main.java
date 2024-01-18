package de.telran.pro008tstLogik;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //RURLL
        //System.out.println(weg("RURLL"));
        System.out.println(weg("LLLLDDDD"));

        int[] arr = {1,9,3,4,5,6,7,8,2};
        Arrays.sort(arr); //СОРТИРОВКА
        System.out.println(Arrays.toString(arr));

        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        list.add("four");
        System.out.println(list); // => [one, two, three]

        list = List.of("1", "2", "3"); // неизменяемый лист
        //list.add("4");
        System.out.println(list); // => [1, 2, 3]

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,9,3,4,5,6,7,8,2));
        Collections.sort(list1);
        System.out.println(list1);

    }


    public static boolean weg(String str) {
//        int l=0;
//        int r=0;
//        int u=0;
//        int d=0;
//        str = str.toLowerCase();
//        for (int i = 0; i < str.length(); i++) {
//            switch (str.charAt(i)) {
//                case 'l' -> l++;
//                case 'r' -> r++;
//                case 'u' -> u++;
//                case 'd' -> d++;
//            }
//        }
//        return (r==l && u==d);

        int x=0;
        int y=0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'l' -> x--;
                case 'r' -> x++;
                case 'u' -> y++;
                case 'd' -> y--;
            }
        }
        return (x==0 && y==0);
    }
}

