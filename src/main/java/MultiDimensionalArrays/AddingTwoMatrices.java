package MultiDimensionalArrays;

import java.util.Scanner;

public class AddingTwoMatrices {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    static void addArray(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Dimensions are not equal");
            return;
        }
        int sum[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr2[i][j] + arr1[i][j];
            }
        }
printArray(sum);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of rows and columns for matrix 1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("number of rows and columns for matrix 2");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int[][] b=new int[r2][c2];
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix a: ");
        printArray(a);

        System.out.println("Matrix b: ");
        printArray(b);

        System.out.println("Addition of matrix and b");
        addArray(a,r1,c1,b,r2,c2);

    }
}
