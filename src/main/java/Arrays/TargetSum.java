package Arrays;

public class TargetSum {
    public static int ans = 0;
    static public int pairSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i ; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
return ans;
    }

    public static void main(String[] args) {
        int[] arr={21,32,1,3,2,12};
pairSum(arr,13);
        System.out.println(ans);
    }
}
