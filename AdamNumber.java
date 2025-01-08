import java.util.*;
public class AdamNumber {
    public static int reverse(int n){
        int rev=0;
        int rem;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static int sqr(int n){
        return n*n;
    }
    public static void checksum(int n1,int n2){
        if(n1==n2)
            System.out.println("Adam Number");
        else
            System.out.println("Not Adam Number");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=reverse(n1);
        int n1sqr=sqr(n1);
        int n2sqr=sqr(n2);
        int n2revsqr=reverse(n2sqr);
        checksum(n1sqr,n2revsqr);
    }
}
