package de.telran.pro005Lambda;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {4,3,2,1},
                {1,1,2,2},
                {3,3,4,4}
        };
        int[][] rotate = rotator((mat) -> {
            int[][] newmat = new int[mat.length][mat.length];
            for (int j = 0; j < mat.length; j++) {
                for (int i = 0; i < mat[j].length; i++) {
                    newmat[i][j] = mat[j][i];
                }
            }
            return newmat;
        }, matrix);

        // sout
        for (int j = 0; j < rotate.length; j++) {
            for (int i = 0; i < rotate[j].length; i++) {
                System.out.print(rotate[j][i]);
            }
            System.out.println();
        }

    }

    public static int[][] rotator(MatrixProcessor matrixprocessor, int[][] matr){
        return matrixprocessor.process(matr);
    }
}

//    Создайте функциональный интерфейс MatrixProcessor с методом process, который принимает
//        двумерный массив (матрицу) целых чисел и выполняет над ним операцию.
//        Напишите метод, который принимает матрицу и MatrixProcessor, и выполняет операцию нахождения транспонированной матрицы.

@FunctionalInterface
interface MatrixProcessor{
    int[][] process (int[][] matrix);
}