package DeletionInLinkedList;

public class DeleteAtHead {
    class Node {
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
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteAtHead() {
            if(head==null){
                System.out.println("empty linked list");
                return;
            }
            head=head.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }


    public static void main(String[] args) {
        DeleteAtHead l1 = new DeleteAtHead();
        l1.add(10);
        l1.add(20);
        l1.deleteAtHead();
        l1.printList();
    }

}
