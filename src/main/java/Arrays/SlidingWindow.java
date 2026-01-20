package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args) {
       int arr[]={1,2,3,54,3,2,32};
       int n=arr.length;
       int k=3;
       int sum=0;
       for (int i=0;i<k;i++){
           sum+=arr[i];

       }
        System.out.println(sum);
       for (int i=k;i<n;i++){
           sum+=arr[i]-arr[i-k];
       }
        System.out.println(sum);

















//        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        //lets reverse the Array
//        int i=0;
//        int j=arr.length-1;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            j--;
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));

        //
//        List<Integer> arr2=new ArrayList<>();
//        arr2.add(3);
//        arr2.add(2);
//        arr2.add(12);
//        arr2.add(15);
//        System.out.println(arr2);
//        int i=0;
//        while(i<arr.length){
//            System.out.print(arr[i]+" ");
//            i++;
//        }
    }
}
