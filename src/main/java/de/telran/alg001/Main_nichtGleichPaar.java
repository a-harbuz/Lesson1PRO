package de.telran.alg001;

public class Main_nichtGleichPaar {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,0,2,6};
        for (int i = 0; i < (arr.length-1); i++) {
            for (int j = (i+1); j < arr.length ; j++) {
                System.out.println(arr[i] + " : " + arr[j]);
            }
        }
    }
}
