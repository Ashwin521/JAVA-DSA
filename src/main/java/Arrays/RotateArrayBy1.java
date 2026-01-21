package Arrays;

public class RotateArrayBy1 {
    public static void main() {

        //left rotation by 1
//        int arr[]={1,2,3,4,5};
//            //     i j
//        //expected output {2,3,4,5,1}
//        int n =arr.length;
//        int first=arr[0];
//
//        for (int i=0;i<n-1;i++){
//            arr[i]=arr[i+1];
//        }
//        arr[n-1]=first;
//
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        //Right rotating the array by 1
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //expected output {4,5,1,2,3}
        int n = arr.length;
        int k = 5;
        k = k % n;
        //to be placed at 0th index after rotation
        for (int j = 0; j < k; j++) {
            int first = arr[n - 1];
            for (int i = n - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = first;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
