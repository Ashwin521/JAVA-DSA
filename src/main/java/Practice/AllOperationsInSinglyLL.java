package Practice;

public class AllOperationsInSinglyLL {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at head
    public void addAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void addAtEnd(int data) {
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

    // Print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        //first ke next ko head pe point karwa denge
        if (head == null) {
            System.out.println("No node to delete,list is empty");
            return;
        }
        head = head.next;


    }

    public void deleteLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteLastNode() {
        Node temp = head;
        Node lastNode = head.next;
        Node secondLastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public static void main(String[] args) {
        AllOperationsInSinglyLL list = new AllOperationsInSinglyLL();

        list.addAtEnd(13);
        list.addAtEnd(14);
//        list.deleteFirst();
//        list.addAtHead(12);
//        list.addAtHead(11);
        list.deleteLastNode();
        list.printList();  // Output: 11 -> 12 -> 13 -> 14 -> null
    }
}
