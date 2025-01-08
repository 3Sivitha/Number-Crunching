import java.util.*;
public class StrongNumber {
    public static int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int str=n;
        int rem,sum=0;
        while(n!=0){
            rem=n%10;
            sum+=fact(rem);
            n=n/10;
        }
        if(sum==str)
            System.out.println("Strong Number");
        else
            System.out.println("Not strong Number");

    }
}
