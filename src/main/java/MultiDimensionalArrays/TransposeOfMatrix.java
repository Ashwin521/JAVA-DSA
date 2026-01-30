package MultiDimensionalArrays;

import java.util.Scanner;

class TransposeOfMatrix {
    static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
static void transposeInPlace(int[][] matrix,int r,int c){
    for (int i = 0; i < c; i++) {
        for (int j = i; j < r; j++) {
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }
}
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for matrix A:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter" + totalElements + "values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printArray(matrix);
        System.out.println("Transpose matrix");
        transposeInPlace(matrix,r,c);
        printArray(matrix);
//        int ans[][] = findTranspose(matrix, r, c);
//       printArray(ans);


    }
}