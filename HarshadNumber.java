import java.util.*;
public class HarshadNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        n=temp;
        if(n%sum==0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}
