package de.telran.pro005Lambda;

public class Task11 {
//    int[][] matriza = {
//            {0,1,0,1},
//            {1,0,1,0},
//            {0,1,0,1},
//            {1,0,1,0}
//    };
    int[][] matriza = {
            {0, 2, 4, 0, 0},
            {0, 0, 1, 7, 0},
            {0, 0, 0, 2, 0},
            {0, 0, 0, 0, 3},
            {0, 0, 0, 0, 0}
    };
    int begin = 0;
    int end = 4;

    GraphProcessor floydWarshall = (matrix, start, end) -> {
        // Реализация алгоритма Флойда-Уоршелла для поиска кратчайшего пути
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[i][j];
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (result[i][k] != 0 && result[k][j] != 0 && (result[i][j] == 0 || result[i][j] > result[i][k] + result[k][j])) {
                        result[i][j] = result[i][k] + result[k][j];
                    }
                }
            }
        }

        return result;
    };


    // Находим кратчайший путь
    int[][] result = met(floydWarshall, matriza, begin, end);

    // Выводим результат
//        for (int[] row : result) {
//            for (int value : row) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }


    public static int[][] met(GraphProcessor graphprocessor, int[][] matriza, int begin, int end ){
        return graphprocessor.process(matriza, begin, end);
    }

}

//***для особо одаренных***
//        Создайте функциональный интерфейс GraphProcessor с методом process, который принимает матрицу
//        смежности графа и находит кратчайший путь между двумя вершинами (используя алгоритм Флойда-Уоршелла).
//        Напишите метод, который принимает матрицу смежности и вершины начала и конца, и GraphProcessor,
//        и возвращает результат операции.

@FunctionalInterface
interface GraphProcessor{
     public int[][] process (int[][] matriza, int begin,int end);
}

//Граф — это геометрическая фигура, которая состоит из точек и линий, которые их соединяют.
// Точки называют вершинами графа, а линии — ребрами. Два ребра называются смежными, если у них есть общая вершина.
// Два ребра называются кратными, если они соединяют одну и ту же пару вершин.

