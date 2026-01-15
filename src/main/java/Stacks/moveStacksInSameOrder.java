package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class moveStacksInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        //stack ko reverse karna reverse ke liye new stack hoga
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Stack<Integer> rev = new Stack<>();
        Stack<Integer> copied=new Stack<>();
        while (st.size() > 0) {
//            int x = st.peek();
//            rev.push(x);
//            st.pop();
//            or instead of 3 lines we can simply do
        rev.push(st.pop());
        }
        while(rev.size()>0){
            copied.push(rev.pop());
        }

        System.out.println(rev);
        System.out.println(copied);


        //stack ke data ko user se input me lena
//        System.out.println("Enter the number of elements you want to add in stack: ");
//        int n=sc.nextInt();
//        System.out.println("Enter the elements: ");
//        for (int i=1;i<=n;i++){
//            int x=sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);

    }
}
