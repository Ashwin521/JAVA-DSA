package MultiDimensionalArrays;

import java.util.Scanner;

public class RotateMatrix {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][] matrix, int n) {//square matrix hai to r and c same hai
        //here 90 deg rotaion
        //first get the transpose
        transposeInPlace(matrix, n, n);
        //second reverse each row of the transpose
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for matrix A:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printArray(matrix);

        rotate(matrix, r);
//        int ans[][] = findTranspose(matrix, r, c);
//       printArray(ans);
        System.out.println("Rotated matrix");
        printArray(matrix);

    }
}
