package Stacks;

import java.util.Stack;

public class insertAtBottom {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        //pehle stack ko  khali kar dena hai aur uske data ko new stack me daalna hai
        // uske baad purane wale stack me value push karni hai phir wapas
        // se us data ko pehle wale stack me daal dena hai



        Stack<Integer> temp = new Stack<>();
        while (st.size() > 0) {
            temp.push(st.pop());
        }
        st.push(0);
        System.out.println(temp);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
