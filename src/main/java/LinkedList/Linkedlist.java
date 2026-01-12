package LinkedList;

public class Linkedlist {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head pointer (start of the list)
    Node head;

    // Add element at the end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Print linked list
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Test in main()
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.add(10);
        list.add(20);
        list.add(30);

        list.print();
    }
}
