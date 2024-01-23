package de.telran.alg001;

import java.util.Arrays;

public class Main2searchDublicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,7,8};
        //povtChislo(arr);
        test1();
    }

    public static void povtChislo(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = (i+1); j < arr.length ; j++) {
//                if (arr[i]==arr[j]) System.out.println("Повторяется" + arr[i]);
//            }
//        }
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i < arr.length; i++) {
            sum+=i;
        } // 9 elements
        for (int i = 0; i < arr.length; i++) {
            sum2=sum2+arr[i];
        }
        System.out.println(sum2-sum);
        // 81 mal => 18 mal

//        HashSet<Integer> set1 = new HashSet<>();
//        Arrays.asList(arr);
    }

    public static void test1(){
        double[] arr = {5.1,5.1,5.1,5.1,5.1,3.0,4.3,2.25,1.05};
        double sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=arr[i];
        }
        if (sum==arr[0]*5){
            System.out.println("Erste 5 elementen sind GLEICH!");
        } else System.out.println("mimo...");

        if (Arrays.stream(arr)
                .limit(5)
                .distinct().count() == 1) System.out.println("Erste 5 elementen sind GLEICH!");


    }
}
