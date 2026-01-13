//package LinkedList;
//
//public class LinkedList {
//
//    // Node class
//    class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    // head pointer (start of the list)
//    Node head;
//
//    // Add element at the end
//    public void add(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = newNode;
//    }
//
//    // Print linked list
//    public void print() {
//        Node temp = head;
//
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//
//        System.out.println("null");
//    }
//
//    // Test in main()
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        list.print();
//    }
//}
package LinkedList;

public class Linkedlist {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void add(int data){
        Node newNode= new Node(data);
        if(head==null){
          head= newNode;
          return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void printList(){
        Node temp =head;
        while(temp!=null){
            System.out.print("head->");
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlist linkedlist=new Linkedlist();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(50);
        linkedlist.add(60);
        linkedlist.printList();
    }
}
