package Map;

import java.util.HashMap;

public class ValidAnagram {
    //checking two string whether they are anagrams or not
    //eg listen and silent ,ten and net

    static HashMap<Character, Integer> makeFrequnecyMap(String a) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            Character ch = a.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq + 1);
            }

        }
        return mp;
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        HashMap<Character, Integer> map1 = makeFrequnecyMap(a);
        HashMap<Character, Integer> map2 = makeFrequnecyMap(b);

        return map1.equals(map2);

    }


}
