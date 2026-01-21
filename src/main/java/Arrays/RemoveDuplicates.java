package Arrays;

public class RemoveDuplicates {
    static public int removeElement(int[] arr, int val) {
        int n = arr.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        return k;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 33, 45, 33, 32, 33, 4, 2};
        removeElement(arr, 33);
    }
}
