package Arrays;

public class printAllSubArray {
    public static void main(String[] args) {
        //total subarrays in an array is n*(n+1)/2
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();

    }

}
