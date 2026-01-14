package LinkedList;

public class NthNodeFromEnd {
    public static Node nthNode(Node head,int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-n+1;
        temp=head;
        for(int i=1;i<n-1;i++){
            temp=temp.next;
        }
        return temp;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(23);
        Node c = new Node(43);
        Node d = new Node(12);
        Node e = new Node(75);
        Node f = new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        Node q =nthNode(a,4);
        System.out.println(q.data);


    }
}
