package Arrays;

public class RemoveDuplicates2 {
    static void main() {
        int arr[] = {1, 2, 3, 4, 4, 5, 6, 6};
        int n = arr.length;

        int index = 0; // position for unique elements

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[index++] = arr[i];
            }
        }

        // last element is always unique
        arr[index++] = arr[n - 1];

        // print only unique elements
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
