package Recursions;

public class PrintMultiples {
    static void printMulitples(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        printMulitples(n, k - 1);
        System.out.println(n * k);
    }


    public static void main(String[] args) {
        printMulitples(12, 5);
    }
}
