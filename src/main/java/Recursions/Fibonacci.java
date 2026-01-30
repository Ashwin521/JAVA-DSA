package Recursions;

public class Fibonacci {
    static int calcFibo(int n) {
        if (n == 0 || n == 1) return n;

        return calcFibo(n - 1) +calcFibo (n - 2);


    }

    public static void main(String[] args) {
        //fibonacci series
        //0 1 1 2 3 5 8 13 21 34 55 89
        for (int i=0;i<12;i++){
            System.out.println(calcFibo(i));
        }
//        System.out.println(calcFibo(12));
    }
}
