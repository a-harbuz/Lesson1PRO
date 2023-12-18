package de.telran.practice003;

import java.util.*;

public class Main {
    public static final List<String> listStr = new ArrayList<>(20);
    public static void main(String[] args) {
        //Collections.fill(listStr, "SSS");
        //getOneElement(listStr);

        List<Character> listChar = new ArrayList<>();
        listChar.add('M');
        listChar.add('K');
        listChar.add('x');
        listChar.add('p');
        //getColGlasn(listChar);
        System.out.println(changeElements(listChar));

//        List<String> list1 = new ArrayList<>();
//        list1.add("one");
//        list1.add("two");
//        list1.add("three");
//        list1.add("for");
//        list1.add("six");
//        list1.add("six");
//        list1.add("two");
//        getListUniqString(list1);



    }

//==========================================================================
    public static void getOneElement (List<String> list) {
        //#1
        System.out.println(list.size());
        for (String s: list) {
            System.out.println(s);
        }
    }
    public static void getQuadrateElement (List<Integer> list) {
        //#2
        for (Integer s: list) {
            System.out.println(s*s);
        }
    }
    public static void getAsciiElement (List<Character> list) {
        //#3
        for (Character s: list) {
            System.out.println((int)s);
        }
    }
    public static void getFirstElementOfArray (List<String[]> list) {
        //4
        for (String[] s: list) {
            System.out.println(s[0]);
        }
    }
    public static void getAllElementInList (List<List<String>> list) {
        //5
        for (List<String> s: list) {
            for (String ss:s) {
                System.out.println(ss);
            }
        }
    }
    public static void getAllElementChet (List<Integer> list) {
        //6 - chet
        for (int s: list) {
            if (s%2 ==0){
                System.out.println(s);
            }
        }
    }
    public static void getWordFirstLetter (List<String> list) {
        //7
        for (String s: list) {
            if (s.startsWith("A")){
                System.out.println(s);
            }
        }
    }
    public static void getColGlasn (List<Character> list) {
        //8
        int i = 0;
        for (Character s : list) {
            //s.toString().toUpperCase
            switch (s) {
                case 'A', 'E', 'O', 'I','Y','U':
                    i++;
                    break;
                case 'a', 'e', 'o', 'i','y','u':
                    i++;
                    break;
            };
        }
        System.out.println(i);
    }

    public static void getLengSubarray (List<String[]> list) {
        //8 Перебор List<String[]>, вывод длины каждого подмассива.
        for (String[] s: list) {
            System.out.println(s.length);
        }
    }
    public static void getLeng1Subarray (List<List<Integer>> list) {
        //Перебор List<List<Integer>>, подсчет суммы всех чисел.
        int i=0;
        for (List<Integer> s: list) {
            for (int elem: s) {
                i+=elem;
            }
        }
        System.out.println(i);
    }
    public static void getListElemMore10 (List<List<Integer>> list) {
        //Перебор List<List<Integer>> и вывод только тех списков, сумма элементов которых больше 10.
        int i=0;
        for (List<Integer> s: list) {
            for (int elem: s) {
                i+=elem;
            }
            if (i>10) System.out.println(s);
        }
    }
    public static void getWordLongX (List<String> list) {
        int x=10; //длинна слова
        int i=0; //кол.таких слов
        //Перебор List<String> и подсчет количества слов определенной длины.
        for (String s: list) {
            if (s.length()==x) i++;
        }
        System.out.println(i);
    }
    public static void getMaxElem (List<Integer[]> list) {
        //Перебор List<Integer[]> и нахождение максимального элемента в каждом массиве.
        for (Integer[] s: list) {
            int i = Integer.MIN_VALUE;
            for (int elem: s) {
                if (elem>i) i=elem;
            }
            System.out.println(i);
        }
    }
    public static void getStringOutList (List<List<String>> list) {
        //Перебор List<List<String>>, вывод всех комбинаций строк из разных вложенных списков. ??????????
        for (List<String> s: list) {
            for (String elem: s) {
                System.out.println(s+elem);
            }
        }
    }

    public static void getPairNum (List<Integer> list) {
        //Перебор List<Integer> и нахождение всех пар чисел, сумма которых равна 10.
        for (int s: list) {
            for (int k: list) {
                if ((k+s)==10){
                    System.out.println(s + " + " + k + " = " +(k+s));
                }
            }
        }
    }
    public static void getListUniqString (List<String> list) {
        //Перебор List<String> и создание нового списка, содержащего только уникальные элементы.
        List<String> tmpList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean uniq = true;

            for (int j = 0; j < list.size(); j++) {
                if (i!=j){
                    if (list.get(j).equals(list.get(i))){
                        uniq = false;
                        break;
                    }
                }
            }

            //Элемент уникальный
            if (uniq) tmpList.add(list.get(i));
        }
        System.out.println(tmpList);
    }
    //Перебор List<Character> и перестановка элементов в обратном порядке.
    public static List<Character> changeElements (List<Character> list) {
        List<Character> newlist = new ArrayList<>(list.size());
        for (int i = list.size()-1; i >=0; i--) {
            newlist.add(list.get(i));
        }
        return newlist;
    }

    //Перебор List<List<Integer>> и вывод тех вложенных списков, которые содержат повторяющиеся элементы.
    public static void repeatElementsList (List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean repeatElem = false;

            List<Integer> listInt = list.get(i);
            //поиск повторяющихся эл-тов
            for (int j = 0; j < listInt.size(); j++) {

                for (int k = 0; k < list.size(); k++) {
                    if (j!=k){
                        if (list.get(k).equals(list.get(j))){
                            repeatElem = true;
                            break;
                        }
                    }
                }

            }
            if (repeatElem) System.out.println(listInt);
        }
    }

    //Перебор List<Integer> и нахождение всех подмножеств этого списка.


    //Перебор List<String> и создание всех возможных комбинаций строк без повторений.
    public static List<String> noRepeatStr (List<String> list) {
        List<String> tmpList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i!=j){
                    tmpList.add(list.get(i)+ " " +list.get(j));

                }
            }

        }
        return tmpList;
    }

    //Перебор List<List<Integer>> и нахождение списка с максимальной суммой элементов.
    public static List<Integer> maxSumElementsList (List<List<Integer>> list) {
        List<Integer> tmpListInt = new ArrayList<>();
        int sumPrevList =Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            List<Integer> listInt = list.get(i);
            int sum =0;
            //вычисление суммы эл-тов
            for (int j = 0; j < listInt.size(); j++) {
                sum+=listInt.get(j);
            }
            if (sum>sumPrevList){
                sum=sumPrevList;
                tmpListInt = listInt;
            }
        }
        return tmpListInt;
    }

    //Перебор List<Character> и построение всех возможных строк из данных символов.



} // End of Class Main

