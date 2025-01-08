import java.util.*;
public class MagicNumber {
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
    public static int reversesum(int n){
        int sum=0;
        int rem;
        while(n!=0){
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=reverse(n);
        int m=n*n1;
        int n2=reversesum(m);
        if(n==n2)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }
}
