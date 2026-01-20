package Queue;

public class LLImplementationOfQueue {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;
    static Node tail = head;

    public void add(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void remove() {
        head = head.next;
    }

//    public Node peek(){
//
//    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        LLImplementationOfQueue q = new LLImplementationOfQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.display();
        q.remove();
        System.out.println();
        q.display();
    }
}
