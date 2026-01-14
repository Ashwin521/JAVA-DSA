package DoublyLL;

public class DoublyLinkedList {
    public static class Node {
        int val;
        Node next = null;
        Node prev = null;

        Node(int val) {
            this.val = val;
        }

    }

    //    public static Node head;
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void displayRev(Node tail) {
        Node temp = tail;
        while (temp != null) {

            System.out.print(temp.val + " ");
            temp = temp.prev;
        }



    }
//random node is given and we have to print all nodes from start to end
    public static void display2(Node random) {
        Node temp =random;
        while (temp.prev != null) {

//            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
        //now temp is at head position
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }



    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
//        display(a);
//        displayRev(e);
        display2(c);

    }
}
