package Queue;

public class arrayImplementationOfQueue {

    public static class queueArray {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("queue is full");
                return;
            }

            if (f == -1) {
                // first element
                f = r = 0;
                arr[0] = val;
            } else {
                arr[++r] = val;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int x = arr[f];
            f++;   // correctly move front forward
            size--;

            if (size == 0) {
                // reset front & rear
                f = r = -1;
            }
            return x;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[f];
        }
    }

    public static void main(String[] args) {
        queueArray q = new queueArray();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove()); // 10
        System.out.println(q.peek());   // 20

        q.add(40);
        q.add(50);
        q.add(60); // queue full (since 5 size)
    }
}
