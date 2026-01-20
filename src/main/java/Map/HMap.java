package Map;

import java.util.*;

public class HMap {
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap();
        hm.put("Ashwin",22);
        hm.put("Sachin",21);
//        System.out.println(hm);
//        System.out.println(hm.get("Ashwin"));
//        System.out.println(hm.get("Sachin"));
        hm.putIfAbsent("Jitu",23);
//        System.out.println(hm);
//        System.out.println(hm.keySet());
//        System.out.println(hm.values());
//        System.out.println("all key values "+hm.entrySet());

        //traverse the hashmap
        for (String key:hm.keySet()){
            System.out.printf("Age of %s is %d\n",key,hm.get(key));

        }
        System.out.println();
        for (Map.Entry<String,Integer> e:hm.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}
