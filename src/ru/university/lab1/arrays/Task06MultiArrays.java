package ru.university.lab1.arrays;
public class Task06MultiArrays {
    public void run() {
        int[][] m = { {1, 2, 3}, {4, 5, 6} };

        System.out.println("Исходная матрица:");
        printMatrix(m);

        System.out.println("Транспонированная:");
        printMatrix(transpose(m));

        int[][] a = { {1, 2}, {3, 4} };
        int[][] b = { {5, 6}, {7, 8} };

        System.out.println("Умножение матриц:");
        printMatrix(multiply(a, b));
    }

    private void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    private int[][] transpose(int[][] m) {
        int[][] res = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                res[j][i] = m[i][j];
            }
        }
        return res;
    }

    private int[][] multiply(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            System.out.println("Ошибка: матрицы не согласованы!");
            return null;
        }
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }
}