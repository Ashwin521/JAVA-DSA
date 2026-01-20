package Queue;

public class circularyQueueArray {

    public static class CQueueArray {
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[8];
        int n = arr.length;

        public void add(int val) throws Exception {
            if (size == n) {
                throw new Exception("Queue is full");

            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;


            } else if (rear < n - 1) {
                arr[++rear] = val;

            } else if (rear == n - 1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {

                throw new Exception("Queue is empty");
            } else {
                int val = arr[front];
                if (front == n - 1) {
                    front = 0;
                } else front++;
                size--;

                return val;
            }
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            } else return arr[front];

        }

        public boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }

        public void display() {
            if (size == 0) System.out.println("Queue is empty");
            else if (front < rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {//rear<front
                for (int i = front; i < n; i++) {
                    System.out.print(arr[i] + " ");

                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");

                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        CQueueArray q = new CQueueArray();
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.remove();
        q.display();
    }
}
