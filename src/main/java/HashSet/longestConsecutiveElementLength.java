package HashSet;

import java.util.HashSet;

public class longestConsecutiveElementLength {
    // We are given an array we have to find the length of longest consecutive element
    // Example: 1 2 3 100 101 200 -> longest = 1,2,3 so answer = 3

    public int longestSequence(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        // insert all numbers in hashset
        for (int num : arr) {
            hs.add(num);
        }

        int maxLength = 0;

        for (int num : hs) {
            // check if current number is the start of sequence
            if (!hs.contains(num - 1)) {
                int curNum = num;
                int currLength = 1;

                // count sequence length
                while (hs.contains(curNum + 1)) {
                    currLength++;
                    curNum++;
                }

                maxLength = Math.max(currLength, maxLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 101, 1, 2, 3, 4, 5};

        // create object
        longestConsecutiveElementLength obj = new longestConsecutiveElementLength();
        int ans = obj.longestSequence(arr);

        System.out.println("Longest consecutive sequence length = " + ans);
    }
}
