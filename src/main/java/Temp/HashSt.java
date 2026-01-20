package Temp;

import java.util.HashSet;

public class HashSt {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        System.out.println(st);
        st.add(4);
        System.out.println(st);
        System.out.println(st.contains(6));
        System.out.println(st.contains(3));
        st.remove(3);
        System.out.println(st);

    }
}
