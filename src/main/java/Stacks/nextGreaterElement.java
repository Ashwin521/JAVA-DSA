package Stacks;

import java.util.Stack;

public class nextGreaterElement {
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
//        int[] res = new int[arr.length];
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            res[i] = -1;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] > arr[i]) {
//                    res[i] = arr[j];
//                    break;
//                }
//            }
//
//
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(res[i]);
//        }
//
//    }//but this method takes more time O(N2)

    //using stacks
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.push(arr[n - 1]);
        res[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
            else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
//        3 8 8 8 -1-1 4 -1

//        Process finished with exit code 0
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");
        }

    }
}
