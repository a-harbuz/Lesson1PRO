package de.telran.pro008tstLogik;

import java.util.List;

public class Chess {
    private static int kingX=0;
    private static int kingY=0;
    public static void main(String[] args) {
        int [][] arr = {{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,1}};
        //arr[2][3]=2;
        System.out.println(arr[2][3]);

    }

    public static List<int[][]> attack(int[][] kingCoordinate, int[][] queens) {
        int[][] arr = new int[queens.length][queens[0].length];

        for (int i = 0; i < kingCoordinate.length; i++) {
            for (int j = 0; j < kingCoordinate[i].length; j++) {
                if (kingCoordinate[i][j]==1){
                    kingX=j;
                    kingY=i;
                }
            }
        }

        //arr.length);   // => Строк
        //arr[0].length);   // => Колонок
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens[i].length; j++) {
                if (queens[i][j]==1){
                    if (kingX==j || kingY==i) arr[i][j]=1;
                    if (checkDiagonal(queens,i,j)) arr[i][j]=1;
                }

            }
        }

        //check diagonal


        return null;
    }

    public static boolean checkDiagonal(int[][] queens, int checki, int checkj){
        int y = checki++;
        int x = checkj++;
        while (checki < queens.length) {
            if (kingX==x || kingY==y) {
                return true;
            }
            y++;
            x++;
        }

        //повторит для каждого направления

        return false;
    }

}
