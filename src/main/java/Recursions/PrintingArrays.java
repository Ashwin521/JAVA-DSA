package Recursions;

public class PrintingArrays {
    static void printArray(int[] arr, int i) {
        int n = arr.length;
        if (i == n) return;
        System.out.println(arr[i]);

        printArray(arr, i + 1);
    }

    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    printArray(arr,0);
    }
}
