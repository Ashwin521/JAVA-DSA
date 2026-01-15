package LinkedList;

public class Median {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node head;
    static void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        System.out.println(" ");
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        head = a;
        printLL();
    }
}
