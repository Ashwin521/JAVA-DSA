package Recursions;

public class PowerPQ {
    static  int power(int p,int q){
        //p^q if q=2 so we have to multiply p q times
        //ans=p*p
        //base case
        if(q==0) return 1;
        return p*power(p,q-1);//-1 because p and q are given by default both have power of 1
        //so we have to calculate p^q means p^1=p^q-1
    }


    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
