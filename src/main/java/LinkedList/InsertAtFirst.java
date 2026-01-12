package LinkedList;

public class InsertAtFirst {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "->" + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtFirst first = new InsertAtFirst();
        first.insertAtBeginning(10);
        first.insertAtBeginning(20);
        first.insertAtBeginning(30);
        first.insertAtBeginning(40);
        first.printList();

    }
}
