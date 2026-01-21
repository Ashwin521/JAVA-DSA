package Sorting;

public class BubbleSort {
    static void main() {
        int[] arr={21,3,12,32,12,13,4};
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
