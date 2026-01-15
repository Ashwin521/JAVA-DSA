package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class insertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //now we will take the input the index where we want to add the data
        //and we will also take the data to be added as input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index where you want to add the data: ");
        int index=sc.nextInt();
        System.out.println("Enter the data to be inserted: ");
        int data=sc.nextInt();
        Stack<Integer> temp = new Stack<>();
        while(st.size()>index){
            temp.push(st.pop());
        }
        st.push(data);
        System.out.println(temp);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println("After inserting stack becomes: "+st);
    }
}
