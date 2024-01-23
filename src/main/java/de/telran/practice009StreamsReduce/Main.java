package de.telran.practice009StreamsReduce;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //REDUCE

//        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
//        System.out.println(
//                stream1.mapToInt(Integer::intValue)
//                .sum()
//        );

        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(
                list1.stream().mapToInt(Integer::intValue)
                .sum()
        );

        //v1
        // ИСПОЛЬЗОВАНИЕ С НАЧАЛЬНОГО(0) ЭЛЕМЕНТА !!!
        list1.stream().reduce((p1,p2)->p1+p2) //=> Optional
                .get(); //.orElse(0);
        //v2
        list1.stream().reduce((p1,p2)->p1*p2) //=> Optional
                .orElse(0);
        //v3
        //identity:>> sum=0;
        int sum=0;
//        for (int el: list1) {
//            sum+=el;
//        }

        // ИСПОЛЬЗОВАНИЕ НЕ С НАЧАЛЬНОГО ЭЛЕМЕНТА !!!
        int sum1 = list1.stream().reduce(sum, (p1,p2)->p1+p2);
        //int sum1 = list1.stream().reduce(sum, Integer::sum);
        System.out.println(sum1);
        //v4
        System.out.println("//v4");
        sum = list1.stream().reduce(0,(p1,p2)->p1+p2, (s1,s2)->s1+s2);
        //1-Accumulator, 2-Combiner
        //reduce(0, - начальное значение, с чем аккумулировать в начале
        //на обычном стриме Комбинер не отработает, т.к. нету параллельного стрима
        System.out.println(sum);

        sum = list1.parallelStream().reduce(0,(p1,p2)->p1+p2, (s1,s2)->s1+s2);
        //Работает ПаралельныйСтрим и Комбинер
        //т.е. Комбинер работает только на parallelStream()
        System.out.println(sum);

    }



}
