package de.telran.pro003MapCompareto;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class Task9 {
//    9**Создайте HashMap<String, List<Integer>>, где ключ - это имя, а значение - список оценок.
//    Используйте TreeMap<Integer, List<String>> для создания отображения
//    "средняя оценка - список студентов с этой оценкой".

    public static void main(String[] args) {

        HashMap<String, List<Integer>> hashmap1 = new HashMap<String, List<Integer>>();
        hashmap1.put("Vasja", new ArrayList<>(Arrays.asList(2,3,4,5,6)));
        hashmap1.put("Prtya", new ArrayList<>(Arrays.asList(9,3,4,7,6)));
        hashmap1.put("Kolya", new ArrayList<>(Arrays.asList(12,10,5,5,6)));
        hashmap1.put("Jana", new ArrayList<>(Arrays.asList(2,3,4,5,6)));
        hashmap1.put("Olya", new ArrayList<>(Arrays.asList(12,10,5,5,6)));

        TreeMap<Integer, List<String>> treemap1 = new TreeMap<>();

        for (Map.Entry<String, List<Integer>> pairs : hashmap1.entrySet()){
            int i=0;
            int midlNum = 0;
            for (Integer elem: pairs.getValue()) {
                midlNum+=elem;
                i++;
            }
            midlNum = midlNum / i; //Srednaja Otsenka
            String person = pairs.getKey();

            if (treemap1.containsKey(midlNum)){
                //System.out.println(treemap1.get(midlNum));
                List<String> tmplist = treemap1.get(midlNum);
                tmplist.add(person);
                treemap1.put(midlNum, tmplist);
            } else {
                treemap1.put(midlNum,new ArrayList<>(Collections.singletonList(person)));
            }

        }
        System.out.println(treemap1);

    }


}
