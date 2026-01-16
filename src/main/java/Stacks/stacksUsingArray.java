package Stacks;


class stacksUsingArray {
  public   static class Stack {
        private int arr[] = new int[5];
        private int index = 0;

        void push(int n) {
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[index] = n;
            index++;
        }
        int size(){
            return index;
        }

        int peek(){
            if(index==0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[index-1];

        }

        int pop(){
            if(index==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top=arr[index-1];
            arr[index-1]=0;//default values in java for an array is a 0
            index--;
           return top;
        }

         void display() {
            for (int i = 0; i< index; i++) {
                System.out.println(arr[i]);
            }
        }

        boolean isEmpty(){
            if(size()==0) return true;
            else return false;
      }
      boolean isFull(){
            if(index==arr.length) return true;
            else return false;
      }

    }


    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.display();
    }
}