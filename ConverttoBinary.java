import java.util.*;
public class ConverttoBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem;
        int rev=0;
        int pv=1;
        while(n!=0){
            rem=n%2;
            n=n/2;
            rev=rem*pv+rev;
            pv*=10;
        }
        System.out.println(rev);
    }
}
