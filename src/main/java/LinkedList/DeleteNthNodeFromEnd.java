package LinkedList;

public class DeleteNthNodeFromEnd {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    public static void deleteNthFromEnd(Node head, int index) {
        Node fast = head;
        Node slow = head;

        // Move fast pointer 'index' steps
        for (int i = 1; i <= index; i++) {
            if (fast == null) return; // index > length
            fast = fast.next;
        }

        // If fast becomes null, delete head (nth from end = head)
        if (fast == null) {
            DeleteNthNodeFromEnd.head = head.next;
            return;
        }

        // Move both pointers until fast reaches last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the target node
        slow.next = slow.next.next;
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        head = a;

        printList();                // Output: 10->20->30->40->50->null
        deleteNthFromEnd(head, 5);  // Delete 2nd from end => Delete 40
        printList();                // Output: 10->20->30->50->null
    }
}
