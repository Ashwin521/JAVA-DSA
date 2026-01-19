package Stacks;

public class linkedListImplementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Stack {
        private Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        void getSize() {
            System.out.println(size);
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;

        }

        int peek() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;

        }

        boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(13);
        st.pop();

        st.getSize();
        st.display();

    }
}
