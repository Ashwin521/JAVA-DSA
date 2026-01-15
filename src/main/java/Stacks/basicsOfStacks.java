package Stacks;

import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        System.out.println(st);
        System.out.println(st.peek());
        while (st.size()>1){
            st.pop();
        }
        System.out.println(st);
    }
}
