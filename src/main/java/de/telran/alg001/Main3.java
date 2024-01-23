package de.telran.alg001;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {1,10,5,4,3,7,8,6,2,9,0};
        //twoPairs(arr, 10);
        //threePairs(arr, 10);

//        int[] arr1 = {1,0,0,1,1,0,0,0,1};
//        System.out.println(Arrays.toString(zeroOne(arr1)));
        int[] arr2 = {1,0,0,1,1,2,2,0,1};
        System.out.println(Arrays.toString(zeroOneTwo(arr2)));

    }

    public static void twoPairs (int[] arr, int a){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((arr[i]+arr[j])==a)
                    System.out.println(arr[i]+" : "+arr[j]);
            }
        }
        System.out.println("============");

        int[] z={1};
        Arrays.stream(arr).limit(arr.length-1).forEach(i->
                        //z[0]++;
                        Arrays.stream(arr).skip(z[0]++).forEach(j->{
                            if ((i+j)==a) System.out.println(arr[i]+" : "+arr[j]);
                        }));



    }
    public static void threePairs (int[] arr, int a){
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i; j < arr.length-1; j++) {
                for (int k = j; k < arr.length; k++) {
                    if ((arr[i]+arr[j]+arr[k])==a)
                        System.out.println(i+":"+j+":"+k);
                }
            }
        }
    }

//    public static int[] zeroOne (int[] arr) {
////        int[] arrtmp = new int[arr.length];
////        for (int i = 0; i < arr.length; i++) {
////            if (arr[i] == 0) arrtmp[i] = arr[i];
////            if (arr[i] == 1) arrtmp[arr.length-1-i] = arr[i];
////        }
////        return arrtmp;
//
//        int countzero=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0) countzero++;
//        }
//        for (int i = 0; i < countzero; i++) {
//            arr[i]=0;
//        }
//        for (int i = countzero; i < arr.length; i++) {
//            arr[i]=1;
//        }
//        return arr;
//    }
    public static int[] zeroOneTwo (int[] arr) {
        int counzero=0;
        int counone=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) counzero++;
            else if (arr[i]==1) counone++;
        }
        for (int i = 0; i < counzero; i++) {
            arr[i]=0;
        }
        for (int i = counzero; i < counzero+counone; i++) {
            arr[i]=1;
        }
        for (int i = counzero+counone; i < arr.length; i++) {
            arr[i]=2;
        }
        return arr;
    }

}
