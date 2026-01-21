package Arrays;

public class LongestCommonPreffix {
    public static boolean main(String[] args) {
        String[] arr={"flower","flight","flow"};
        for (int i=0;i<arr.length;i++){
            if(arr[i].contains("fl")) return true;
            return false;
        }
        return false;
    }
}

