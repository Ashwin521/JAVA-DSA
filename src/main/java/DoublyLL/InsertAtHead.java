package DoublyLL;

public class InsertAtHead {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

    }

    static Node head;
    static Node tail;

    static public void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    static public void insertAtTail(int val) {

        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    static public void insertAtAnyIndex(int index, int data) {
        Node s = head;
        for (int i = 0; i < index - 1; i++) {
            s = s.next;

        }
        //s is at index-1
        Node r = s.next;
        Node t = new Node(data);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    static public void printList() {
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        System.out.print("null <-> ");

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-> ");

            temp = temp.next;

        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        insertAtHead(10);
        insertAtHead(20);
        insertAtTail(40);


//        null <-> 20<-> 10<-> 40<-> null
        insertAtAnyIndex(1, 30);
        printList();
    }


}
