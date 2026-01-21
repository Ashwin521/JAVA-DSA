package Sorting;

public class SelectionSort {
    static void main() {
        int[] arr = {21, 3, 12, 32, 12, 13, 4};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    }
