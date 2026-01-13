package DeletionInLinkedList;

public class DeleteByValue {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

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

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteNodeByValue(int value) {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DeleteByValue obj = new DeleteByValue();
        obj.add(20);
        obj.add(21);
        obj.insertAtHead(10);
        obj.deleteNodeByValue(10);
        obj.print();
    }
}
