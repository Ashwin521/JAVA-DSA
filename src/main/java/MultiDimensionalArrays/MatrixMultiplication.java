package MultiDimensionalArrays;

import java.util.Scanner;

public class MatrixMultiplication {

    // Print matrix properly
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplyMatrices(int[][] arr1, int r1, int c1,
                                 int[][] arr2, int r2, int c2) {

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        printArray(mul);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for matrix A:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns for matrix B:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix A:");
        printArray(a);

        System.out.println("Matrix B:");
        printArray(b);

        multiplyMatrices(a, r1, c1, b, r2, c2);
    }
}
