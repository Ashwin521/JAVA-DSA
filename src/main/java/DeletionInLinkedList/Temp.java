package DeletionInLinkedList;

public class Temp {

    static class Node {
        int data;
        Node next;

        Node(int data) {
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
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }



    public static void main(String[] args) {
        Temp.Node obj = new Temp.Node(2);
//        System.out.println(obj.next);
        Temp.Node head = new Temp.Node(3);
        head.next = new Node(30);
        System.out.println("Head" + " " + head);
        System.out.println(head.next.data);
    }
}
