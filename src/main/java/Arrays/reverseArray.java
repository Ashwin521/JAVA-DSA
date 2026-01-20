package Arrays;

import java.util.Arrays;
import java.util.Stack;

public class reverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
//        Stack<Integer> st = new Stack<>();
//        System.out.println(arr.length);
        int n =arr.length;
        int i=0;
        int j =n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
