package HashSet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetPrac {
    public static void main(String[] args) {
        HashSet<int[]> hs=new HashSet<>();
        int[] arr={1,2,3,4,5};
        hs.add(arr);
        for (int[] a:hs){
            System.out.println(Arrays.toString(a));
        }
        HashSet<String> ht=new HashSet<>();
        ht.add("Ashwin");
        ht.add("Abhishek");
        ht.add("Mark");
        ht.add("Scott");
        for (String s:ht){
            System.out.println(s);
        }

    }
}
