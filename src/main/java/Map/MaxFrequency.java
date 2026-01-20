package Map;

import Temp.HashSt;

import java.util.*;

public class MaxFrequency {
    public static void main(String[] args) {
        Map<Integer,Integer> hm=new HashMap<>();
        //calculate the max frequency of an element inside an array
        int[] arr={2,3,2,4,5,3,2,5,6,7,5,65,5,7,5,4,3,2,2};
        for (int e:arr){
            if(!hm.containsKey(e)){
                hm.put(e,1);
            }
            else{
                hm.put(e,hm.get(e)+1);
            }
        }
        System.out.println(hm.entrySet());
    }

}
