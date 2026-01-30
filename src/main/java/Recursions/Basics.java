package Recursions;

public class Basics {
    static int printFact(int n) {
        if (n == 1 || n == 0) return 1;
        return n * printFact(n - 1);
    }
    static int printSum(int n){
        return n*(n+1)/2;
    }
    //print n natural numbers given n
    static void printNaturalNumbers(int n){
        if(n==0) {
            return ;
        }
        System.out.println(n);
         printNaturalNumbers(n-1);

    }

    public static void main(String[] args) {
//        int result = printFact(5);
//        System.out.println(result);
//        //12345
//        System.out.println(printSum(5)); //printSum(5);
        printNaturalNumbers(5);
    }
}
